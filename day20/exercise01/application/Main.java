package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Matriz length: ");
        int num = sc.nextInt();
        int negativeLength = 0;

        int[][] bid = new int[num][num];
        ArrayList<Integer> diagonalMain = new ArrayList<>();
    
        for (int line = 0; line < bid.length; line++) {
            for (int col = 0; col < bid.length; col++) {
     
                bid[line][col] = sc.nextInt();
                if (bid[line][col] < 0) negativeLength++;
            }
        }


        for (int line = 0; line < bid.length; line++) {
            System.out.println();
            for (int col = 0; col < bid[line].length; col++) {
                if (bid[line] == bid[col]) {
                    diagonalMain.add(bid[line][col]);
                }
                
                System.out.print(bid[line][col] + " ");
            }
        }
        System.out.println();
        System.out.println("Diagonal main: " + diagonalMain + ", negative Numbers: " + negativeLength);
        sc.close();
    }
}