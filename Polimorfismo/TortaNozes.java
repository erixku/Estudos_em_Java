package Polimorfismo;

public class TortaNozes implements Pizza {
    public void montar(){
        System.out.println("Torta de Nozes");
        System.out.println("Ingredientes: Amendoin e nozes");
    }
    public void assar(){
        System.out.println("Tempo de forno: 40 minutos");
    }
    public void cobrar(){
        System.out.println("Preço: R$30,00");
    }
}
