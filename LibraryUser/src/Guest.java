class Guest extends LibraryUser{
    private String visitPurpose;

    public Guest(String userID,String name,String email,String visitPurpose){
        super(userID,name,email);
        this.visitPurpose = visitPurpose;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Purpose to visit:" + visitPurpose);
    }
}
