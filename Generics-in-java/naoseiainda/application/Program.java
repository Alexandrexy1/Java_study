package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import models.entities.Product;
import models.services.CalculationMax;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        
        String path = "C:\\Users\\Alex\\OneDrive\\Documentos\\Projects\\example.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            System.out.println("Products:");
            String line = br.readLine();

            while (line != null) {
                String[] productFields = line.split(",");
                productList.add(new Product(productFields[0], Double.parseDouble(productFields[1])));        
                line = br.readLine();
            }
            
            Product expensiveProduct = CalculationMax.max(productList);

            System.out.println("Most expensive:");
            System.out.println(expensiveProduct); // name: IPhone 15 | price: 3200.0
            
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
