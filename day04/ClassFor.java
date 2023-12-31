import java.util.Scanner;

public class ClassFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número para parar: ");
        int numeroParar = sc.nextInt();

        for (int i = 0; i <= numeroParar; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
