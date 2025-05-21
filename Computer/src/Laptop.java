// Laptop class inheriting Computer
    class Laptop extends Computer {
    private double length, width, height, weight; // in inches and kg

    // Default Constructor
    public Laptop() {
        super();
        this.length = 15.6;
        this.width = 10.0;
        this.height = 0.8;
        this.weight = 2.5;
    }

    // Parameterized Constructor
    public Laptop(int wordSize, int memorySize, int storageSize, int speed,
                  double length, double width, double height, double weight) {
        super(wordSize, memorySize, storageSize, speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    // Display function
    @Override
    public void display() {
        super.display();
        System.out.println("Laptop Dimensions:");
        System.out.println("Length: " + length + " inches");
        System.out.println("Width: " + width + " inches");
        System.out.println("Height: " + height + " inches");
        System.out.println("Weight: " + weight + " kg");
    }
}
