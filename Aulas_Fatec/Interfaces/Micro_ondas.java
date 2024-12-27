package Aulas_Fatec.Interfaces;

/**
 * Classe para implementar TODOS os métodos da interface Eletrodoméstico
 * Autor: @erixku
 * @since Classe criada em 24 de outubro de 2024
 */

 public class Micro_ondas implements Eletrodoméstico{
    String marca;
    int litros;

    @Override
    public void ligar(){
        System.out.println("O micro-ondas foi ligado");
    }

    @Override
    public void desligar(){
        System.out.println("O micro-ondas foi desligado");
    }

    //Método para ligar o micro-ondas com o tempo escolhido pelo usuário
    public void ligar(int tempo) throws InterruptedException{
        ligar();
        for(tempo = tempo; tempo>0; tempo--){
            System.out.println(tempo);
            Thread.sleep(1000);
        }
        desligar();
    }
 }