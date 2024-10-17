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
        System.out.println("Saldo: " + saldo);
        System.out.println("Está Bloqueada:" + (isBloqueado()?"Sim":"Não"));
    }

    //Método para realizar um saque na conta do cliente
    public void realizarSaque(){
        int pwd = 0;
        pwd = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha"));
        
        if(!verificarSenha(pwd)){
            JOptionPane.showMessageDialog(null, "Senha inválida");
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

    private void setSenha(Integer senha){
        this.senha = senha;
    }
    private Integer getSenha(){
        return this.senha;
    }

    private void setBloqueado(Boolean bloqueado){
        this.bloqueado = bloqueado;
    }
    private Boolean isBloqueado(){
        return this.bloqueado;
    }

}//fim da conta