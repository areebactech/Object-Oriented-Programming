public class Shape {

    public double area(){
        return 0.0;
    }
    public void displayShape(){
        System.out.println("This is a shape.");
    }
    public int compareArea(Shape other) {
        if (this.area() < other.area()) {
            return -1;
        } else if (this.area() > other.area()) {
            return 1;
        } else {
            return 0;
        }
    }
}
