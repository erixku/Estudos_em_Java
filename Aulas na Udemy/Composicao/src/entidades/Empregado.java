package entidades;

import entidades.enums.NivelEmpregado;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.jar.JarOutputStream;

public class Empregado {
    private String nome;
    private NivelEmpregado nivel;
    private Double salarioBase;

    private Departamento departamento;
    private List<ContratoHora> contratos = new ArrayList<>();

    public Empregado() {}

    public Empregado(String nome, NivelEmpregado nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    //Método para adicionar um contrato à lista de contratos do empregado
    public void adicionarContrato(ContratoHora contrato) {
        contratos.add(contrato);
    }

    //Método para remover um contrado da lista de contratos do empregado
    public void removerContrato(ContratoHora contrato) {
        contratos.remove(contrato);
    }

    public double entrada(int ano, int mes) {
        double sum = salarioBase;
        Calendar cal = Calendar.getInstance();

        for (ContratoHora contrato : contratos) {
            cal.setTime(contrato.getData());
            int anoContrato = cal.get(Calendar.YEAR);
            int mesContrato = 1 + cal.get(Calendar.MONTH);
            if (ano == anoContrato && mes == mesContrato) {
                sum += contrato.valorTotal();
            }
        }

        return sum;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelEmpregado getNivel() {
        return nivel;
    }

    public void setNivel(NivelEmpregado nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }
}
