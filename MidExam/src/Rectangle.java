class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double w,double h){
        this.width = w;
        this.height = h;
    }

    public double area(){
        return width * height;
    }
    public void displayShape(){
        System.out.println("This is a Rectangle.");
    }
    public int compareArea(Shape other) {
        return super.compareArea(other);
    }
}
