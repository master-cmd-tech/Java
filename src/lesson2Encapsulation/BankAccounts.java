package lesson2Encapsulation;

public class BankAccounts {
    private BankAccount[] accounts;
    private int buffer = 3;
    private int size;

    public BankAccounts() {
        accounts = new BankAccount[buffer];
    }

    private void increaseBuffer() {
        buffer = buffer * 2;

        BankAccount[] newAccounts = new BankAccount[buffer];

        for (int i = 0; i < accounts.length ; i++) {
            newAccounts[i] = accounts[i];
        }
        accounts = newAccounts;
        System.out.println("Buffer is increased!");
    }

    public void add(BankAccount account) {
        if (size == buffer) {
            increaseBuffer();
        }
        accounts[size++] = account;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(accounts[i]);
        }
    }
}
