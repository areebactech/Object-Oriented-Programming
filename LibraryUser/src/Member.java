class Member extends LibraryUser{
    private String membershipID;
    private int borrowedBookCount;

    public Member(String userID,String name,String email,String memID,int bookCount){
        super(userID,name,email);
        this.membershipID = memID;
        this.borrowedBookCount = bookCount;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("MembershipID:" + membershipID);
        System.out.println("Borrowed Book Count:" + borrowedBookCount);
    }
}
