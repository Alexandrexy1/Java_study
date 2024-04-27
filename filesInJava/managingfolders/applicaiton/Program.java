package managingfolders.applicaiton;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String path = sc.nextLine();
        try {
            File folderPath = new File(path);

            File[] folders = folderPath.listFiles(File::isDirectory);

            System.out.println("Folders");
            
            for (File folder: folders) {
                System.out.println(folder);
            } 

        } finally {
            sc.close();
        }
       
    }
}
