package writewithfilewriter.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] linesFile = new String[] { "Hello Guys", "How're u?", "I'm good!" };
        String path = "C:\\Users\\Alex\\test2.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for(String lineFile: linesFile) {
                bw.write(lineFile + "\n"); // Hello Guys | How're u? | I'm good!
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {

        }
    }
}
