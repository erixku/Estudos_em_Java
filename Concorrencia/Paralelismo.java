package Concorrencia;

/**
 * Classe para demonstrar a execução de várias Threads em paralelo
 * Autor: @erixku
 * @since classe criada em 28 de novembro de 2024
 */

public class Paralelismo {
    public static void main(String[] args) {
        int i = 0;

        while(i<20){
            //Criação das Threads
            Virus t1 = new Virus();
    
            //Colocando as Threads no estado de Pronto
            t1.start();
            i++;
        }

    }//fim do main
}
