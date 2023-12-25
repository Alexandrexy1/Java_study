import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double x = 4000.0;
        String nome = "Alexandre";
        int idade = 20;
        System.out.println("Hello, World!");
        System.out.printf("%s tem %d anos e ganha R$%.2f reais.", nome, idade, x);
    }
}
