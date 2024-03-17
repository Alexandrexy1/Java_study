package entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance;
    
    public Account() {}

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
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

    public void withdraw(Double amount) {
        this.balance -= amount;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }
}


