
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class RegistrationMgr {
    private ArrayList<PatientEntity> patList;
    private String infoLine;
    private ArrayList<DoctorEntity> docList;
    private String infoLine1;
    

        public RegistrationMgr(){
        
        patList=new ArrayList<>();
        docList = new ArrayList<>();
      	readFilePat();
        
      
    }

    RegistrationMgr(AppointmentMgr aThis) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
 
         private void readFilePat(){
        try(FileReader file = new FileReader("patient.txt");
            BufferedReader reader = new BufferedReader(file)){
            //ignore first line
            infoLine = reader.readLine();
            String oneLine;
            while((oneLine = reader.readLine()) != null){
                if(oneLine.equals("")) continue;
                patList.add(new PatientEntity(oneLine));
            }
           
        }
        
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    //System.out.println(docList.get(0));
    }        
         
         private void readFileDoc(){
        try(FileReader file = new FileReader("Doctor.txt");
            BufferedReader reader = new BufferedReader(file)){
            //ignore first line
            infoLine1 = reader.readLine();
            String oneLine;
            while((oneLine = reader.readLine()) != null){
                if(oneLine.equals("")) continue;
                docList.add(new DoctorEntity(oneLine));
            }
           
        }
        
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    //System.out.println(docList.get(0));
    }        
         
         
    public int RegisteredById(String id){
        for(DoctorEntity store : docList)
            //return store;
            //System.out.println(store[0]);
            if(store.getId().equals(id)){
		
		
		return 0;
	
	
	
	}
                
        return 1;
    }
    
    public int RegistedByName(String name){
        for(PatientEntity store : patList)
            //return store;
            //System.out.println(store[0]);
            if(store.getPatientName().equals(name)){
		
		
		return 0;
	
	
	
	}
                
        return 1;
    }

 public String saveInfo1(String firstname,String pass,String email,String phnnumber,String gender,String age){


try (FileWriter f = new FileWriter("patient.txt", true);
                            BufferedWriter b = new BufferedWriter(f);
                            PrintWriter p = new PrintWriter(b);){

   
   
                        p.print("");
                        p.println(firstname + ";" + pass+ ";" + phnnumber +";" + email+ ";"  + gender+";"+age  );
                        
   


                       } catch (IOException i) {
                       i.printStackTrace(); }
        return null;
                   
    }
 
 public String saveInfo2(String firstname,String lastname,String email,String phnnumber,String gender,String age){


try (FileWriter f = new FileWriter("Doctor.txt", true);
                            BufferedWriter b = new BufferedWriter(f);
                            PrintWriter p = new PrintWriter(b);){

   
   
                        p.print("");
                        p.println(firstname + " " + lastname+ " " + email +"" + phnnumber+ ""  + gender+""+age  );
                        
   


                       } catch (IOException i) {
                       i.printStackTrace(); }
        return null;
                   
    }



}