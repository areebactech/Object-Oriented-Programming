class Employee{
 protected String name;
    protected String id;
    protected String department;

    public Employee(){

    }
    public Employee(String n, String i, String d){
        name = n;
        id = i;
        department = d;
    }
    public void setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
    public void setid(String i){
        id = i;
    }
    public String getid(){
        return id;
    }
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("ID: "+ id);
        System.out.println("Department: "+ department);
    }
}