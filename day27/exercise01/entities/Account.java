package entities;

public class Account {
    private Integer number;
    private String name;
    protected Double balance;

    public Account(int number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double value) {
        this.balance -= value + 5.0;
    }

    public void deposit(double value) {
        this.balance += value;
    } 

    public Integer getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public Double getBalance() {
        return this.balance;
    }
}
