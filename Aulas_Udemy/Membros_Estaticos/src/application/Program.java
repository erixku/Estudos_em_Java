package application;

//Sessão de importações
import java.util.Scanner;
import util.CurrencyConverter;

public class Program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dollar, quantity;

        System.out.print("What is the dollar price? ");
        dollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        quantity = sc.nextDouble();
        System.out.printf("Amount to be paid in reais: %.2f", CurrencyConverter.buyDollar(dollar, quantity));

        sc.close();
    }
}