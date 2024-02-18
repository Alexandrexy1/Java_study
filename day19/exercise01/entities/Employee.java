package entities;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee () {}
    
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }    

    public double salary() {
        return this.salary;
    }

    public void increaseSalary(double percentage) {
        this.salary = this.salary + (this.salary / percentage);
    }

    public String toString() {
        return "Id: " + id + " Emplyoee " + name + " Salary: " + salary;
    }
}
