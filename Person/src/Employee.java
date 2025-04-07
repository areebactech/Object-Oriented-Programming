import java.util.Date;

class Employee extends Person{
    protected String office;
    protected double salary;
    protected Date hire_date;

    public Employee(String name, String address, String email, int number, String office,
                    double salary, Date hire_date){
        super(name,address,email,number);
        this.office = office;
        this.salary = salary;
        this.hire_date = hire_date;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Office:" + office);
        System.out.println("Salary:" + salary);
        System.out.println("Date Hired:" + hire_date);

    }

}
