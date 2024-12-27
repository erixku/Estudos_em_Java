package Aulas_Fatec.Polimorfismo;

/**
 * Classe para implementar TODOS os métodos abstratos da interface Pizza
 * Autor: @erixku
 * @since Classe criada em 31 de outubro de 2024
 */

public class Margherita implements Pizza{
    public void montar(){
        System.out.println("Pizza Margherita");
        System.out.println("Ingredientes: Molho de tomate, queijo, tomate, manjericão, orégano");
    }
    public void assar(){
        System.out.println("Tempo de forno: 15 minutos");
    }
    public void cobrar(){
        System.out.println("Preço: R$ 45,00");
    }
}