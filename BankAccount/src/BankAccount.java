public class BankAccount {
    private String Holders_name;
    private String Acc_number;
    private double balance;

    // Constructor to initialize values
    public BankAccount(String h, String A, double b) {
        Holders_name = h;
        Acc_number = A;
        balance = Math.max(b, 0);
    }

    // Getter methods
    public String getHoldersName() {
        return Holders_name;
    }

    public String getAccNumber() {
        return Acc_number;
    }

    public double getBalance() {
        return balance;
    }

    // Setter methods
    public void setHoldersName(String h) {
        if (h != null && !h.trim().isEmpty()) {
            Holders_name = h;
        } else {
            System.out.println("Invalid Holder Name!");
        }
    }

    public void setAccNumber(String A) {
        if (A != null && !A.trim().isEmpty()) {
            Acc_number = A;
        } else {
            System.out.println("Invalid Account Number!");
        }
    }

    public void setBalance(double b) {
        if (b >= 0) {
            balance = b;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully. Current Balance: $" + balance);
        } else {
            System.out.println("Invalid! Amount must be greater than 0");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal Successful! New Balance: $" + balance);
            } else {
                System.out.println("Insufficient Funds!");
            }
        } else {
            System.out.println("Invalid Amount Entered!");
        }
    }

    // Comparison Method
    public boolean sameHolder(BankAccount otherAccount) {
        return this.Holders_name.equalsIgnoreCase(otherAccount.Holders_name);
    }

    // More Balance Account
    public BankAccount RicherHolder(BankAccount otherAccount) {
        return (this.balance > otherAccount.balance) ? this : otherAccount;
    }

    // Display Method
    @Override
    public String toString() {
        return Holders_name + "\nAccount Number: " + Acc_number + "\nBalance: $" + balance;
    }
}
