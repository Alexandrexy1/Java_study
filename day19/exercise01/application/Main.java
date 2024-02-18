package application;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Employee;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees? ");
        int amount = sc.nextInt();
        int id = 0;
        sc.nextLine();
        Employee[] employes = new Employee[amount];
        List<Employee> listEmployees = new ArrayList<>();        
        
        
        for (int i = 0; i < amount; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Id: ");
            id = sc.nextInt();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            
            employes[i] = new Employee(name, id, salary);
            listEmployees.add(employes[i]);
        }
        
        List<Integer> listId = listEmployees.stream().map(employee -> employee.getId()).collect(Collectors.toList());
        System.out.print("Employee id receive salary increase: ");
        id = sc.nextInt();

        while (!listId.contains(id)) {
            System.out.println("this id doesn't exists.");
            System.out.print("Employee id receive salary increase: ");
            id = sc.nextInt();
        }
        System.out.print("Percentage: "); 
        double percentage = sc.nextDouble();

        for (int i = 0; i < employes.length; i++) {
            if (employes[i].getId() == id) {
                employes[i].increaseSalary(percentage);
            }
        }

        for (int i = 0; i < employes.length; i++) {
            System.out.println(employes[i].toString());
        }
        sc.close();
    }
}