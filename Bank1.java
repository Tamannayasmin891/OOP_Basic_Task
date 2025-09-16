import java.util.*;

class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in account: " + accountNumber);
        }
    }

    public String toString() {
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
    }
}

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public Account getAccount(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        }
        return null;
    }

    public void displayAccounts() {
        for (Account acc : accounts) {
            System.out.println(acc);
        }
    }
}

public class Bank1 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account acc1 = new Account("Peter Irmgard", "C0011", 5000);
        Account acc2 = new Account("Katja Ruedi", "C0121", 4500);
        Account acc3 = new Account("Marcella Gebhard", "C0222", 20000);

        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        bank.displayAccounts();

        System.out.println("\nAfter depositing 1000 into account1:");
        acc1.deposit(1000);
        System.out.println(acc1);

        System.out.println("No transaction in account2:");
        System.out.println(acc2);

        System.out.println("After withdrawing 5000 from account3:");
        acc3.withdraw(5000);
        System.out.println(acc3);
    }
}
