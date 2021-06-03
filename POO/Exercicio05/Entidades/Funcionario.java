package Entidades;

public class Funcionario extends Pessoa {
    private String dataAdmissao;
    private String matricula;

    public Funcionario() {

    }

    public Funcionario(String dataAdmissao, String matricula) {
        this.dataAdmissao = dataAdmissao;
        this.matricula = matricula;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String statusFuncionario() {
        return "Data de admissão: " + getDataAdmissao() + "\nMatrícula: " + getMatricula();
    }
}
