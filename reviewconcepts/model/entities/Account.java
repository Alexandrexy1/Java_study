package model.entities;

import model.exception.WithdrawValueException;

public abstract class Account {
    protected String name;
    protected String number;
    protected Double balance;

    public Account(String name, String number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public void withdraw(double value) throws WithdrawValueException {
        if (value > this.balance) throw new WithdrawValueException("Insufficient funds.");
        this.balance -= value;
    };

    public void deposit(double value) {
        this.balance += value;
    };

    public String details() {
        return "Name: " + name + " Number: " + number + " Balance: " + balance;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public Double getBalance() {
        return balance;
    }

    public String toString() {
        return details();
    }
}
