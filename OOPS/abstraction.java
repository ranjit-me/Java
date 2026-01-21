package OOPS;

abstract class BankAccount {
    protected double balance;

    abstract void addBalance(double amount);
    abstract void canUserWithdraw(double amount);

    void updateBalance(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }
}

class SavingAccount extends BankAccount {

    void addBalance(double amount) {
        updateBalance(getBalance() + amount);
    }

    void canUserWithdraw(double amount) {
        if (amount <= getBalance()) {
            System.out.println("User can withdraw from Saving Account");
        } else {
            System.out.println("User cannot withdraw from Saving Account");
        }
    }
}

class CurrentAccount extends BankAccount {
    double minimumLimit = 1000.0;

    void addBalance(double amount) {
        updateBalance(getBalance() + amount);
    }

    void canUserWithdraw(double amount) {
        if (getBalance() - amount >= minimumLimit) {
            System.out.println("User can withdraw from Current Account");
        } else {
            System.out.println("User cannot withdraw (Minimum balance required)");
        }
    }
}

public class abstraction {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingAccount();
        acc1.addBalance(3000);
        acc1.canUserWithdraw(2000);

        BankAccount acc2 = new CurrentAccount();
        acc2.addBalance(6000);
        acc2.canUserWithdraw(5500);
    }
}
