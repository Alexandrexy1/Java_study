package application;

import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;



public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();
        
        System.out.print("Enter the number of employees: ");
        int quantity = sc.nextInt();
        
        for (int i = 0; i < quantity; i++) {
            sc.nextLine();
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (outsourced == 'y') { 
                System.out.print("Additional charge: ");
                double add = sc.nextDouble();  
                employeeList.add(new OutsourcedEmployee(name, hours, valuePerHour, add));
            } else employeeList.add(new Employee(name, hours, valuePerHour));
        }

        System.out.println("PAYMENTS");

        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }

        sc.close();
    }
}