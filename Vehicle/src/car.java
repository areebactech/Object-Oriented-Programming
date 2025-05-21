class car extends Vehicle{
    private int numofdoors;

    public car(){
        super();
        this.numofdoors = 0;
    }
    public car(String b,String m,int y,int numofdoors){
        super(b,m,y);
        this.numofdoors = numofdoors;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("NO of doors in vehicle:" + numofdoors);
    }
}
