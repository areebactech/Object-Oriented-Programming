class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

    public double area() {
        return 0.5 * base * height;
    }
    public void displayShape(){
        System.out.println("This is a Triangle.");
    }
    public int compareArea(Shape other) {
        return super.compareArea(other);
    }
}

