package Aulas_Fatec.Concorrencia;

/**
 * Classe para implementar a execução de threads promovendo o paralelismo e concorrência entre elas
 * Autor: @erixku
 * @since classe criada em 28 de novembro de 2024
 */

public class Processo extends Thread {
    private int sleepTime;

    public Processo(String nome){
        super(nome);
        setSleepTime((int) (Math.random()*50000));
        System.out.println("A Thread "+getName()+" vai dormir por "+getSleepTime()+"ms");
    }

    public void run(){
        try {
            Thread.sleep(getSleepTime());
        } catch (InterruptedException e) {
            System.out.println("A Thread foi interrompida!");
        }
        System.err.println("\nA Thread "+getName()+"------> ACORDOU!");
    }

    public int getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(int sleepTime) {
        this.sleepTime = sleepTime;
    }
}//fim da classe
