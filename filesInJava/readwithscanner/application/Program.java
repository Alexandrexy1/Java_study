package readwithscanner.application;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        Scanner sc = null;
        File file = new File("C:\\Users\\Alex\\test.txt");    

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine()); // Hello, dude! | Good morning!
            }
        } catch(IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            if (sc != null) sc.close();
        }

    }
}