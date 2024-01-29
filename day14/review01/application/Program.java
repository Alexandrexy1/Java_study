package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char answer; 
        do {
            System.out.print("2+2? ");
            int num = sc.nextInt();
            if (num == 4) System.out.println("U won.");
            else System.out.println("U lost");
            sc.nextLine();
            System.out.print("Wanna play again? ");
            answer = sc.next().charAt(0);

        } while (answer != 'n');
        sc.close();
    }
}