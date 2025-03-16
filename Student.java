import java.util.Scanner;
class Student {
    private String name;
    private String rollNo;
    private int semester;
    private String course;
    private int marks;
    private char grade;

    // Default constructor
    public Student() {
        name = "";
        rollNo = "";
        semester = 0;
        course = "";
        marks = 0;
        grade = 'F';
    }

    // Parameterized constructor
    public Student(String name, String rollNo, int semester, String course, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.semester = semester;
        this.course = course;
        this.marks = marks;
        grade = calculateGrade(marks);
        
    }

    // Method to get student data from user
    public void getStudentData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = scanner.nextLine();
        System.out.print("Enter roll no.: ");
        rollNo = scanner.nextLine();
        System.out.print("Enter semester no.: ");
        semester = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter course name: ");
        course = scanner.nextLine();
        System.out.print("Enter marks: ");
        marks = scanner.nextInt();
        grade = calculateGrade(marks);
        scanner.close();
    }

    // Method to calculate grade
    private char calculateGrade(int marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }

    // Method to display
    public void displayQuizGrade() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Semester No.: " + semester);
        System.out.println("Course Name: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Enter student1 data");
        Student student1 = new Student();
        student1.getStudentData();

        Student student2 = new Student("Areeba", "FA18-RCS-011-Section (B)", 3, "Data Structures", 85);
        Student student3 = new Student("Wardah", "FA18-RCS-012-Section (C)", 4, "Algorithms", 72);
        
        System.out.println("\nStudent 1 Details:");
        student1.displayQuizGrade();
        System.out.println("\nStudent 2 Details:");
        student2.displayQuizGrade();
        System.out.println("\nStudent 3 Details:");
        student3.displayQuizGrade();
    }
}
