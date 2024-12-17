package aplicacoes;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ");
        double[] num = new double[in.nextInt()];

        for (int i = 0; i<num.length; i++){
            System.out.print("Digite um número: ");
            num[i] = in.nextDouble();
        }

        double soma = 0.0;
        System.out.print("Valores: ");
        for(int i = 0; i<num.length; i++){
            System.out.print(num[i] + "   ");
            soma += num[i];
        }
        System.out.println("");

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + soma/num.length);
    }
}
