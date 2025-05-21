public class Main {
    public static void main(String[] args) {
        // Creating Computer object
        Computer comp = new Computer(64, 8192, 1000000, 3500);
        comp.display();

        System.out.println("\n========================\n");

        // Creating Laptop object
        Laptop laptop = new Laptop(64, 16384, 2000000, 4000, 14.0, 9.0, 0.6, 1.8);
        laptop.display();
    }
}