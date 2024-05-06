package car_rental_exercise.application.model.entities;

import java.time.LocalDateTime;

public class CarRental {
    private LocalDateTime pickupDate;
    private LocalDateTime returnDate;
    private Invoice invoice;
    private Vehicle vehicle;


    public CarRental (LocalDateTime pickupDate, LocalDateTime returnDate, Vehicle vehicle) {
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.vehicle = vehicle;
    }

    public LocalDateTime getPickupDate() {
        return pickupDate;
    }
    
    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
