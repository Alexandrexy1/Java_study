package entities;

public class Employee {
    private String name;
    protected Integer hours;
    protected Double valuePerHour;

    public Employee(String name, int hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }
    
    public double payment() {
        return this.hours * this.valuePerHour;
    }

    public String getName() {
        return this.name;
    }

    public Integer getHours() {
        return this.hours;
    }

    public Double getValuePerHour() {
        return this.valuePerHour;
    }

    public String toString() {
        return name + " -  $ " + payment(); 
    }
}
