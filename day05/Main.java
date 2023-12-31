import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int resultado = max(a, b, c);
        System.out.println("O maior é o " + resultado);
        sc.close();
    }

    public static int max(int a, int b, int c) {
        if (a > b && a > c) return a;
        if (b > a && b > c) return b;
        else return c;
    }
}
