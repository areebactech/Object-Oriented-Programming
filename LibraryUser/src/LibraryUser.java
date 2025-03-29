public class LibraryUser {
    protected String userID;
    protected String name;
    protected String email;

    //default constructor
    public LibraryUser(){

    }
    //parameterized Constructor
    public LibraryUser(String e,String n,String em){
        this.userID = e;
        this.name = n;
        this.email = em;
    }
    public void display(){
        System.out.println("User Id:" + userID);
        System.out.println("User name:" + name);
        System.out.println("User email:" + email);
    }
}
