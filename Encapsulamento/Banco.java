package Encapsulamento;

/**
 * Classe para instanciar objetos da classe Conta
 * @author Erick Gomes Barbosa
 * @since Classe criada em 17 de outubro de 2024
 */

public class Banco {
    public static void main(String[] args) {
        Conta cc = new Conta("Gervásio", 1000.0f, 1234);
        cc.exibirDadosConta();

        cc.realizarSaque();
        cc.exibirDadosConta();
    }
}
