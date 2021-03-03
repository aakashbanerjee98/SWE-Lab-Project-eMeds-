/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aakash
 */
public class PatientEntity1 {

    private String  patient_name,password,co_num;
    //private boolean verified;

    public void setPatientName(String patient_name) {
        this.patient_name = patient_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setCoNumber(String co_num) {
        this.co_num = co_num;
    }

 /*   public void setIsVerified(boolean isVerified) {
        this.verified = isVerified;
    }
    public boolean isVerified() {
        return verified;
    }*/

    public String getPatientName() {
        return patient_name;
    }

    public String getPassword() {
        return password;
    }

    public String getCoNumber() {
        return co_num;
    }
    public PatientEntity1(String oneRecord){
        String parts[] = oneRecord.split(";");
        patient_name = parts[0].trim();
        password = parts[1].trim();
        co_num = parts[2].trim();
        //verified = parts[3].trim().equals("0") ? false : true;
    }
    public String toString(){
        return patient_name + "," + patient_name + "," + password + ";" ;
    }
    
}