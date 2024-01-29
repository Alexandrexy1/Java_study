package entities;

public class Bank {
    private String account;
    private double balance;

    public Bank(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public void deposit(double quantity) {
        this.balance += quantity;
        System.out.println(toString());
    }
    
    public void withdraw(double quantity) {
        if (quantity > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        this.balance -= quantity;
        System.out.println("withdraw successful.");
        System.out.println(toString());
    }

    public String toString() {
        return "Account: " + account + " | Balance: " + balance;
    }
    
}
