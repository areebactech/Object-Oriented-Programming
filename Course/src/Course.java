public class Course {
    protected String title;
    protected int total_modules;

    public Course() {

    }

    public Course(String t, int tm) {
        this.title = t;
        this.total_modules = tm;
    }

    public int calculateDuration() {
        int hours = total_modules;
        return hours;
    }
}
