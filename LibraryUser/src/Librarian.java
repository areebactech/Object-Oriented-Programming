class Librarian extends LibraryUser {
    private String employeeID;
    private String workshift;

    public Librarian(String userID,String name,String email,String emp,String ws){
        super(userID,name,email);
        this.employeeID = emp;
        this.workshift = ws;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Employee ID:" + employeeID);
        System.out.println("Employee Workshift:" + workshift);
    }

}
