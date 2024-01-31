package entities;


public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {}


    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double price() {
        return this.price;
    }

    public int quantity() {
        return this.quantity;
    }

    public String toString() {
        return "Name Product: " + name + " | Price: " + price + " | Quantity: " + quantity;
    }
}
