class Vehicle {
    protected String plateNum;
    protected String ownerName;
    protected String VehicleType;

    public Vehicle(String p,String o,String V){
        this.plateNum = p;
        this.ownerName = o;
        this.VehicleType = V;
    }
    public void displayVehicleinfo(){
        System.out.println(plateNum + ownerName+VehicleType);
    }

}
