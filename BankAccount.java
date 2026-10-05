public class BankAccount {
    private String accountNumber;
    private String customerName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String customerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;

        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Error: Initial balance cannot be negative! Setting balance to $0.0");
            this.balance = 0.0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Error: Deposit amount must be greater than 0!");
        }
    }

    // Method to withdraw money (Update balance)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Error: Insufficient balance!");
        } else {
            System.out.println("Error: Withdrawal amount must be greater than 0!");
        }
    }

    // Display Account Information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Current Balance: $" + balance);
    }
}