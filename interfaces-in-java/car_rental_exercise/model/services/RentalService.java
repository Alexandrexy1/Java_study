package car_rental_exercise.application.model.services;

import java.time.Duration;

import car_rental_exercise.application.model.entities.CarRental;
import car_rental_exercise.application.model.entities.Invoice;



public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;
    private TaxService brazilTaxService;

    public RentalService (double pricePerHour, double pricePerDay, TaxService brazilTaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.brazilTaxService = brazilTaxService;
    }

    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getPickupDate(), carRental.getReturnDate()).toMinutes();
        double hours = minutes / 60;
        double basicPayment;

        if (hours > 12 ) basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        else basicPayment = pricePerHour * Math.ceil(hours);

        double tax = brazilTaxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }
}
