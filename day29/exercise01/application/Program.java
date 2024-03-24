package application;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import entities.*;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> productList = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            sc.nextLine();
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char pState = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            if (pState == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = sc.nextLine();
                productList.add(new UsedProduct(name, price, LocalDate.parse(manufactureDate, dtf)));

            } else if (pState == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                productList.add(new ImportedProduct(name, price, customsFee));

            } else productList.add(new Product(name, price));
        }

        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i).priceTag());
        }

        sc.close();
    }
}