package application;

import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        int[] arrayNumbers = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.print("Number " + (i + 1) + ":" );
            arrayNumbers[i] = sc.nextInt();
        }

        System.out.println("Negative numbers: ");
        for (int i = 0; i < quantity; i++) {
            if (arrayNumbers[i] < 0) System.out.println(arrayNumbers[i]);
        }
        sc.close();
    }
}