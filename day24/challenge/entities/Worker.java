package entities;

import entities.enums.Level;

public class Worker {
    private String department;
    private String name;
    private Level level;
    private Double salary;
    private Contract[] contracts;

    public Worker(String department, String name, Level level, double salary, Contract[] contracts) {
        this.department = department;
        this.name = name;
        this.level = level;
        this.salary = salary;
        this.contracts = contracts;
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

    public Contract[] getContracts() {
        return this.contracts;
    }

    public void setSalary(double value) {
        this.salary = value;
    }

    public String toString() {
        return "Department: " + department + " Name: " + name + " Level: " + level + " Salary: " + salary;
    }
}
