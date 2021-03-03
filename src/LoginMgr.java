
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
 * @author Aakash
 */
public class LoginMgr {
    private ArrayList<PatientEntity1> patList;
    private ArrayList<LoggedEntity> logList;
    private ArrayList<DoctorEntity> docList;
    private ArrayList<LoggedDocEntity>docLog;
    private String infoLine;
    private String infoLine1;
    private String infoLine2;
    private String infoLine3;
    
        public LoginMgr(){
        
        patList=new ArrayList<>();
        logList=new ArrayList<>();
        docList = new ArrayList<>();
        docLog=new ArrayList<>();
      	readFilePat();
        readFileLogged();
        readFileDoc();
        readFileLoggedDoc();
    }

    LoginMgr(AppointmentMgr aThis) {
        ///throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
  private void readFilePat(){
        try(FileReader file = new FileReader("patient.txt");
            BufferedReader reader = new BufferedReader(file)){
            //ignore first line
            infoLine = reader.readLine();
            String oneLine;
            while((oneLine = reader.readLine()) != null){
                if(oneLine.equals("")) continue;
                patList.add(new PatientEntity1(oneLine));
            }
           
        }
        
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    //System.out.println(docList.get(0));
    } 
  
  private void readFileLogged(){
        try(FileReader file = new FileReader("Loged in.txt");
            BufferedReader reader = new BufferedReader(file)){
            //ignore first line
            infoLine1 = reader.readLine();
            String oneLine;
            while((oneLine = reader.readLine()) != null){
                if(oneLine.equals("")) continue;
                logList.add(new LoggedEntity(oneLine));
            }
           
        }
        
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    //System.out.println(docList.get(0));
    }  
  
  
    private void readFileLoggedDoc(){
        try(FileReader file = new FileReader("LoggedDoc.txt");
            BufferedReader reader = new BufferedReader(file)){
            //ignore first line
            infoLine3 = reader.readLine();
            String oneLine;
            while((oneLine = reader.readLine()) != null){
                if(oneLine.equals("")) continue;
                docLog.add(new LoggedDocEntity(oneLine));
            }
           
        }
        
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    //System.out.println(docList.get(0));
    }
  
  
    private void readFileDoc(){
        try(FileReader file = new FileReader("doctor.txt");
            BufferedReader reader = new BufferedReader(file)){
            //ignore first line
            infoLine2 = reader.readLine();
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
    
    public String LogPat1() {
        String v = null;
        for (LoggedEntity store : logList) {
            
            v = store.getPatient_Name();
        }
        
        return v;
    }
  
    public int LoginByName(String name,String pass){
        for(PatientEntity1 store : patList)
            //return store;
            //System.out.println(store[0]);
            if(store.getPatientName().equals(name)){
		if(store.getPassword().equals(pass)){
		
		return 1;
	
	}
	
	}
                
        return 0;
    }
    
    public int Log(String name,String pass){
        for(LoggedEntity store : logList)
            //return store;
            //System.out.println(store[0]);
            if(store.getPatient_Name().equals(name)){
		if(store.getPatientPassword().equals(pass)){
		
		return 0;
	
	}
	
	}
                
        return 1;
    }
    
    
    
    public int LoginByDocName(String name,String id){
        for(DoctorEntity store : docList)
            //return store;
            //System.out.println(store[0]);
            if(store.getName().equals(name)){
		if(store.getId().equals(id)){
		
		return 1;
	
	}
	
	}
                
        return 0;
    }
    

 public String saveInfo1(String name,String password){


try (FileWriter f = new FileWriter("Loged in.txt", true);
                            BufferedWriter b = new BufferedWriter(f);
                            PrintWriter p = new PrintWriter(b);){

   
   
                        p.print("");
                        p.println(name + ";" + password);
                        
   


                       } catch (IOException i) {
                       i.printStackTrace(); }
        return null;
                   
    }
 
 
 public String saveInfo2(String name,String password){


try (FileWriter f = new FileWriter("LoggedDoc.txt", true);
                            BufferedWriter b = new BufferedWriter(f);
                            PrintWriter p = new PrintWriter(b);){

   
   
                        p.print("");
                        p.println(name + ";" + password);
                        
   


                       } catch (IOException i) {
                       i.printStackTrace(); }
        return null;
                   
    }
 
 public static void main(String[] args){
     
     //LoginMgr y=new LoginMgr();
        //int z = y.LoginByDocName("Tania Chatterjee", "ds89");
        
    //System.out.println(z);
     
 
 }



}
    
    

