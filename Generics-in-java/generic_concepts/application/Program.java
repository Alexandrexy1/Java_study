package application;

import java.util.Scanner;

import model.services.RandomListService;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RandomListService<String> stringList = new RandomListService<>();

        System.out.println("Random List!");
        System.out.print("How many values? ");
        int lengthList = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < lengthList; i++) {
            String value = sc.nextLine();
            stringList.addValue(value);
        }
        stringList.print();
        System.out.println("First: " + stringList.first());

        sc.close();
    }
}
