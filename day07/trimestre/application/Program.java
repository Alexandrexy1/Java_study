package trimestre.application;

import java.util.Locale;
import java.util.Scanner;

import trimestre.entities.TestScore;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        TestScore testScore = new TestScore();
        System.out.println("Notas do trimestre");
        System.out.print("Digite sua 1 nota: ");
        testScore.testScore1 = sc.nextFloat();
        System.out.print("Digite sua 2 nota: ");
        testScore.testScore2 = sc.nextFloat();
        System.out.print("Digite sua 3 nota: ");
        testScore.testScore3 = sc.nextFloat();
        System.out.println(testScore);

        sc.close();
    }
}
