public class BankRunner {

    public static void main(String[] args) {
        Bank account = new Bank(1000.0, "Swathi");

        account.getAccountHolderName();
        account.getAccountBalance();
        
        account.depositMoney(500.0);
        account.withdrawMoney(200.0);
        account.getRemainingBalance();
    }
}


