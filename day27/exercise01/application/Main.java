package application;

import entities.Account;
import entities.BusinessAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1010, "Alexandre", 300);
        Account bacc = new BusinessAccount(1020, "Alexandre", 300, 500);
        acc.withdraw(200);
        System.out.println(acc.getBalance());
        bacc.withdraw(200);
        System.out.println(bacc.getBalance());
    }
}