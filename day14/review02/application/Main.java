package application;

import java.util.Scanner;

import entities.Bank;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Bank Banks");
        System.out.print("Account: ");
        String acc = sc.nextLine();
        System.out.print("Amount: ");
        double balance = sc.nextDouble();
        Bank bank = new Bank(acc, balance);
        bank.deposit(3000);
        sc.close();

    }
}