package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Individual;
import entities.LegalEntity;
import entities.Taxpayer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Taxpayer> taxpayersList = new ArrayList<>();
        double totalTax = 0;

        System.out.print("Enter the number of tax payers: ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            sc.nextLine();
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char payerIdentity = sc.nextLine().charAt(0);
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Yearly Income: ");
            double yearlyIncome = sc.nextDouble();

            if (payerIdentity == 'i') {
                System.out.print("Health expenditures: ");
                double healthSpending = sc.nextDouble();
                taxpayersList.add(new Individual(name, yearlyIncome, healthSpending));

            } else if (payerIdentity == 'c') {
                System.out.print("Number of employees: ");
                int employeeQuantity = sc.nextInt();
                taxpayersList.add(new LegalEntity(name, yearlyIncome, employeeQuantity));
            }
            System.out.println();
        }

        System.out.println("TAXES PAID:");
        for (Taxpayer taxpayer: taxpayersList) {
            System.out.println(taxpayer.getName() + ": $ " + String.format("%.2f", taxpayer.taxCalculation()) );
            totalTax += taxpayer.taxCalculation();
        }
        System.out.println();
        System.out.println("TOTAL TAX: " + totalTax);

        sc.close();
    }

}