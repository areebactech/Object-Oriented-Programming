class Int {
    private int value;

    public Int() {
        this.value = 0;
    }
    public Int(int value) {
        this.value = value;
    }

    // Method to add two Int values
    public void add(Int other) {
        this.value += other.value;
    }

    // Method to display the value
    public void display() {
        System.out.println(value);
    }
    public static void main(String[] args) {
        Int num1 = new Int(10);
        Int num2 = new Int(20);
        Int result = new Int();

        result.add(num1);
        result.add(num2);

        System.out.print("Sum: ");
        result.display();
    }
}
