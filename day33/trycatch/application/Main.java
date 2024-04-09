package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.ReservationDateException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkIn = LocalDate.parse(sc.next(), formatter);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkOut = LocalDate.parse(sc.next(), formatter);
            
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println(reservation);
            
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkInUpdate = LocalDate.parse(sc.next(), formatter);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkOutUpdate = LocalDate.parse(sc.next(), formatter);
            reservation.updateDates(checkInUpdate, checkOutUpdate);
            System.out.println(reservation);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid Date Format");
        } catch (ReservationDateException e) {
            System.out.println("Error in update reservation: " + e.getMessage());
        }
        finally {
            sc.close();
        }

    }
}