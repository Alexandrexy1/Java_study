package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hostel;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented? ");
        int num = sc.nextInt();
        sc.nextLine();

        Hostel[] hostel = new Hostel[10];
        
        for (int i = 1; i < (num + 1) ; i++) {
            System.out.println("Rent: #" + i);
            System.out.print("Name: ");
            String student = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int bedroom = sc.nextInt();
            sc.nextLine();

            hostel[i] = new Hostel(student, email, bedroom);
        }

        for (int i = 0; i < hostel.length; i++) {
            if (hostel[i] != null) System.out.println("Rent " + hostel[i].getBedroom() + ": " + hostel[i].toString());
        }
        
        sc.close();
    }
}