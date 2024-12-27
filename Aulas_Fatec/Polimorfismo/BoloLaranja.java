package Aulas_Fatec.Polimorfismo;

/**
 * Classe para implementar TODOS os métodos abstratos da interface Pizza para preparar um bolo
 * Autor: @erixku
 * @since Classe criada em 31 de outubro de 2024
 */

public class BoloLaranja implements Pizza{
    public void montar(){
        System.out.println("Bolo de Laranja");
        System.out.println("Ingredientes: Suco de laranja, farinha de trigo, fermento, ovos, açúcar");
    }
    public void assar(){
        System.out.println("Tempo de forno: 40 minutos");
    }
    public void cobrar(){
        System.out.println("Preço: R$ 22,00");
    }
}
