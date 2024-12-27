package Aulas_Fatec.Polimorfismo;

/**
 * Interface criada para determinar quais funcionalidades terão os objetos concretos a partir dela
 * Autor: @erixku
 * @since Interface criada em 31 de outubro de 2024
 */

public interface Pizza {
    //Como reunir os ingredientes da pizza
    public void montar();
    //Tempo que a pizza ficará no forno
    public void assar();
    //Valor a ser cobrado pela pizza
    public void cobrar();
}
