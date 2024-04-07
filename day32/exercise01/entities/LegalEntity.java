package entities;

public final class LegalEntity extends Taxpayer {
    private Integer employeeQuantity;

    public LegalEntity(String name, double yearlyIncome, int employeeQuantity) {
        super(name, yearlyIncome);
        this.employeeQuantity = employeeQuantity;
    }

    @Override
    public double taxCalculation() {
        if (employeeQuantity < 10)  return yearlyIncome * 0.16;
        else return yearlyIncome * 0.14;

    }

    public Integer getEmployeeQuantity() {
        return this.employeeQuantity;
    }
}
