import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ID of Patient: ");
        String ID = s.nextLine();
        System.out.print("Enter name of Patient: ");
        String name = s.nextLine();
        System.out.print("Enter age of Patient: ");
        int age = s.nextInt();
        s.nextLine();

        Patient patient1 = new Patient(ID,name,age);

        //Allow patient to update name and age
        System.out.print("Do you want to change patient name? yes or no:");
        String choice = s.nextLine();
        if(choice.equalsIgnoreCase("yes")){
            System.out.print("New name? ");
            String newName = s.nextLine();
            patient1.setname(newName);
        }

        //updating medical info by doctor
        System.out.print("Enter Doctor ID: ");
        String doctorID = s.nextLine();
        System.out.print("Enter Medical History: ");
        String medicalHistory = s.nextLine();
        System.out.print("Enter Prescriptions: ");
        String prescriptions = s.nextLine();

        patient1.updateMedicalRecord(doctorID, medicalHistory, prescriptions);
        System.out.println("\nPatient Details:");
        System.out.println("ID: " + patient1.getPatientID());
        System.out.println("Name: " + patient1.getname());
        System.out.println("Age: " + patient1.getage());
        System.out.println(patient1.viewMedicalRecord(doctorID));

        
        
        
        
        
        
        
        
        
        s.close();
    }
}