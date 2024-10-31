package Polimorfismo;

public class MeM implements Pizza{
    public void montar(){
        System.out.println("Pizza Margherita");
        System.out.println("Ingredientes: Chocolate derretido e M&M");
    }
    public void assar(){
        System.out.println("Tempo de forno: 10 minutos");
    }
    public void cobrar(){
        System.out.println("Preço: R$ 60,00");
    }
}
