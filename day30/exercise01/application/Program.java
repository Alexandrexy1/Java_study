package application;

import java.util.List;
import java.util.ArrayList;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        List<Account> listAccount = new ArrayList<>();

        listAccount.add(new BusinessAccount(1001, "Alex", 1000, 400));
        listAccount.add(new SavingsAccount(1002, "Lex", 1000, 0.5));

        double sum = 0;

        for (Account acc : listAccount) {
            sum += acc.getBalance();
        }

        System.out.println("Balance total: " + sum);
        
        for (Account acc : listAccount) {
            acc.deposit(10);
        }
        
        for (Account acc : listAccount) {
            System.out.println(acc.getBalance());
        }

    }
}