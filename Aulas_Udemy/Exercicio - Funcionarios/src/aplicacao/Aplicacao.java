package aplicacao;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entidades.Funcionario;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        Integer qntFun;

        System.out.print("Quantos funcionários serão registrados? ");
        qntFun = in.nextInt();

        for(int i = 0; i<qntFun; i++){
            System.out.println("Empregado nª" + (i+1));
            System.out.print("Id: ");
            Integer id = in.nextInt();
            System.out.print("Nome: ");
            in.nextLine();
            String nome = in.nextLine();
            System.out.print("Salário: ");
            Float salario = in.nextFloat();

            funcionarios.add(new Funcionario(id, salario, nome));

            System.out.println("\n");
        }

        System.out.print("Digite o Id do funcionário que deseja aumentar o salário: ");
        Integer id = in.nextInt();
        for(Funcionario f : funcionarios){
            if(f.getId().equals(id)){
                System.out.print("Digite a porcentagem: ");
                f.aumentarSalario(in.nextDouble());
                System.out.println("\n");
                break;
            } else continue;
        }

        System.out.println("Lista de funcionários: ");
        for(Funcionario fun : funcionarios) {
            System.out.println(fun.getId() + ", " + fun.getNome() + ", " + fun.getSalario());
        }

    }
}
