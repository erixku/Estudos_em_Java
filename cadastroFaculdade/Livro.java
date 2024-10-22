package cadastroFaculdade;

/**
 * Classe para o cadastro, atualização ou remoção de um livro
 * Autor: @erixku
 * Data de criação: 22 de outubro de 2024
 */

import javax.swing.JOptionPane;

public class Livro{
    String titulo, autor, ISBN;
    boolean disponivel;

    public Livro(String titulo, String autor, String ISBN){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponivel = true;
    }

    public Livro(){
        this.titulo = JOptionPane.showInputDialog("Título do livro");
        this.autor = JOptionPane.showInputDialog("Autor do livro");
        this.ISBN = JOptionPane.showInputDialog("ISBN");
        this.disponivel = true;
    }
}