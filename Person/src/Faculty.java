import java.util.Date;

class Faculty extends Employee{

    protected String office_hours;
    protected String Rank;

    public Faculty(String name, String address, String email, int number, String office, double salary, Date hire_date, String hours, String Rank){
        super(name,address,email,number,office,salary,hire_date);
        this.office_hours = hours;
        this.Rank = Rank;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Office Hours: " + office_hours);
        System.out.println("Rank: " + Rank);
    }

}
