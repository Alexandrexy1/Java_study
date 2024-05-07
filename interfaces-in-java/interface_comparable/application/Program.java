package application;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;


public class Program {
    public static void main(String[] args) {
        String pathFile = "C:\\Users\\Alex\\OneDrive\\Documentos\\Projects\\example.txt";
        List<Employee> employeeList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            String namesCsv = br.readLine();

            while (namesCsv != null) {
                String[] fieldsEmployee = namesCsv.split(",");
    
                employeeList.add(new Employee(fieldsEmployee[0], Double.parseDouble(fieldsEmployee[1])));
                namesCsv = br.readLine();
            }

            Collections.sort(employeeList);

            for (Employee employee: employeeList) {
                System.out.println(employee.getName() + " R$ " + employee.getSalary());
            }

        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

// Output: Maria DataBase R$ 5400.0
// Jeffrey Carmin R$ 4200.0
// Post gresql R$ 3900.0
// Alex Nascimento R$ 3100.0
// Diog enson R$ 2700.0
// My SQL R$ 2500.0