public class Bank {
    private double balance;
    private String accountHolderName;

    public Bank(double initialBalance, String initialAccountHolderName) {
        balance = initialBalance;
        accountHolderName = initialAccountHolderName;
    }

    public void getAccountBalance() {
        System.out.println("Account Balance: " + balance);
    }

    public void getAccountHolderName() {
        System.out.println("Account Holder: " + accountHolderName);
    }

    public void getRemainingBalance() {
        System.out.println("Remaining Balance: " + balance);
    }

    public void depositMoney(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New Balance: " + balance);
    }

    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
