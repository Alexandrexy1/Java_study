package entities;

public abstract class Taxpayer {
    protected String name;
    protected Double yearlyIncome;

    public Taxpayer(String name, double yearlyIncome) {
        this.name = name;
        this.yearlyIncome = yearlyIncome;
    }

    public abstract double taxCalculation();

    public String getName() {
        return this.name;
    }

    public double getYearlyIncome() {
        return this.yearlyIncome;
    }
}
