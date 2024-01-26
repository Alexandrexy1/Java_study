package application;

import java.util.Scanner;

import entities.Person;


public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("FirstName: ");
        String firstName = scanner.nextLine();
        System.out.print("LastName: ");
        String lastName = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        Person person = new Person(firstName, lastName, age);

        System.out.println(person);

        scanner.close();
    }
}
