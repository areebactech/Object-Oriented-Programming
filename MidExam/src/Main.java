public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        double areaC = circle.area();
        System.out.println("\n#### Circle ####");
        System.out.println("Area of circle: " + areaC);
        circle.displayShape();

        Triangle triangle = new Triangle(6, 8);
        double areaT = triangle.area();
        System.out.println("\n#### Triangle ####");
        triangle.displayShape();
        System.out.println("Area of triangle: " + areaT);

        Rectangle rectangle = new Rectangle(4, 7);
        double areaR = rectangle.area();
        System.out.println("\n#### Rectangle ####");
        rectangle.displayShape();
        System.out.println("Area of Rectangle: " + areaR);

        System.out.println("\n#### Comparing ####");
        System.out.println("Comparing circle and triangle:" + circle.compareArea(triangle));
        System.out.println("Comparing triangle and rectangle:" + triangle.compareArea(rectangle));
        System.out.println("Comparing rectangle and circle:" + rectangle.compareArea(circle));


    }
}
