public class Main {
    public static void main(String[] args) {
        car c = new car("Toyota", "23wer", 2001, 4);
        c.displayInfo();

        car c1 = new car();
        c1.displayInfo();

        MotorCycle m = new MotorCycle("suzuki", "lzx4585", 2004, true);
        m.displayInfo();

    }
}
