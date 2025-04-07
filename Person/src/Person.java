class Person {
    protected String name;
    protected String address;
    protected String email;
    protected int number;

    public Person(String n,String a,String e,int num){
        name = n;
        address = a;
        email = e;
        number = num;
    }
    public void display(){
        System.out.println("Name of person:"+ name);
        System.out.println("Address of person:"+ address);
        System.out.println("Email of person:"+ email);
        System.out.println("Phone Number of person:"+ number);
    }
}
