package aplicacoes;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ");
        int n = in.nextInt();

        if (n>0 || n<10) {
            int[] num = new int[n];

            for (int i = 0; i < num.length; i++) {
                System.out.print("Digite um número: ");
                num[i] = in.nextInt();
            }

            System.out.println("NÚMEROS NEGATIVOS");
            for (int i = 0; i < num.length; i++) {
                if (num[i] < 0) {
                    System.out.println(num[i]);
                }
            }
        } else{
            System.out.println("Quantidade informada não aceita, tente novamente");
        }
    }
}
