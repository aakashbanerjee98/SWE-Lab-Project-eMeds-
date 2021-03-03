public class PatientMedicalRecords {
    private String Id, name, report;
    
    public void setName(String name) {
        this.name = name;
    }

    public void setReport(String report) {
        this.report = report;
    }

    
    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getReport() {
        return report;
    }
    public PatientMedicalRecords(String oneRecord){
        String parts[] = oneRecord.split(";");
        name = parts[0].trim();
        report = parts[1].trim();
        Id = parts[2].trim();
            }
    public String toString(){
        return name + ";" + Id + ";" + report ;
    }
}
