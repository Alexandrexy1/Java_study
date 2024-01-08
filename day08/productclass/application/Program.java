package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Product");
        System.out.print("Product name: ");
        String name = sc.nextLine();
        System.out.print("Product price: ");
        double price = sc.nextDouble();
        System.out.print("Product quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println(product);

        sc.close();
    }
}
