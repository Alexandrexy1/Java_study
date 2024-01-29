package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite algo abaixo");
        String random = sc.nextLine();

        if (random.length() >= 0 && random.length() <= 9) System.out.println("Você digitou muito pouco!");
        else if (random.length() >= 10 && random.length() <= 14) System.out.println("Você digitou bem!");
        else if (random.length() >= 15 && random.length() <= 19) System.out.println("Você digitou demais!");
        else System.out.println("Você digitou tanto que uma mente humana é incapaz de compreender.");

        System.out.println("Digite o número do dia da semana");
        int num = sc.nextInt();

        switch(num) {
            case 1:
                System.out.println("Domingo!");
                break;
            case 2:
                System.out.println("Segunda-feira!");
                break;
            case 3: 
                System.out.println("Terça-feira!");
                break;
            case 4:
                System.out.println("Quarta-feira!");
                break;
            case 5: 
                System.out.println("Quinta-feira!");
                break;
            case 6:
                System.out.println("Sexta-feira!");
                break;
            case 7:
                System.out.println("Sábado!");
                break;
            default:
                System.out.println("Dia inexistente.");
                break;
        }

        System.out.println("Digite um número entre 1 e 5");
        int numero = sc.nextInt();

        String result = (numero > 5) ? "Eu confiei em você..." : "Boa!";
        
        System.out.println(result);
        sc.close();
    }
}