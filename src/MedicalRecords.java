
import java.util.*;
import java.io.*;
public class MedicalRecords {
    private final ArrayList<PatientMedicalRecords> storeList;
    private ArrayList<PatientEntity> patList;
    
    private String infoLine;
    private String infoLine1;
    public MedicalRecords(){
        storeList = new ArrayList<>();
        patList=new ArrayList<>();
        readFile();
        readFilePat();
    }




    
    public ArrayList<String> returnName()
    {
        ArrayList<String> pat = new ArrayList<String>();
        for(PatientEntity store : patList)
        {
            pat.add(store.getPatientName());
        }
        return pat;
    }
    public ArrayList<String> returnpId()
    {
        ArrayList<String> pat = new ArrayList<String>();
        for(PatientEntity store : patList)
        {
            pat.add(store.getPatId());
        }
        return pat;
    }
    public void writeToFile(){
        try(FileWriter writer = new FileWriter("A.txt");){
            writer.write(infoLine + "\n");
            for(PatientMedicalRecords i : storeList)
                writer.write(i + "\n");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            //return false;
        }
        //return true;
    }
    public ArrayList<PatientMedicalRecords> getAllStores(){
        return new ArrayList<>(storeList);
    }
    private void readFile(){
        try(FileReader file = new FileReader("A.txt");
            BufferedReader reader = new BufferedReader(file))
                    {
            //ignore first line
            infoLine = reader.readLine();
            String oneLine;
                while((oneLine = reader.readLine()) != null){
                if(oneLine.equals("")) continue;
                storeList.add(new PatientMedicalRecords(oneLine));
                
               oneLine = reader.readLine();
               //System.out.println(oneLine);
            }
            reader.close();
           
                        
              }
        catch(IOException e){
            System.out.println(e.getMessage());
            //return false;
        }
       // return true;
    }
    private void readFilePat(){
        try(FileReader file = new FileReader("Patient.txt");
            BufferedReader reader = new BufferedReader(file))
                    {
            //ignore first line
            infoLine1 = reader.readLine();
            String oneLine;
                while((oneLine = reader.readLine()) != null){
                if(oneLine.equals("")) continue;
                patList.add(new PatientEntity(oneLine));
                
               oneLine = reader.readLine();
               //System.out.println(oneLine);
            }
            reader.close();
           
                        
              }
        catch(IOException e){
            System.out.println(e.getMessage());
            //return false;
        }
       // return true;
    }
    public PatientMedicalRecords searchById(String Id){
        for(PatientMedicalRecords store : storeList)
            if(store.getId().equals(Id.trim()))
                return store;
        return null;
    }
        public String saveInfo(String name,String Id,String report ){

         String path ="A.txt";
         String line="";
         

   
        //System.out.println("Added");
        try (FileWriter f = new FileWriter("A.txt", true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter p = new PrintWriter(b);){

            p.print("");
            p.println(name + ";" + Id + ";" + report);
           

                       
            } catch (IOException i) {
                       i.printStackTrace(); }
                   

                 

        return null;
    }

    public static void main(String[] args){
        MedicalRecords testManager = new MedicalRecords();
        
        //test number of records in file
       /* assert(testManager.storeList.size() == 5);
        
        //test if all store ids are unique
        for(int i = 0; i < testManager.storeList.size(); i ++)
            for(int j = i + 1; j < testManager.storeList.size(); j ++)
                assert(!testManager.storeList.get(i).getId().equals(testManager.storeList.get(j).getId()));
        
        
        //test one record
       assert(testManager.storeList.get(0).getName().equals("Aaksh"));*/
        
        //display chemist UI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadMedicalRecords().setVisible(true);
            }
        });
    }
}