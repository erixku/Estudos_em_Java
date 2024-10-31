package Polimorfismo;

public class PaoCalabresa implements Pizza{
    public void montar(){
        System.out.println("Pão de Calabresa");
        System.out.println("Ingredientes: Calabresa e catupiry");
    }
    public void assar(){
        System.out.println("Tempo de forno: 60 minutos");
    }
    public void cobrar(){
        System.out.println("Preço: R$30,00");
    }
}
