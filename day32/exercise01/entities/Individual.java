package entities;

public final class Individual extends Taxpayer {
    private Double healthSpending;

    public Individual(String name, double yearlyIncome, double healthSpending) {
        super(name, yearlyIncome);
        this.healthSpending = healthSpending;
    }

    @Override
    public double taxCalculation() {
        if (yearlyIncome < 20000) {
            if (healthSpending > 0) return yearlyIncome * 0.15 - healthSpending * 0.5;
            return yearlyIncome * 0.15;
        } else {
            if (healthSpending > 0) return yearlyIncome * 0.25 - healthSpending * 0.5;
            return yearlyIncome * 0.25;
        }
    }
    

    public Double getHealthSpending() {
        return this.healthSpending;
    }
}
