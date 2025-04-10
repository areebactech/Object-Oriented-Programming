class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area(){
       return 3.14 * radius * radius;
    }
    public void displayShape(){
        System.out.println("This is a Circle.");
    }
    public int compareArea(Shape other) {
        return super.compareArea(other);
    }
}
