package aplicacao;

import entidades.ContratoHora;
import entidades.Departamento;
import entidades.Empregado;
import entidades.enums.NivelEmpregado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento: ");
        String nomeDepartamento = in.nextLine();
        System.out.println("Digite os dados do empregado: ");
        System.out.print("Nome: ");
        String nomeEmpregado = in.nextLine();
        System.out.print("Nível: ");
        String nivelEmpregado = in.nextLine();
        System.out.print("Salário base: ");
        double salarioBase = in.nextDouble();

        Empregado empregado = new Empregado(nomeEmpregado, NivelEmpregado.valueOf(nivelEmpregado), salarioBase, new Departamento(nomeDepartamento));

        System.out.print("Quantos contratos esse empregado possui: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite os dados do " + i + "º contrato: ");
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(in.next());
            System.out.print("Valor por hora: ");
            double valorHora = in.nextDouble();
            System.out.print("Duração do contrato em horas: ");
            int horas = in.nextInt();

            ContratoHora contrato = new ContratoHora(dataContrato, valorHora, horas);
            empregado.adicionarContrato(contrato);
        }

        System.out.println();
        System.out.println("Digite o mês e o ano para calcular a entrada (MM/YYYY): ");
        String mesEAno = in.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Departamento: " + empregado.getDepartamento().getNome());
        System.out.println("Entrada de " + mesEAno + ": " + String.format("%.2f", empregado.entrada(ano, mes)));

        in.close();
    }
}
