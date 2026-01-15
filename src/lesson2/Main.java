package lesson2;

public class Main {
    public static void main(String[] args) {
        /*
        Object object = new BankAccount();
        BankAccount account = new BankAccount();

        account.deposit(15);
        account.deposit(47, 24  );

        System.out.println(account);
        */

        //BankAccount[] accounts = new BankAccount[10];
        //ArrayList<BankAccount> accounts = new ArrayList<>();
        BankAccounts accounts = new BankAccounts();

        BankAccount account = new BankAccount();

        account.deposit(34);
        account.deposit(12, 56);

        accounts.add(account); //accounts.add(new BankAccount());

        accounts.add(new BankAccount(46,13));
        accounts.add(new BankAccount(17,99));
        accounts.add(new BankAccount(77,77));
        accounts.print();
        }
    }

