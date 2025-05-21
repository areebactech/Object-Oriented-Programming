class MotorCycle extends Vehicle{
    private boolean hasSidecar;

    public MotorCycle(){
        super();
        this.hasSidecar = false;
    }
    public MotorCycle(String b,String m,int y,boolean hasSidecar){
        super(b,m,y);
        this.hasSidecar = hasSidecar;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Has Side car:" + hasSidecar);

    }
}
