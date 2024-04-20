import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.entities.BusinessAccount;
import model.exception.WithdrawValueException;


public class Program{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Name: ");
            String name = sc.nextLine();
    
            System.out.print("Number: ");
            String number = sc.nextLine();
    
            System.out.print("Balance: ");
            double balance = sc.nextDouble();
    
            Account ba = new BusinessAccount(name, number, balance, 0.05);

            System.out.print("Withdraw value: ");
            double value = sc.nextDouble();

            ba.withdraw(value);
            
            System.out.println(ba);
            
        } catch(WithdrawValueException e) {
            System.out.println("Erro in withdraw: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}