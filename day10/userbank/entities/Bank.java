package entities;

public class Bank {
    private String username;
    private int numberAccount;
    private double balance;

    public Bank(int numberAccount, String username) {
        this.numberAccount = numberAccount;
        this.username = username;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getUsername() {
        return username;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > balance) { 
            System.out.println("Insufficient funds.");
            return;
        }
        System.out.println("withdraw successfully.");
        details();
    }

    public void details() {
        System.out.println("Balance: " + balance + " Account: " + numberAccount);
    }
}
