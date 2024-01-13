package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many items? ");
        int quantity = sc.nextInt();

        Product[] array = new Product[quantity];
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sc.nextLine();
            System.out.print("Product name: ");
            String name = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();

            array[i] = new Product(name, price);
        }

        for (int i = 0; i < array.length; i++) {
            sum += array[i].getPrice();
        }

        double averagePrice = sum / array.length;

        System.out.printf("Average price: %.2f", averagePrice);
        sc.close();
    }
}
