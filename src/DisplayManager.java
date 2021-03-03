

import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aakash
 */
public class DisplayManager {
    
    
    private JFrame MakeAppoinment, UploadMedicalRecords, StartUI, LoginUI, PatientChooseUI, RegistrationUi, DoctorInterfaceUI,ViewAppoinment,ViewMedicalRecords,CaseNotes;
    private AppointmentMgr sysMgr;
    
    public void StartProg(boolean show){
        if(StartUI == null) StartUI = new StartUI(this);
        StartUI.setVisible(show);
    }
    
     public void showAppt(boolean show){
        if(MakeAppoinment == null) MakeAppoinment = new StartUI(this);
        MakeAppoinment.setVisible(show);
    }
        
    public void showMed(boolean show){
        if(UploadMedicalRecords == null) UploadMedicalRecords = new StartUI(this);
        UploadMedicalRecords.setVisible(show);
    }
    
    public void showLogin(boolean show){
        if(LoginUI == null) LoginUI = new StartUI(this);
        LoginUI.setVisible(show);
    }
    
    public void showReg(boolean show){
        if(RegistrationUi == null) RegistrationUi = new StartUI(this);
        RegistrationUi.setVisible(show);
    }
    
    public void show2(boolean show){
        if(ViewAppoinment == null) ViewAppoinment = new StartUI(this);
        ViewAppoinment.setVisible(show);
    }
    
    public void show3(boolean show){
        if(PatientChooseUI == null) PatientChooseUI = new StartUI(this);
        PatientChooseUI.setVisible(show);
    }
    
    public void show5(boolean show){
        if(ViewMedicalRecords == null) ViewMedicalRecords = new StartUI(this);
        ViewMedicalRecords.setVisible(show);
    }
    
    
    public void show6(boolean show){
        if(CaseNotes == null) CaseNotes = new StartUI(this);
        CaseNotes.setVisible(show);
    }
    
    public void show7(boolean show){
        if(DoctorInterfaceUI == null) DoctorInterfaceUI = new StartUI(this);
        DoctorInterfaceUI.setVisible(show);
    }
    /*public void showChemistUI(boolean show){
        if(chemistUI == null) chemistUI = new ChemistUI(sysMgr, this);
        chemistUI.setVisible(show);
    }
    public void showCustomerRegistrationUI(boolean show){
        if(customerRegistrationUI == null) customerRegistrationUI = new CustomerRegistrationUI(sysMgr, this);
        customerRegistrationUI.setVisible(show);
    }
    public void showHomeUI(boolean show){
        if(homeUI == null) homeUI = new HomePageUI(sysMgr, this);
        homeUI.setVisible(show);
    }
    public void showLoginUI(boolean show){
        if(loginUI == null) loginUI = new LoginUI(sysMgr, this);
        loginUI.setVisible(show);
    }
    public void showManageStore(boolean show){
        if(manageStore == null) manageStore = new ManageStore(sysMgr, this);
        manageStore.setVisible(show);
    }
    public void showRegisterStore(boolean show){
        if(registerStore == null) registerStore = new RegisterStore(sysMgr, this);
        registerStore.setVisible(show);
    }
    public void showSearchForMedicine(boolean show){
        if(searchForMedicine == null) searchForMedicine = new SearchForMedicine(sysMgr, this);
        searchForMedicine.setVisible(show);
    }*/
    public DisplayManager(AppointmentMgr sysMgr) {
        this.sysMgr = sysMgr;
    }
    public void showError(String error){
        JOptionPane.showMessageDialog(null, error, "", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void main(String[] args) {
       
        //DisplayMgr myMgr = new DisplayMgr();
        //DisplayManager.StartProg(sysMgr);
        //DisplayManager(new AppointmentMgr) m = new DisplayManager(new AppointmentMgr);
        new DisplayManager(new AppointmentMgr()).StartProg(true);
        //AppointmentMgr.makeAppt = new makeAppt(AppointmentMgr);
        //myMgr.screen2 = new Screen2(myMgr);

        //new MakeAppoinment().setVisible(true);
        //upldMedRec.setVisible(true);
        //makeAppt.setVisible(true);
        //showScreen1();
        //jButton2ActionPerformed(java.awt.event.ActionEvent evt)
        
        //makeAppt.jButton2ActionPerformed();

        
               
    }
    
}

    
