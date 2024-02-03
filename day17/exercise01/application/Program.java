package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantity people: ");
        int quantity = sc.nextInt();

        People[] peopleArray = new People[quantity];

        for (int i = 0; i < quantity; i++) {
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("height: ");
            double height = sc.nextDouble();

            peopleArray[i] = new People(name, age, height);
        }

        double peopleOver16 = 0;
        double averageHeight = 0;

        for (int i = 0; i < peopleArray.length; i++) {
            if (peopleArray[i].getAge() >= 16) peopleOver16 += 1;
            averageHeight += peopleArray[i].getHeight();
        }
        
        double peoplePercent = (peopleOver16 / peopleArray.length) * 100;
        double avgHeight = averageHeight / peopleArray.length;
 
        System.out.printf("percentage of people 16 or over %.2f", peoplePercent);
        System.out.println();
        System.out.printf("Average height: %.2f", avgHeight);

        sc.close();
    }
}