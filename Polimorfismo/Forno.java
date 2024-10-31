package Polimorfismo;

/**
 * Classe para criar o objeto de comportamento POLIMÓRFICO Forno
 * Autor: @erixku
 */

public class Forno {
    public void preparar(Pizza pizza){
        pizza.montar();
        pizza.assar();
        pizza.cobrar();
    }
}
