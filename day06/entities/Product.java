package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValue() {
        return price * quantity;
    }

    public void addProduct( int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", " + "R$ " + String.format("%.2f", price) + " total de unidades: "
            + quantity + ", " + "valor total: " + String.format("%.2f", totalValue());
    }
}
