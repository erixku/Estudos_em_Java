package Aulas_Fatec.Excecao;

//Sessão de importação
import javax.swing.JOptionPane;

/**
 * Classe para demonstrar o tratamento de exceções feito com Try... Catch... Throws
 * Autor: @erixku
 * @since Classe criada em 06 de novembro de 2024
 */

public class Divisao {
    public static void main(String[] args) {
        String numA, numB;
        int a, b;
        int divi = 0;

        numA = JOptionPane.showInputDialog("Digite A: ");
        numB = JOptionPane.showInputDialog("Digite B: ");

        try{
            a = Integer.parseInt(numA);
            b = Integer.parseInt(numB);
            divi = dividir(a, b);
            System.out.println("Resultado da divisão: " + divi);
        }
        catch(ArithmeticException e){
            System.err.println("Erro: Não existe divisão por zero!");
        }
        catch(NumberFormatException e){
            System.err.println("Digite somente números!");
        }
        catch(DivisaoExcecao e){
            System.out.println("Ocorreu uma exceção do tipo: " + e.toString());
        }
        catch(Exception e){
            System.err.println("Erro: " + e.toString());
        }
    }//fim do main

    private static int dividir(int a, int b) throws DivisaoExcecao {
        if(a<=b)
            throw new DivisaoExcecao();
        else if(a>200)
            throw new DivisaoExcecao("ww");
        
        return a/b;
    }
}
