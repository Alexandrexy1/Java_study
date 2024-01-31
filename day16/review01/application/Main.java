package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Length Array: ");
        int lengthArray = sc.nextInt();
        
        double[] heightarray = new double[lengthArray];

        for (int i = 0; i < lengthArray; i++) {
            System.out.print("Height " + i + 1 + ": ");
            heightarray[i] = sc.nextDouble();
        }

        double avgHeight = averageHeight(heightarray);
        System.out.println(avgHeight);

        sc.close();
    }

    private static double averageHeight(double[] array) {
        double newArray = 0;
        for (int i = 0; i < array.length; i ++) newArray += array[i];
        return newArray / array.length;
    }

}