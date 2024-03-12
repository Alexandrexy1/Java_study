package application;

import java.time.LocalDate;
import java.util.Scanner;

import java.time.format.DateTimeFormatter;

import entities.Contract;
import entities.Worker;
import entities.enums.Level;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        DateTimeFormatter dataformatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();

        System.out.println("Enter worker data:");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        String level = sc.nextLine();

        System.out.print("Base salary: ");
        double salary = sc.nextDouble();


        System.out.print("How many contracts to this worker? ");
        int quantity = sc.nextInt();

        Contract[] contracts = new Contract[quantity];
    
        // registra data, valor e duração do(s) contrato(s).
        for (int i = 0; i < quantity; i++) {
            sc.nextLine();

            System.out.printf("Enter contract #%d data:", i + 1);
            System.out.println();

            System.out.print("Date (DD/MM/YYYY): ");
            String data = sc.nextLine();

            System.out.print("Value per hour: ");
            double value = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();

            LocalDate dataformatted = LocalDate.parse(data, dataformatter);
            
            contracts[i] = new Contract(dataformatted, value, duration);
        }

        Worker worker = new Worker(department, name, Level.valueOf(level), salary, contracts);
        
        sc.nextLine();

        // Aqui mostra o quanto a pessoa ganhou em determinado mês
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthWorker = sc.nextLine();

        System.out.print("Name: ");
        String nameWorker = sc.nextLine();

        System.out.print("Department: ");
        String departmentWorker = sc.nextLine();

        double subTotal = 0;
        
        if (nameWorker.equals(worker.getName()) && departmentWorker.equals(worker.getDepartment())) {
            for (int i = 0; i < worker.getContracts().length; i++) {

                if (monthWorker.equals(worker.getContracts()[i].monthAndYear())) {
                    subTotal += worker.getContracts()[i].getValue() * worker.getContracts()[i].getDuration();
               }
           }
        }

        double salaryTotal = worker.getSalary() + subTotal;
        worker.setSalary(salaryTotal);

        System.out.printf("Income for %s: %.2f", monthWorker, worker.getSalary());

        sc.close();
    }
}
