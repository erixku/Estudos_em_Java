package Aulas_Fatec.Interfaces;

/**
 * Classe para implementar TODOS os métodos da interface Eletrodomésticos
 * Autor: @erixku
 * @since Classe criada em 24 de outubro de 2024
 */

public class TV implements Eletrodoméstico{
    String marca;
    int polegadas;

    @Override
    public void ligar(){
        System.out.println("A televisão foi ligada");
    }

    @Override
    public void desligar(){
        System.out.println("A televisão foi desligada");
    }

    //Método para desligar a TV depois que passar um período de tempo determinado pelo usuário
    public void ativarTimer(int min) throws InterruptedException{
        System.out.println("A televisão será desligada em "+min+" minutos");
        for(min = min; min>0; min--){
            Thread.sleep(1000);
        }
        desligar();
    }
}//fim da classe