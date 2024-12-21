package entidades;
/*
Classe de dados de funcionários
@author Erick Gomes Barbosa
@since Classe criada em 21 de dezembro de 2024
 */
public class Funcionario {
    Integer id;
    Float salario;
    String nome;

    public Funcionario(Integer id, Float salario, String nome) {
        setId(id);
        setSalario(salario);
        setNome(nome);
    }

    public void aumentarSalario(Double porcentagem) {
        setSalario((float) (getSalario()+(getSalario()*(porcentagem/100))));
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
