package aplicacao;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = in.nextInt();
            }
        }


        System.out.println("Diagonal principal: ");
        for (int i = 0; i < mat.length; i++){
            System.out.println(mat[i][i] + " ");
        }

        int contar = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if(mat[i][j] > 0){
                    contar++;
                }
            }
        }
        System.out.println("Quantidades de números negativos: " + contar);
        in.close();
    }
}
