/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aakash
 */
public class DoctorEntity {
    

    private String Id, name, type;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
 
    public void setId(String Id) {
        this.Id = Id;
    }


    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public DoctorEntity(String oneRecord){
        String parts[] = oneRecord.split(";");
        name = parts[0].trim();
        type = parts[2].trim();
        Id = parts[1].trim();
    }
    public String toString(){
        return name + "," + type + "," + Id +";";
    }
   
}
    

