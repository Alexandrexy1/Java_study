package car_rental_exercise.application;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import car_rental_exercise.application.model.entities.CarRental;
import car_rental_exercise.application.model.entities.Vehicle;
import car_rental_exercise.application.model.services.BrazilTaxService;
import car_rental_exercise.application.model.services.RentalService;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Enter rental data");

        try {
            System.out.print("Car model: ");
            Vehicle vehicle = new Vehicle(sc.nextLine());
    
            System.out.print("Pickup (dd/MM/yyyy HH:mm): ");
            LocalDateTime pickupData = LocalDateTime.parse(sc.nextLine(), dtf);
            
            System.out.print("Return (dd/MM/yyyy HH:mm): ");
            LocalDateTime returnData = LocalDateTime.parse(sc.nextLine(), dtf);

            CarRental carRental = new CarRental(pickupData, returnData, vehicle);

            System.out.print("Enter price per hour: ");
            double pricePerHour = sc.nextDouble();
    
            System.out.print("Enter price per day: ");
            double pricePerDay = sc.nextDouble();

            RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
            rentalService.processInvoice(carRental);

            System.out.println("INVOICE");
            System.out.println("Basic payment: R$ " +  String.format("%.2f", carRental.getInvoice().getBasicPayment()));
            System.out.println("Tax: R$ " + String.format("%.2f", carRental.getInvoice().getTax()));
            System.out.println("Total Payment: R$ " + String.format("%.2f", carRental.getInvoice().totalPayment()));
            
        } catch (DateTimeException e) {
            throw new DateTimeException("Erro: " + e.getMessage());
        } catch(InputMismatchException e) {
            throw new InputMismatchException("Invalid input: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}