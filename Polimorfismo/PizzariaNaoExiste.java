package Polimorfismo;

/**
 * Classe para preparar as Pizzas por meio do objeto POLIMÓRFICO Forno
 * Autor: @erixku
 * @since Classe criada em 31 de outubro de 2024
 */

public class PizzariaNaoExiste {
    public static void main(String[] args) {
        Forno forno = new Forno();
        Pizza portuguesa = new Portuguesa();
        Pizza frangoCatupiry = new FrangoCatupiry();
        Pizza margherita = new Margherita();
        Pizza boloLaranja = new BoloLaranja();
        Pizza california = new California();
        Pizza baiana = new Baiana();
        Pizza mm = new MeM();
        Pizza torta = new TortaNozes();
        Pizza pao = new PaoCalabresa();

        forno.preparar(boloLaranja);
    }
}
