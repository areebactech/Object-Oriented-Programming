import java.util.Date;

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String email, int number, String office, double salary, Date hire_date, String title) {
        super(name, address, email, number,  office, salary, hire_date);
        this.title = title;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Title: " + title);
    }
}
