package entities;
import java.time.LocalDateTime;

import entities.enums.OrderStatus;
import java.time.format.DateTimeFormatter;

public class Order {
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    private Integer id;
    private LocalDateTime moment;
    private OrderStatus status;
    

    public Order(int id, LocalDateTime moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public int getId() {
        return this.id;
    }

    public LocalDateTime getMoment() {
        return this.moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String MomentFormatted() {
        return dtf.format(moment);
    }

    public String toString() {
        return this.id + " " + this.MomentFormatted() + " " + this.status;
    }
}