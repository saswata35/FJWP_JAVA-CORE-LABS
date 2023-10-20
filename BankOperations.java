package BankOperations.java;

interface BankOperations1 {
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
}

class BankAccount implements BankOperations1 {
    private String accountHolderName;
    private String bankName;
    private double accountBalance;

    public BankAccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    @Override
    public double getBalance() {
        return accountBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited $" + amount + " into " + accountHolderName + "'s account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && accountBalance >= amount) {
            accountBalance -= amount;
            System.out.println("Withdrawn $" + amount + " from " + accountHolderName + "'s account.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public void displayBalance() {
        System.out.println(accountHolderName + "'s account balance at " + bankName + " is $" + accountBalance);
    }
}

public class BankOperations {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", "ICICI", 1000.0);
        BankAccount account2 = new BankAccount("Bob", "HDFC", 2000.0);
        BankAccount account3 = new BankAccount("Charlie", "SBI", 1500.0);

        account1.displayBalance();
        account2.displayBalance();
        account3.displayBalance();

        account1.deposit(500.0);
        account2.withdraw(1000.0);
        account3.deposit(200.0);

        account1.displayBalance();
        account2.displayBalance();
        account3.displayBalance();
    }
}
