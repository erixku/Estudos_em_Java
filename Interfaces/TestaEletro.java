package Interfaces;

/**
 * Classe para instanciar objetos do tipo Eletrodoméstico
 * Autor: @erixku
 * @since Classe criada em 24 de outubro de 2024
 */

 public class TestaEletro{
    public static void main(String[] args) throws InterruptedException{
        TV tv = new TV();
        Micro_ondas mc = new Micro_ondas();
        
        //tv.ligar();
        //tv.desligar();
        //tv.ativarTimer(5);

        mc.ligar(15);
    }//fim do main
 }//fim da classe