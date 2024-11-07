package Excecao;

/**
 * Classe para tratar as especificidades da classe Divisão
 * Autor: @erixku
 * @since classe criada em 07 de novembro de 2024
 */

public class DivisaoExcecao extends Exception{
    public DivisaoExcecao(){
        super("O A deve ser maior que o B!");
    }

    public DivisaoExcecao(String ww){
        super("O A tem que ser menor que 200");
    }
}
