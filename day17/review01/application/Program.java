package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Quantidade de produtos: ");
        int quantity = sc.nextInt();
        Product[] productArray = new Product[quantity];
        double avgPrice = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.print("Nome produto: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("Preço produto: ");
            double price = sc.nextDouble();
            productArray[i] = new Product(name, price);
        }

        for (int i = 0; i < productArray.length; i++) {
            avgPrice += productArray[i].getPrice();
        }
        System.out.println("Average price: " + (avgPrice / productArray.length));

        sc.close();
    }
}