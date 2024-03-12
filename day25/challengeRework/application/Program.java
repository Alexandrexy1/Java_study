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
        
        Worker worker = new Worker(department, name, Level.valueOf(level), salary);


        System.out.print("How many contracts to this worker? ");
        int quantity = sc.nextInt();
    
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
            
            worker.addContract(new Contract(dataformatted, value, duration));
        }

        
        sc.nextLine();

        // Aqui mostra o quanto a pessoa ganhou em determinado mês
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthWorker = sc.nextLine();
        double subTotal = 0;

        System.out.printf("Name: %s", worker.getName());
        System.out.println();
        System.out.printf("Department: %s", worker.getDepartment());
        System.out.println();
    
        for (int i = 0; i < worker.getContracts().size(); i++) {
            if (monthWorker.equals(worker.getContracts().get(i).monthAndYear())) {
                subTotal += worker.getContracts().get(i).subTotal();
            }
        }
        
        worker.setValueIncome(subTotal);

        System.out.printf("Income for %s: %.2f", monthWorker, worker.getSalary());

        sc.close();
    }
}
