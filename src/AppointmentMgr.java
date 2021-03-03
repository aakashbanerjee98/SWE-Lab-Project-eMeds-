
import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aakash
 */
public class AppointmentMgr {
    
    private ArrayList<DoctorEntity> docList;
    private ArrayList<PatientEntity> patList;
    private ArrayList<SlotsEntity> slotList;
    private ArrayList<LoggedDocEntity> docLog;
    private ArrayList<LoggedEntity> logList;
    private String infoLine;
    private String infoLine1;
    private String infoLine2;
    private String infoLine3;
    private String infoLine5;
    private CaseNotesMgr caseMgr;
    private LoginMgr loginMgr;
    private RegistrationMgr regMgr;
    private MedicalRecords medMgr;
    private DisplayManager dispMgr;

    public AppointmentMgr() {
        docList = new ArrayList<>();
        patList = new ArrayList<>();
        slotList = new ArrayList<>();
        docLog = new ArrayList<>();
        readFileDoc();
        readFilePat();
        readFileSlot();
        readFileLoggedDoc();
        
        
    }
    
    private boolean initAll() {
        caseMgr = new CaseNotesMgr(this);
        loginMgr = new LoginMgr(this);
        regMgr = new RegistrationMgr(this);
        
        //boolean flag = caseMgr.init() | loginMgr.init() | regMgr.init() | medMgr.init();
        boolean flag = true;
        if (flag == false) {
            dispMgr.showError("Initialization Failed");
            System.exit(0);
            return false;
        }
        //dispMgr = new DisplayManager(this);
        
        return true;
    }
    
