/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aakash
 */
public class DisplayMgr {
    
    //private MakeAppoinment makeAppt;
    //private UploadMedicalRecords upldMedRec;
    static MakeAppoinment makeAppt = new MakeAppoinment();
    static UploadMedicalRecords upldMedRec= new UploadMedicalRecords();
    static StartUI startui=new StartUI();
    static LoginUI loginUi=new LoginUI();
    static PatientChooseUI patChoose=new PatientChooseUI();
    static RegistrationUi regUi= new RegistrationUi();
    static DoctorInterfaceUI docInterface =new DoctorInterfaceUI();
    static PatientInterfaceUI patInterface=new PatientInterfaceUI();
    static ViewAppoinment viewAppt= new ViewAppoinment();
    static ViewMedicalRecords viewMed= new ViewMedicalRecords();
    static ViewMedicalRecords_1 viewMed1= new ViewMedicalRecords_1();
    static Details dec1= new Details();
    static Details2 dec2 = new Details2();
    static CaseNotes casenotes= new CaseNotes();
   
    public static void main(String[] args) {
       
        //DisplayMgr myMgr = new DisplayMgr();
        DisplayMgr.showScreen1();
        
        //AppointmentMgr.makeAppt = new makeAppt(AppointmentMgr);
        //myMgr.screen2 = new Screen2(myMgr);

        //new MakeAppoinment().setVisible(true);
        //upldMedRec.setVisible(true);
        //makeAppt.setVisible(true);
        //showScreen1();
        //jButton2ActionPerformed(java.awt.event.ActionEvent evt)
        
        //makeAppt.jButton2ActionPerformed();

        
               
    }
    
    
    public static void showScreen1() {
       
        startui.setVisible(true);
    }
   
    public static void showScreen2() {
       
        startui.setVisible(false);
        loginUi.setVisible(true);
    }
    
    public static void showScreen3() {
       
        startui.setVisible(false);
        patChoose.setVisible(true);
    }
 
    public static void showReg() {
       
        patChoose.setVisible(false);
        regUi.setVisible(true);
    }
    
    public static void showLogin() {
       
        patChoose.setVisible(false);
        loginUi.setVisible(true);
    }
    
    
    public static void showPatInterface() {
       
        loginUi.setVisible(false);
        patInterface.setVisible(true);
    }
    
    
    public static void showLogOut1() {
       
        patInterface.setVisible(false);
        loginUi.setVisible(true);
    }
    
    public static void showLogOut2() {
       
        docInterface.setVisible(false);
        loginUi.setVisible(true);
    }
    
   public static void showDocInterface() {
       
        loginUi.setVisible(false);
        docInterface.setVisible(true);
    }
   
   public static void showStart() {
       
        loginUi.setVisible(false);
        startui.setVisible(true);
    }
   
   public static void showPatChooseToStart() {
       
        patChoose.setVisible(false);
        startui.setVisible(true);
    }
   
   public static void showRegToPatChoose() {
       
        regUi.setVisible(false);
        patChoose.setVisible(true);
    }
   
   public static void showRegToLogin() {
       
        regUi.setVisible(false);
        loginUi.setVisible(true);
    }
   
   
   public static void showViewApptToDocInterface() {
       
        viewAppt.setVisible(false);
        docInterface.setVisible(true);
    }
   
   public static void showViewApptFrmDec1() {
       
       dec1.setVisible(false); 
       viewAppt.setVisible(true);
        
    }
   
   public static void showViewApptFrmDec2() {
       
       dec2.setVisible(false); 
       viewAppt.setVisible(true);
        
    }
   
   public static void showViewApptToDec1() {
       
       viewAppt.setVisible(false);
       dec1.setVisible(true); 
       
        
    }
   
   public static void showViewApptToDec2() {
       
       viewAppt.setVisible(false);
       dec2.setVisible(true); 
       
        
    }
   
   public static void showViewApptFrmDocInterface() {
       
       docInterface.setVisible(false);
       viewAppt.setVisible(true);
        
    }
   
   public static void showViewMedFrmViewMed1() {
       
        viewMed1.setVisible(false);
        viewMed.setVisible(true);
    }
   
   public static void showViewMedToViewMed1() {
       
        viewMed.setVisible(false);
        viewMed1.setVisible(true);
    }
   
   public static void showViewMedToDocInterface() {
       
        viewMed.setVisible(false);
        docInterface.setVisible(true);
    }
   
   public static void showViewMedFrmDocInterface() {
       
       docInterface.setVisible(false);
       viewMed.setVisible(true);
        
    }
   
   
   
   public static void showMakeApptToPatInterface() {
       
        makeAppt.setVisible(false);
        patInterface.setVisible(true);
    }
   
   
   public static void showUpldMedtToPatInterface() {
       
        upldMedRec.setVisible(false);
        patInterface.setVisible(true);
    }
   
   public static void showDec1ToCaseNotes() {
       
        dec1.setVisible(false);
        casenotes.setVisible(true);
    }
   
   
   public static void showDec2ToCaseNotes() {
       
        dec2.setVisible(false);
        casenotes.setVisible(true);
    }
   
   public static void showDec1ToViewMed1() {
       
        dec1.setVisible(false);
        viewMed1.setVisible(true);
    }
   
   
   public static void showDec2ToViewMed1() {
       
        dec2.setVisible(false);
        viewMed1.setVisible(true);
    }
   
   public static void showCaseNotesToDocInterface() {
       
        casenotes.setVisible(false);
        docInterface.setVisible(true);
    }
   
   
   
   
   
   
    public static void exitFRS() {
        startui.setVisible(false);
        System.exit(0);
    }
    
    public static void showMakeAppointment() {
       
        
        patInterface.setVisible(false);
        makeAppt.setVisible(true);
    }
    
    public static void showUpldMedRec() {
       
        
        patInterface.setVisible(false);
        upldMedRec.setVisible(true);
    }
    
    public static void showUpldMedRecFrmMakeAppt() {
       
        
        makeAppt.setVisible(false);
        upldMedRec.setVisible(true);
    }
    
}
