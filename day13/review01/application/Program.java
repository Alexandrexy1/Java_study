package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = sc.nextLine();
        System.out.print("Your age: ");
        int age = sc.nextInt();
        System.out.print("Your salary: ");
        double salary = sc.nextDouble();

        System.out.printf("name: %s | age %d | salary %.2f%n", name, age, salary);
        sc.close();
    }
}