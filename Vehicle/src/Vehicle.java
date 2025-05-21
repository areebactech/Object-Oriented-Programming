public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(){

    }
    public Vehicle(String b,String m,int y){
        this.brand = b;
        this.model = m;
        this.year = y;
    }
    public void displayInfo(){
        System.out.println("Brand of vehicle:" + brand);
        System.out.println("Model of vehicle:" + model);
        System.out.println("Year of vehicle:" + year);
    }
}
