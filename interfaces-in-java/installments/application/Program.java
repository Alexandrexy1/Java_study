package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import models.entities.Contract;
import models.entities.Installment;
import models.services.ContractService;
import models.services.PaypalService;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the contract data:");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), dtf);

        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        System.out.print("Number of installments: ");
        int months = sc.nextInt();

        Contract contract = new Contract(number, date, totalValue);

        ContractService service = new ContractService(new PaypalService());
        service.processContract(contract, months);

        System.out.println("Installments:");
        for (Installment installment: contract.getInstallments()) {
            System.out.println(installment);
        }
        sc.close();
    }
}