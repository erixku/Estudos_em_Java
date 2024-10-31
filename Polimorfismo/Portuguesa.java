package Polimorfismo;

/**
 * Classe para implementar TODOS os métodos abstratos da interface Pizza
 * Autor: @erixku
 * @since Classe criada em 31 de outubro de 2024
 */

public class Portuguesa implements Pizza {
    public void montar(){
        System.out.println("Pizza Portuguesa");
        System.out.println("Ingredientes: Molho de tomate, presunto, ovo cozido, cebola, ervilha, mussarela, milho");
    }
    public void assar(){
        System.out.println("Tempo de forno: 20 minutos");
    }
    public void cobrar(){
        System.out.println("Preço: R$ 52,00");
    }
}
