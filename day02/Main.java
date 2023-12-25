import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        String x = sc.nextLine();
        String z = sc.nextLine();
        String y = sc.nextLine();
        System.out.println("Dados digitados: ");
        System.out.println(number);
        System.out.println(x);
        System.out.println(z);
        System.out.println(y);
        sc.close();
    }
}
