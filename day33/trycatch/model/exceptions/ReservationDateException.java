package model.exceptions;

public class ReservationDateException extends Exception {
    private static long serialVersionUID = 1L;

    public ReservationDateException(String message) {
        super(message);
    }
}
