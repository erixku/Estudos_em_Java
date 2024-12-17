package aplicacao;

import models.Estudante;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numEstudantes, quarto;
        Estudante[] vetor = new Estudante[10];

        System.out.print("Quantos quartos serão reservados? ");
        numEstudantes = in.nextInt();

        for (int i = 1; i <= numEstudantes; i++) {
            System.out.printf("Reserva #%d: ", i);
            System.out.println(" ");
            System.out.print("Nome: ");
            in.nextLine();
            String nome = in.nextLine();
            System.out.print("E-mail: ");
            String email = in.nextLine();
            System.out.print("Quarto: ");
            quarto = in.nextInt();

            vetor[quarto] = new Estudante(nome, email);
        }

        System.out.println("Quartos ocupados:");
        for (int i = 0; i<vetor.length; i++) {
            if(vetor[i] != null) {
                System.out.println(i + ": " + vetor[i].getNome() + ", " + vetor[i].getEmail());
            }
        }
    }
}
