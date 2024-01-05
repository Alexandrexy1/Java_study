package calculator.application;

import java.util.Locale;
import java.util.Scanner;
import calculator.util.Calculator;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        double circunferencia = Calculator.circunferencia(raio);
        double volume = Calculator.volume(raio);

        System.out.printf("Circunferência: %.2f %n", circunferencia);
        System.out.printf("Volume: %.2f %n", volume);

        sc.close();
    }
}
