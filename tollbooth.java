import java.util.Scanner;

class tollbooth {
    private int totalCars;
    private double totalCash;

    // Constructor to initialize values
    public tollbooth() {
        totalCars = 0;
        totalCash = 0.0;
    }

    // Method to count a paying car
    public void payingCar() {
        totalCars++;
        totalCash += 0.50;
    }

    // Method to count a non-paying car
    public void nopayCar() {
        totalCars++;
    }

    // Method to display totals
    public void display() {
        System.out.println("Total Cars: " + totalCars);
        System.out.println("Total Cash: $" + totalCash);
    }

    // Main Method 
    public static void main(String[] args) {
        tollbooth booth = new tollbooth();
        Scanner scanner = new Scanner(System.in);
        char choice;

        System.out.println("Press 'P' for a paying car, 'N' for a non-paying car, 'E' to exit.");
        
        while (true) {
            choice = scanner.next().charAt(0);
            
            if (choice == 'P' || choice == 'p') {
                booth.payingCar();
            } else if (choice == 'N' || choice == 'n') {
                booth.nopayCar();
            } else if (choice == 'E' || choice == 'e') {
                booth.display();
                System.out.println("Exiting program.");
                break;
            } else {
                System.out.println("Invalid input. Please enter 'P', 'N', or 'E'.");
            }
        }
        
        scanner.close();
    }
}