    public void writeToFileDoc() {
        try (FileWriter writer = new FileWriter("doctor.txt", true);) {
            writer.write(infoLine + "\n");
            for (DoctorEntity i : docList) {
                writer.write(i + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void writeToFilePat() {
        try (FileWriter writer = new FileWriter("patient.txt", true);) {
            writer.write(infoLine1 + "\n");
            for (PatientEntity i : patList) {
                writer.write(i + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void writeToFileSlot() {
        try (FileWriter writer = new FileWriter("slots.txt", true);) {
            writer.write(infoLine2 + "\n");
            for (SlotsEntity i : slotList) {
                writer.write(i + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList<DoctorEntity> getAllStores() {
        return new ArrayList<>(docList);
    }
    
    public ArrayList<PatientEntity> getAllPat() {
        return new ArrayList<>(patList);
    }
    
    private void readFileDoc() {
        try (FileReader file = new FileReader("doctor.txt");
                BufferedReader reader = new BufferedReader(file)) {
            //ignore first line
            infoLine = reader.readLine();
            String oneLine;
            while ((oneLine = reader.readLine()) != null) {
                if (oneLine.equals("")) {
                    continue;
                }
                docList.add(new DoctorEntity(oneLine));
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //System.out.println(docList.get(0));
    }
    
    private void readFilePat() {
        try (FileReader file = new FileReader("patient.txt");
                BufferedReader reader = new BufferedReader(file)) {
            //ignore first line
            infoLine1 = reader.readLine();
            String oneLine;
            while ((oneLine = reader.readLine()) != null) {
                if (oneLine.equals("")) {
                    continue;
                }
                patList.add(new PatientEntity(oneLine));
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //System.out.println(docList.get(0));
    }
    
    private void readFileSlot() {
        try (FileReader file = new FileReader("slots.txt");
                BufferedReader reader = new BufferedReader(file)) {
            //ignore first line
            infoLine2 = reader.readLine();
            String oneLine;
            while ((oneLine = reader.readLine()) != null) {
                if (oneLine.equals("")) {
                    continue;
                }
                slotList.add(new SlotsEntity(oneLine));
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //System.out.println(docList.get(0));
    }
    
    private void readFileLoggedDoc() {
        try (FileReader file = new FileReader("LoggedDoc.txt");
                BufferedReader reader = new BufferedReader(file)) {
            //ignore first line
            infoLine3 = reader.readLine();
            String oneLine;
            while ((oneLine = reader.readLine()) != null) {
                if (oneLine.equals("")) {
                    continue;
                }
                docLog.add(new LoggedDocEntity(oneLine));
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //System.out.println(docList.get(0));
    }
    

    
    public String GetDoctId() {
        String v = null;
        for (LoggedDocEntity store : docLog) {
            
            v = store.getDoc_ID();
        }
        
        return v;
    }
    
    
    public String LogPat() {
        String v = null;
        for (LoggedEntity store : logList) {
            
            v = store.getPatient_Name();
        }
        
        return v;
    }
    
    public String searchByName(String name) {
        for (DoctorEntity store : docList) //return store;
        //System.out.println(store[0]);
        {
            if (store.getName().equals(name)) {
                return store.getId();
            }
        }
        return null;
    }
    
    public String returnName(String id) {
        for (DoctorEntity store : docList) //return store;
        //System.out.println(store[0]);
        {
            if (store.getId().equals(id)) {
                return store.getName();
            }
        }
        return null;
    }
    
    public ArrayList<String> returnDocName(String type) {
        ArrayList<String> doc = new ArrayList<String>();
        for (DoctorEntity store : docList) //return store;
        //System.out.println(store[0]);
        {
            if (store.getType().equals(type)) {
                doc.add(store.getName());
            }
        }
        return doc;
        //return null;
    }
    
    public ArrayList<String> returnDocSlots(String id) {
        ArrayList<String> doc = new ArrayList<String>();
        for (SlotsEntity store : slotList) //return store;
        //System.out.println(store[0]);
        {
            if (store.getDocId().equals(id)) {
                
                doc.add(store.getSlots());
            }
        }
        return doc;
        //return null;
    }
    
    public String searchSlots(String Id) {
        for (SlotsEntity store : slotList) //return store;
        //System.out.println(store[0]);
        {
            if (store.getDocId().equals(Id)) {
                return store.getSlots();
            }
        }
        return null;
    }
    
    public ArrayList<String> DoC_Pat(String ID) {
        
        ArrayList<String> arr = new ArrayList();
        
        String path = "booked_slots.txt";
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            
            while ((line = br.readLine()) != null) {
                
                System.out.println(line);
                String[] values = line.split(";");
                String id = values[0];
                String slot1 = values[1];
                String pat = values[2];
                
                if (id == null ? ID == null : id.equals(ID)) {
                    
                    arr.add(pat);
                    
                }
                
            }

            // TODO add your handling code here:
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MakeAppoinment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MakeAppoinment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
        
    }
    
    public String saveInfo(String slot, String Id) {
        
        String path = "booked_slots.txt";
        String line = "";

        //System.out.println("Added");
        try (FileWriter f = new FileWriter("booked_slots.txt", true);
                BufferedWriter b = new BufferedWriter(f);
                PrintWriter p = new PrintWriter(b);) {
            
            p.print("");            
            p.println(Id + ";" + slot);
            
        } catch (IOException i) {            
            i.printStackTrace();
        }
        
        return null;
    }
    
    public String saveInfo2(String slot, String Id, String patName) {
        
        String path = "booked_slots.txt";
        String line = "";

        //System.out.println("Added");
        try (FileWriter f = new FileWriter("booked_slots.txt", true);
                BufferedWriter b = new BufferedWriter(f);
                PrintWriter p = new PrintWriter(b);) {
            
            p.print("");            
            p.println(Id + ";" + slot + ";" + patName);
            
        } catch (IOException i) {            
            i.printStackTrace();
        }
        
        return null;
    }
    
    public static void main(String[] args) {
        //AppointmentMgr ob = new AppointmentMgr();
        //String z = ob.GetDoctId();
        //System.out.println(z);
        try {
        AppointmentMgr ob = new AppointmentMgr();
        ob.initAll();
        //DisplayManager dis = new DisplayManager(ob);
        //dis.StartProg(true);
        new DisplayManager(ob).StartProg(true);
        } catch (Exception e) {
        System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(null, "Unable to Run: ", "", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}


