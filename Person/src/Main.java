import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date hireDate = new Date();

        Person person = new Person("John Doe", "123 Main St","john@example.com", 1234567890);
        Student student = new Student("Alice", "456 Elm St", "alice@example.com",987654321,  "Senior");
        Employee employee = new Employee("Bob", "789 Oak St", "bob@example.com",555666777,  "Room 101", 50000, hireDate);
        Faculty faculty = new Faculty("Dr. Smith", "555 Pine St", "smith@example.com",111222333, "Room 202", 70000, hireDate, "9 AM - 5 PM", "Professor");
        Staff staff = new Staff("Karen", "222 Maple St", "karen@example.com",444555666,  "Room 303", 40000, hireDate, "Administrator");

        System.out.println("--- Person Details ---");
        person.display();
        System.out.println("\n--- Student Details ---");
        student.display();
        System.out.println("\n--- Employee Details ---");
        employee.display();
        System.out.println("\n--- Faculty Details ---");
        faculty.display();
        System.out.println("\n--- Staff Details ---");
        staff.display();
    }
}