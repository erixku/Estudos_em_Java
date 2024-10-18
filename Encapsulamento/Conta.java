package Encapsulamento;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar o princípio do Encapsulamento
 * @author Erick Gomes Barbosa
 * @since Classe criada em 17 de outubro de 2024
 */

public class Conta{
    private String cliente;
    private Float saldo;
    private int senha;
    private Boolean bloqueado;
    private int tentativas = 0;

    //Construtor da Classe
    public Conta(String cliente, Float saldo, int senha){
        this.cliente = cliente;
        this.saldo = saldo;
        this.senha = senha;
        this.bloqueado = false;
    }

    public void exibirDadosConta(){
        System.out.println("Nome do Cliente: " + cliente);
        verificarSaldo();
        System.out.println("Está Bloqueada:" + (isBloqueado()?"Sim":"Não"));
    }

    //Método para realizar um saque na conta do cliente
    public void realizarSaque(){
        int pwd = 0;
        pwd = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha"));
        
        if(!verificarSenha(pwd)){
            JOptionPane.showMessageDialog(null, "Senha inválida!\nTentativas restantes: " + (2-tentativas));
            if(!isBloqueado())
                realizarSaque();
        }
        else{
            float valor = 0;
            valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a sacar"));
            setSaldo(getSaldo()-valor);
        }
    }

    //Método para verificar a senha
    private Boolean verificarSenha(int pwd){
        if(pwd == getSenha())
            return true;
        else{
            if(tentativas>=2){
                JOptionPane.showMessageDialog(null, "Conta bloqueada");
                setBloqueado(true);
            }
            else
                tentativas++;
            
            return false;
        }
    }

    //Método para depositar um valor ao saldo da conta
    public void depositar(){
        float valor = 0;
        valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a depositar"));
        setSaldo(getSaldo()+valor);
        JOptionPane.showMessageDialog(null, "Valor depositado com sucesso");
        exibirDadosConta();
    }

    //Método para verificar o saldo da conta com autenticação por senha
    public void verificarSaldo(){
        int pwd = 0;
        pwd = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha"));

        if(!verificarSenha(pwd)){
            JOptionPane.showMessageDialog(null, "Senha incorreta! \ntentativas restantes: "+ (2-tentativas));
            if(!isBloqueado())
                verificarSaldo();
        }
        else
            System.out.println("Seu saldo é de: " + getSaldo());
    }

    //Método para trocar a senha do cliente
    public void trocarSenha(){
        int pwd = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha atual"));
        int novaSenha = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova senha"));
        int confirmarSenha = Integer.parseInt(JOptionPane.showInputDialog("Confirme a nova senha"));
        
        if(!verificarSenha(pwd)){
            JOptionPane.showMessageDialog(null, "Senha incorreta!\nTentativas restantes: " + (2-tentativas));              
        }
        else{
            if(novaSenha!=confirmarSenha){
                JOptionPane.showMessageDialog(null, "As senhas não são iguais");
            }
            else{
                setSenha(novaSenha);
            }
        }
    }






    //Métodos assessores
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    public String getCliente(){
        return this.cliente;
    }

    private void setSaldo(Float saldo){
        this.saldo = saldo;
    }
    private Float getSaldo(){
        return this.saldo;
    }

    private void setSenha(int senha){
        this.senha = senha;
    }
    private int getSenha(){
        return this.senha;
    }

    private void setBloqueado(Boolean bloqueado){
        this.bloqueado = bloqueado;
    }
    private Boolean isBloqueado(){
        return this.bloqueado;
    }

}//fim da conta