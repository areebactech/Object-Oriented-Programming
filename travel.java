import java.util.*;

class Travel {
    private int kilometers;
    private int hours;

    // Default constructor
    public Travel() {
        kilometers = 0;
        hours = 0;
    }

    // Method to get user input
    public void get(Scanner scanner) {
        System.out.print("Enter kilometers: ");
        kilometers = scanner.nextInt();
        System.out.print("Enter hours: ");
        hours = scanner.nextInt();
    }

    // Method to display values
    public void show() {
        System.out.println("Kilometers: " + kilometers);
        System.out.println("Hours: " + hours);
    }

    // Method to add another Travel object
    public Travel add(Travel t) {
        Travel result = new Travel();
        result.kilometers = kilometers + t.kilometers;
        result.hours = hours + t.hours;
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Travel t1 = new Travel();
        System.out.println("Enter details for first travel:");
        t1.get(scanner);

        Travel t2 = new Travel();
        System.out.println("Enter details for second travel:");
        t2.get(scanner);

        Travel t3 = t1.add(t2);

        System.out.println("\nFirst Travel Details:");
        t1.show();
        System.out.println("\nSecond Travel Details:");
        t2.show();
        System.out.println("\nTotal Travel Details:");
        t3.show();

        scanner.close(); 
    }
}
