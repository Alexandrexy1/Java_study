package car_rental_exercise.application.model.entities;

public class Invoice {
    private Double basicPayment;
    private double tax;

    public Invoice(double basicPayment, double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public double totalPayment() {
        return basicPayment + tax;
    }

    public double getTax() {
        return tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }
}
