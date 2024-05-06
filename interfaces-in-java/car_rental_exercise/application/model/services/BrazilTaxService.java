package car_rental_exercise.application.model.services;

public class BrazilTaxService implements TaxService {
    public BrazilTaxService() {}

    @Override
    public Double tax(double basePayment) {
        if (basePayment < 100) return basePayment * 0.2;
        else return basePayment * 0.15;
    }
}