/**
 * Classe para demonstrar o princípio do Encapsulamento
 * @author Erick Gomes Barbosa
 * @since Classe criada em 17 de outubro de 2024
 */

public class Conta{
    private String cliente;
    private Float saldo;
    private Integer senha;
    private Boolean bloqueado;

    //Construtor da Classe
    public Conta(String cliente, Float saldo, Integer senha){
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




    //Métodos assessores
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    public String getCliente(){
        return this.cliente;
    }

    public void setSaldo(Float saldo){
        this.saldo = saldo;
    }
    public Float getSaldo(){
        return this.saldo;
    }

    public void setSenha(Integer senha){
        this.senha = senha;
    }
    public Integer getSenha(){
        return this.senha;
    }

    public void setBloqueado(Boolean bloqueado){
        this.bloqueado = bloqueado;
    }
    public Boolean isBloqueado(){
        return this.bloqueado;
    }

}//fim da conta