package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.Level;

public class Worker {
    private String department;
    private String name;
    private Level level;
    private Double salary;
    private ArrayList<Contract> contracts = new ArrayList<>();

    public Worker(String department, String name, Level level, double salary) {
        this.department = department;
        this.name = name;
        this.level = level;
        this.salary = salary;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getName() {
        return this.name;
    }

    public Level getLevel() {
        return this.level;
    }

    public double getSalary() {
        return this.salary;
    }

    public List<Contract> getContracts() {
        return this.contracts;
    }

    public void addContract(Contract contract) {
        this.contracts.add(contract);
    }

    public void setValueIncome(double value) {
        this.salary += value;
    }

    public String toString() {
        return "Department: " + department + " Name: " + name + " Level: " + level + " Salary: " + salary;
    }
}
