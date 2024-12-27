package aplicacao;

import java.util.Scanner;

public class Fixacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = in.nextInt();
            }
        }

        System.out.println("Qual número buscas: ");
        int busca = in.nextInt();

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] == busca){
                    System.out.println("Posição " + i + ", " + j);
                    if(i-1>=0)
                        System.out.println("Cima: " + mat[i+1][j]);
                    if(i+1<=mat.length)
                        System.out.println("Baixo: " + mat[i-1][j]);
                    if(j+1<=mat[i].length)
                        System.out.println("Direita: " + mat[i][j+1]);
                    if(j-1>=0)
                        System.out.println("Esquerda: " + mat[i][j-1]);
                }
            }
        }

        in.close();
    }

}
