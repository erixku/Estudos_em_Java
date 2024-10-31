package Polimorfismo;

public class Baiana implements Pizza{
    public void montar(){
        System.out.println("Pizza Baiana");
        System.out.println("Ingredientes: Molho de tomate, mussarela, calabresa, cebola e pimenta");
    }
    public void assar(){
        System.out.println("Tempo de forno: 25 minutos");
    }
    public void cobrar(){
        System.out.println("Preço: R$ 50,00");
    }
}
