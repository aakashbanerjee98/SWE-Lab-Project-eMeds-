/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aakash
 */
public class SlotsEntity {
    
    private String docId, slots;
    //private boolean verified;

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public void setSlots(String slots) {
        this.slots = slots;
    }

/*    public void setIsVerified(boolean isVerified) {
        this.verified = isVerified;
    }

    public boolean isVerified() {
        return verified;
    }*/

    public String getDocId() {
        return docId;
    }

    public String getSlots() {
        return slots;
    }

    /*public String getLocation() {
        return location;
    }*/
    public SlotsEntity(String oneRecord){
        String parts[] = oneRecord.split(";");
        docId = parts[0].trim();
        slots = parts[1].trim();
        //storeId = parts[2].trim();
        //verified = parts[3].trim().equals("0") ? false : true;
    }
    public String toString(){
        return docId + "," + slots + ";" ;
    } 
}
