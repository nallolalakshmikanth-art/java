public class BankAccount1 {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;

    public BankAccount(String accountNumber, String accountHolderName, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, String accountHolderName,
                       String accountType, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : " + balance);
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("1000000", "Rahul", "SAVINGS");

        BankAccount acc2 = new BankAccount("99999999", "pandu", "CURRENT", 5000);

        acc1.deposit(2000);
        acc1.withdraw(500);
        acc2.deposit(1000);
        acc2.withdraw(3000);

        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
    }
}