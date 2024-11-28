package Concorrencia;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;

/**
 * Classe para implementar a execução de threads promovendo o paralelismo e concorrência entre elas
 * Autor: @erixku
 * @since classe criada em 28 de novembro de 2024
 */

public class Virus extends Thread{
    private int sleepTime;
    JFrame janela = new JFrame();
    JPanel painel = new JPanel();
    JLabel label = new JLabel();
    Icon icon = new ImageIcon("Imagens/gato.webp");

    public Virus(){
        int x, y;
        float r, g, b;
        setSleepTime((int) (Math.random()*5000));
        x = (int) (Math.random()*1600);
        y = (int) (Math.random()*800);
        r = (float) (Math.random()*255);
        g = (float) (Math.random()*350);
        b = (float) (Math.random()*750);

        janela.setSize(300, 300);
        janela.setLocation(x, y);
        //label.setText("Erick");
        label.setIcon(icon);
        painel.setBackground(Color.getHSBColor(r, g, b));
        janela.add(painel);
        painel.add(label);
        janela.setVisible(true);
    }

    public void run(){
        try {
            Thread.sleep(getSleepTime());
        } catch (InterruptedException e) {
            System.out.println("A Janela foi de drop table!");
        }
        janela.setVisible(false);
    }

    public int getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(int sleepTime) {
        this.sleepTime = sleepTime;
    }
}
