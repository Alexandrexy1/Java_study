package exercise;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual o máximo de alturas no array? ");
        int quantity = sc.nextInt();
        
        double[] array = new double[quantity];
        double sum = 0;

        for (int i=0; i < quantity; i++) {
            System.out.print("Digite a altura: ");
            array[i] = sc.nextDouble();
        }
        

        for (int i = 0; i < quantity; i++) {
            sum += array[i];
        }

        System.out.println("################");
        double average = sum / quantity;
        System.out.printf("Altura média: %.2f", average);
        sc.close();
    }
}