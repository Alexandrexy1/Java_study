package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.time.temporal.ChronoUnit;

import model.exceptions.ReservationDateException;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation() {}

    public Reservation(int roomNumber, LocalDate checkIn, LocalDate checkOut) throws ReservationDateException {
        if (checkOut.isBefore(checkIn)) {
            throw new ReservationDateException("check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duration() {
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) throws ReservationDateException {
        if (checkIn.isBefore(this.checkIn) || checkOut.isBefore(this.checkOut)) {
            throw new ReservationDateException("Reservation date for update must be future dates");
        } else if (checkOut.isBefore(checkIn)) {
            throw new ReservationDateException("Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    

    public Integer getRoomNumber() {
        return this.roomNumber;
    }

    public LocalDate getCheckIn() {
        return this.checkIn;
    }

    public LocalDate getCheckOut() {
        return this.checkOut;
    }

    @Override
    public String toString() {
        return "Reservation: Room " + roomNumber + ", check-in: " + dtf.format(checkIn) + 
            ", check-out: " + dtf.format(checkOut) + ", " + duration() + " nights";
    }
}

