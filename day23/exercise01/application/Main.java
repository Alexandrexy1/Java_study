package application;

import java.time.LocalDateTime;
import java.time.ZoneId;


import entities.Order;
import entities.enums.OrderStatus;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(430, LocalDateTime.now(ZoneId.systemDefault()), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus orderStatus = OrderStatus.PENDING_PAYMENT;
        OrderStatus orderStatus2 = OrderStatus.valueOf("PENDING_PAYMENT");
        System.out.println(orderStatus);
        System.out.println(orderStatus2);
    }
}