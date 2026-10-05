public class Question2 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("ACC-6240272", "Faiza Abdirahman", 500.00);

        System.out.println("--- Initial Account Details ---");
        account1.displayAccountInfo();

        System.out.println("--- Performing Deposit ---");
        account1.deposit(250.00);
        System.out.println("Updated Balance: $" + account1.getBalance());
        System.out.println();

        System.out.println("--- Performing Withdrawal ---");
        account1.withdraw(100.00);
        System.out.println("Updated Balance: $" + account1.getBalance());
        System.out.println();

        System.out.println("--- Testing Invalid Withdrawal ---");
        account1.withdraw(1000.00);
        System.out.println();

        System.out.println("--- Final Account Details ---");
        account1.displayAccountInfo();
    }
}