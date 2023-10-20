//Input:-
//Package Name:-
package BankAccount_java;
//Class Name:-
public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    // Constructor
    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and setters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(int amount) {
        balance += amount;
    }

    // Withdraw method
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for withdrawal");
        }
    }

    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("Saswata Banerjee", 12345, 10000);

        // Withdraw and deposit
        account.withdraw(2000);
        account.deposit(1000);

        // Get the balance
        int currentBalance = account.getBalance();

        // Determine the status
        String status = (currentBalance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";

        // Display the status
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + currentBalance);
        System.out.println("Status: " + status);
    }
}

/*Output:-
Account Holder: Saswata Banerjee
Account Number: 12345
Current Balance: 9000
Status: Minimum Balance Maintained
*/