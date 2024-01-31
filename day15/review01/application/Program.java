package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("New product");
        System.out.print("Product name: ");
        String name = sc.nextLine();
        System.out.print("Product price: ");
        double price = sc.nextDouble();
        System.out.print("Product quantity? ");
        int quantity = sc.nextInt();
        Product product1 = new Product(name, price, quantity);
        Product product2 = new Product(name, price);
        Product product3 = new Product();

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        sc.close();
    }
}