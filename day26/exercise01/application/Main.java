package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1001, "Alexandre", 10.0);
        BusinessAccount bAccount = new BusinessAccount(1002, "Elon", 0.0, 500.0);

        Account account1 = new BusinessAccount(1003, "Erdnaxela", 0.0, 400.0);
        Account account2 = new SavingAccount(1004, "Random", 0.0, 0.05);
        

        BusinessAccount bAccount1 = (BusinessAccount) account1;

        if (account2 instanceof BusinessAccount) {
            BusinessAccount bAccount2 = (BusinessAccount) account2;
            bAccount2.loan(200.0);
        }

        if (account2 instanceof SavingAccount) {
            SavingAccount sAccount = (SavingAccount) account2;
            sAccount.updateBalance();
        }
    }
}   