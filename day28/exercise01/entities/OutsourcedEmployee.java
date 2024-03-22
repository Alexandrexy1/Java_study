package entities;

public final class OutsourcedEmployee extends Employee {
    private Double additionalCharge;

    public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + this.additionalCharge * 1.1;
    }

    public Double getAdditionalCharge() {
        return this.additionalCharge;
    }

}
