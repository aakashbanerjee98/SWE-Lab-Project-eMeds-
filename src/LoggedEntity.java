/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aakash
 */
public class LoggedEntity {
    
    private String  patient_name,password;
    //private boolean verified;

    public void setPatientName(String patient_name) {
        this.patient_name = patient_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }


 /*   public void setIsVerified(boolean isVerified) {
        this.verified = isVerified;
    }
    public boolean isVerified() {
        return verified;
    }*/

    public String getPatient_Name() {
        return patient_name;
    }

    public String getPatientPassword() {
        return password;
    }


    public LoggedEntity(String oneRecord){
        String parts[] = oneRecord.split(";");
        patient_name = parts[0].trim();
        password = parts[1].trim();
        //co_num = parts[2].trim();
        //verified = parts[3].trim().equals("0") ? false : true;
    }
    public String toString(){
        return patient_name + ","  + password + ";" ;
    }
}
