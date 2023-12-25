import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número de começo: ");
        int num = sc.nextInt();
        System.out.print("Digite um número de final: ");
        int finalNum = sc.nextInt();

        while (num <= finalNum) {
            System.out.println(num);
            num++;
        }

        sc.close();
    }
}
