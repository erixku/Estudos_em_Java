package Polimorfismo;

public class California implements Pizza{
    public void montar(){
        System.out.println("Pizza Califórnia");
        System.out.println("Ingredientes: Molho de tomate, lombo, abacaxi e mussarela");
    }
    public void assar(){
        System.out.println("Tempo de forno: 10 minutos");
    }
    public void cobrar(){
        System.out.println("Preço: R$45,00");
    }
}
