package entities;

public abstract class Account {
    protected Integer number;
    protected String holder;
    protected Double balance;

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public void withdraw(double value) {
        if (balance > value) this.balance -= value;
        else System.out.println("Insufficient funds.");
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public Integer getNumber() {
        return this.number;
    }

    public String getHolder() {
        return this.holder;
    }

    public Double getBalance() {
        return this.balance;
    }
}
