import java.util.Scanner;
public class Student_array {

private int id;
private String name;
private int marks;

Student_array(){
}
public void input(){
        Scanner In = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        id=In.nextInt();
        System.out.print("Enter Student Name: ");
        name=In.next();
        System.out.print("Enter Student Marks: ");
        marks=In.nextInt();
    }
    public void display() {
        System.out.println("Student Id: " + id);
        System.out.println("Student name: " + name);
        System.out.println("Student Marks: " + marks);
    }
}
