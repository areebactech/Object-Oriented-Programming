class Student extends Person {
    protected String status;

    public Student(String name, String address, String email, int phoneNumber, String status) {
        super(name, address, email, phoneNumber);
        this.status = status;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Status: " + status);
    }
}