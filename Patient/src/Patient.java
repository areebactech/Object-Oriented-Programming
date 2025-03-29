public class Patient {
    private String patientID;
    private String name;
    private int age;
    private String MedicalHistory;
    private String prescriptions;


    public Patient(String id, String name, int age) {
        this.patientID = id;
        this.name = name;
        this.age = age;
        this.MedicalHistory = "";
        this.prescriptions = "";
    }

    //getter for patientID
    public String getPatientID() {
        return this.patientID;
    }

    //getter for name
    public String getname() {
        return this.name;
    }
    //setter for name
    public void setname(String name){
        this.name = name;
    }
    //getter for age
    public int getage(){
        return this.age;
    }
    //setter for age
    public void setage(int age){
        this.age = age;
    }
    //getter for medicalHistory
    public String getMedicalHistory(){
        return this.MedicalHistory;
    }
    //getter for prescriptions
    public String getPrescriptions(){
        return this.prescriptions;
    }
    //method for authorization of doctors
    private boolean authorizedDoctor(String docID){
        return docID != null && docID.startsWith("Dr");
    }
    //method for authorized doctors to update info
    public void updateMedicalRecord(String DoctorID,String newHistory,String newprescriptions){
        if(authorizedDoctor(DoctorID)){
            this.MedicalHistory = newHistory;
            this.prescriptions = newprescriptions;
            System.out.println("\nMedical record updated by Doctor ID:"+ DoctorID);
        }
        else{
            System.out.println("Unauthorized Access attempt by DoctorID:" + DoctorID);
        }
    }
    public String viewMedicalRecord(String doctorID) {
        if (authorizedDoctor(doctorID)) {
            return "Medical History: " + this.MedicalHistory + "\nPrescriptions: " + this.prescriptions;
        }
        return "Unauthorized access attempt by Doctor ID: " + doctorID;
    }
}
