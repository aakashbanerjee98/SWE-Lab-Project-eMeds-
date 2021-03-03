/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aakash
 */
public class LoggedDocEntity {
    
    
    private String  doc_name,doc_id;
    //private boolean verified;

    public void setDocName(String doc_name) {
        this.doc_name = doc_name;
    }

    public void setDoc_ID(String doc_id) {
        this.doc_id = doc_id;
    }


 /*   public void setIsVerified(boolean isVerified) {
        this.verified = isVerified;
    }
    public boolean isVerified() {
        return verified;
    }*/

    public String getDocName() {
        return doc_name;
    }

    public String getDoc_ID() {
        return doc_id;
    }


    public LoggedDocEntity(String oneRecord){
        String parts[] = oneRecord.split(";");
        doc_name = parts[0].trim();
        doc_id = parts[1].trim();
        //co_num = parts[2].trim();
        //verified = parts[3].trim().equals("0") ? false : true;
    }
    public String toString(){
        return doc_name + ","  + doc_id + ";" ;
    }
    
}
