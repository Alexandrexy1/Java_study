package application;

import entities.Bank;

public class Program {
    public static void main(String[] args) {
        Bank bank = new Bank(3012, "Alex");
        bank.deposit(300);
        System.out.println(bank.getNumberAccount());
    }
}