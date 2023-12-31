package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Dados do produto");
        System.out.print("Nome: ");
        product.name = sc.nextLine();
        System.out.print("Preço: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade: ");
        product.quantity = sc.nextInt();

        System.out.println(product.totalValue());
        
        System.out.printf("Adicionar mais %s: ", product.name);
        product.addProduct(sc.nextInt());
        
        System.out.println(product.totalValue());
        
        System.out.printf("Remover alguma %s: ", product.name);
        product.removeProduct(sc.nextInt());
        
        System.out.println(product.totalValue());

        sc.close();
    }
}
