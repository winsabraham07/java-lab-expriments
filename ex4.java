class Account {
    String accountHolder;
    long accountNumber;

    Account(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    void displayDetails() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
    }
}

class SavingsAccount extends Account {

    SavingsAccount(String accountHolder, long accountNumber) {
        super(accountHolder, accountNumber);
    }

    void displaySavings() {
        System.out.println("Account Type   : Savings Account");
    }
}

class CurrentAccount extends Account {

    CurrentAccount(String accountHolder, long accountNumber) {
        super(accountHolder, accountNumber);
    }

    void displayCurrent() {
        System.out.println("Account Type   : Current Account");
    }
}

class PremiumSavingsAccount extends SavingsAccount {

    PremiumSavingsAccount(String accountHolder, long accountNumber) {
        super(accountHolder, accountNumber);
    }

    void displayPremium() {
        System.out.println("Account Type   : Premium Savings Account");
    }
}

public class ex4 {
    public static void main(String[] args) {

        SavingsAccount savings =
            new SavingsAccount("Wins Abraham", 10001);

        CurrentAccount current =
            new CurrentAccount("John", 10002);

        PremiumSavingsAccount premium =
            new PremiumSavingsAccount("David", 10003);

        System.out.println("--- Savings Account ---");
        savings.displayDetails();
        savings.displaySavings();

        System.out.println("\n--- Current Account ---");
        current.displayDetails();
        current.displayCurrent();

        System.out.println("\n--- Premium Savings Account ---");
        premium.displayDetails();
        premium.displaySavings();
        premium.displayPremium();
    }
}