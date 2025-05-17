public class Main {
    public static void main(String[] args) {

        Course c1 = new VideoCourse("Java Basics", 6);
        Course c2 = new LiveClass("DSA Bootcamp", 8);

        c1.calculateDuration();
        c2.calculateDuration();
    }
}