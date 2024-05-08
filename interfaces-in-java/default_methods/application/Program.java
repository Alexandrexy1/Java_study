package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BrazilInterestService;
import entities.EuaInterestService;
import entities.InterestService;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Months: ");
        int months = sc.nextInt();

        System.out.println("Payment after 3 months:");
        InterestService bis = new BrazilInterestService(2.0);
        InterestService eis = new EuaInterestService(1.0);

        System.out.println(bis.payment(amount, months));
        System.out.println(eis.payment(amount, months));
        
        sc.close();
    }
}