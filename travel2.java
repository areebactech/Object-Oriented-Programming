import java.util.Scanner;

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
        System.out.print("Enter kilometers traveled: ");
        kilometers = scanner.nextInt();
        System.out.print("Enter hours taken: ");
        hours = scanner.nextInt();
    }

    // Method to display travel details
    public void show() {
        System.out.println("Kilometers traveled: " + kilometers);
        System.out.println("Time taken (hours): " + hours);
    }

    // Method to add another Travel object and return total
    public Travel add(Travel otherTravel) {
        Travel totalTravel = new Travel();
        totalTravel.kilometers = this.kilometers + otherTravel.kilometers;
        totalTravel.hours = this.hours + otherTravel.hours;
        return totalTravel;
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
        System.out.println("\nTotal Travel Details (Sum of both travels):");
        t3.show();

        scanner.close();
    }
}


