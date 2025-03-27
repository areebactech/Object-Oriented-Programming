import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Account 1
        Scanner s = new Scanner(System.in);

        System.out.println("=== Create Account 1 ===");
        System.out.print("Enter Holder_name of Account1:");
        String name1 = s.nextLine();
        System.out.print("Enter Number of Account1:");
        String num1 = s.nextLine();
        System.out.print("Enter balance in Account1:");
        double balance1 = s.nextDouble();
        s.nextLine();

        BankAccount Account1 = new BankAccount(name1, num1, balance1);

        //Account 2
        System.out.println("\n=== Create Account 2 ===");
        System.out.print("Enter Holder_name of Account2: ");
        String name2 = s.nextLine();
        System.out.print("Enter Number of Account2: ");
        String num2 = s.nextLine();
        System.out.print("Enter balance in Account2: ");
        double balance2 = s.nextDouble();
        s.nextLine();

        BankAccount Account2 = new BankAccount(name2, num2, balance2);

        //Transactions on Account 1
        System.out.println("\n=== Transactions for Account 1 ===");
        System.out.print("Enter deposit amount: $");
        Account1.deposit(s.nextDouble());
        System.out.print("Enter withdrawal amount: $");
        Account1.withdraw(s.nextDouble());

        //Transactions on Account 2
        System.out.println("\n=== Transactions for Account 2 ===");
        System.out.print("Enter deposit amount: $");
        Account2.deposit(s.nextDouble());
        s.nextLine();
        System.out.print("Enter withdrawal amount: $");
        Account2.withdraw(s.nextDouble());
        s.nextLine();

        //Compare Method Calling
        System.out.println("\n=== Account Comparison ===");
        if (Account1.sameHolder(Account2)) {
            System.out.println("These accounts belong to the same person.");
        } else {
            System.out.println("These accounts belong to different people.");
        }

        //Richer Holder
        BankAccount richerAccount = Account1.RicherHolder(Account2);
        System.out.println("\nAccount with more money:" + richerAccount);

        s.close();
    }
}