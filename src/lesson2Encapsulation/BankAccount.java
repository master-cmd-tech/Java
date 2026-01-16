package lesson2Encapsulation;

public class BankAccount {
    private int cents;

    public BankAccount() {

    }

    public BankAccount(int dollar, int cents) {
        deposit(dollar, cents);
    }

    public void deposit(int dollar) {
        cents += dollar * 100;
    }

    public void deposit(int dollar, int cents) {
        this.cents += dollar * 100 + cents;
    }

    public double getBalance() {
        return cents / 100.0;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance:" + getBalance() +
                '}';
    }
}
