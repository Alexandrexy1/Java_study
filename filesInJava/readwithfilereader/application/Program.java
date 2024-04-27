package readwithfilereader.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String pathFile = "C:\\Users\\Alex\\test.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line); // Hello, dude! | Good morning!
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
