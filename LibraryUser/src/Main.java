public class Main {
    public static void main(String[] args) {
        Librarian librarian = new Librarian("1s","Tahir","tahir@gmail.com","12DR","morning");
        Member member = new Member("2s","Areeba","areeba@gmail.com","24d",4);
        Guest guest = new Guest("3s","warda","warda@gmail.com","Resarch");

        System.out.println("Librarian Details:");
        librarian.display();

        System.out.println("\nMember Details:");
        member.display();

        System.out.println("\nGuest Details:");
        guest.display();
    }
}