
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
 * @author Adrish
 */


public class CaseNotesMgr 
{
    private ArrayList<LoggedDocEntity> docList;
    private ArrayList<LoggedEntity> patList;
    private String infoLine1;
    private String infoLine2;
    
    
    public CaseNotesMgr()
    {
        docList = new ArrayList<>();
        patList=new ArrayList<>();
        readFileLoggedDoc();
        readFileLogged();
    }

    CaseNotesMgr(AppointmentMgr aThis) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    private void readFileLoggedDoc(){
        try(FileReader file = new FileReader("LoggedDoc.txt");
            BufferedReader reader = new BufferedReader(file)){
            //ignore first line
            infoLine1 = reader.readLine();
            String oneLine;
            while((oneLine = reader.readLine()) != null){
                if(oneLine.equals("")) continue;
                docList.add(new LoggedDocEntity(oneLine));
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
            infoLine2 = reader.readLine();
            String oneLine;
            while((oneLine = reader.readLine()) != null){
                if(oneLine.equals("")) continue;
                patList.add(new LoggedEntity(oneLine));
            }
           
        }
       
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    //System.out.println(docList.get(0));
    } 
     public String DocName(){
        String v = null; 
        for( LoggedDocEntity store : docList){
        v=store.getDocName();
        
        }
        return v;
     }
     public String DocId(){
        String v = null; 
        for( LoggedDocEntity store : docList){
        v=store.getDoc_ID();
        
        }
        return v;
     }
     public String PatName(){
        String v = null; 
        for( LoggedEntity store : patList){
        v=store.getPatient_Name();
        
        }
        return v; 
     }
     
    public String SaveInfoCase(String Info1,String Info2,String Info3,String Info4,String Info5)
    {
        String path ="Medical_Case_Notes.txt";
        String line="";
        
               
        try (FileWriter f = new FileWriter("Medical_Case_Notes.txt", true); 
            BufferedWriter b = new BufferedWriter(f); 
            PrintWriter p = new PrintWriter(b);){

            p.print(""); 
            p.println(Info1 + ";"+Info2 + ";"+ Info3 + ";"+ Info4 + ";"+ Info5 + ";");
            

                        
            } catch (IOException i) { 
                       i.printStackTrace(); }
         
        return null;
        
    }
    public static void main(String[] args)
    {
        CaseNotesMgr testmgr = new CaseNotesMgr();
        String z = testmgr.PatName();
        System.out.println(z);
        
        
        /*java.awt.EventQueue.invokeLater(new Runnable()
        {
        public void run() {
        new CaseNotes().setVisible(true);
        }
        });*/
        
    }
    
}
