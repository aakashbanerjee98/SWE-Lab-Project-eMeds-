public class PatientEntity {

    private String  patient_name,Id,co_num;
    //private boolean verified;

    public void setPatientName(String patient_name) {
        this.patient_name = patient_name;
    }

    public void setId(String Id) {
        this.Id = Id;
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

    public String getPatId() {
        return Id;
    }

    public String getCoNumber() {
        return co_num;
    }
    public PatientEntity(String oneRecord){
        String parts[] = oneRecord.split(";");
        patient_name = parts[0].trim();
        Id = parts[1].trim();
        co_num = parts[2].trim();
        //verified = parts[3].trim().equals("0") ? false : true;
    }
    public String toString(){
        return patient_name + "," + patient_name + "," + Id + ";" ;
    }
    
}