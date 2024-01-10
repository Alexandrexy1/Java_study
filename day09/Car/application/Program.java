package application;

import entities.Car;


public class Program {
    public static void main(String[] args) {
        Car car = new Car("Bugatti");
        System.out.println(car.getBrand());

    }
}