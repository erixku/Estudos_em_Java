import javax.swing.JOptionPane;


package Cadastro_Faculdade;
/**
 * Classe para o cadastro de alunos genéricos de uma faculdade
 * @author Erick Gomes Barbosa
 */

public class Aluno{
    String nome, sexo, endereço, telefone, email, matrícula;
    Integer idade;

    public Aluno(String nome, String sexo, String endereço, String telefone, String email, Integer idade, String matrícula){
        this.nome = nome;
        this.sexo = sexo;
        this.endereço = endereço;
        this.telefone = telefone; 
        this.email = email;
        this.idade = idade;
        this.matrícula = matrícula;
    }

    public void exibirDados(){
        JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nSexo: "+sexo+"\nEndereço: "+endereço+"\nTelefone: "+telefone+"\nE-mail: "+email+"\nIdade: "+idade+"\nMatrícula: "+matrícula, "Informações do Aluno", 0);
    }
}