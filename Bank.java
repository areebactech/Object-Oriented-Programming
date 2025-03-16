class BankAccount {
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;

    // Constructor to set initial values
    public BankAccount(String name, String accNumber, String type, double initialBalance) {
        this.depositorName = name;
        this.accountNumber = accNumber;
        this.accountType = type;
        this.balance = initialBalance;
    }

    // deposit method to add money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Hey " + depositorName + "! You've deposited " + amount + ". Your new balance is: " + balance);
        } else {
            System.out.println("Oops! Deposit amount must be greater than 0.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! " + amount + " has been deducted. Remaining balance: " + balance);
        } else {
            System.out.println("Sorry " + depositorName + ", you either don't have enough balance or entered an invalid amount.");
        }
    }

    // Method to display name and balance
    public void display() {
        System.out.println("Hello " + depositorName + "! Your account number is: " + accountNumber + " and account type is: " + accountType);
        System.out.println("Your current balance is: " + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Areeba", "123456789", "Savings", 5000);
        myAccount.display();
        myAccount.deposit(2000);
        myAccount.withdraw(1000);
        myAccount.display();
    }
}
