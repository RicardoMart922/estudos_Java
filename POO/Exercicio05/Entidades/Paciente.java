package Entidades;

public class Paciente extends Pessoa{
    private String dataInternacao;

    public Paciente() {

    }

    public Paciente(String dataInternacao) {
        this.dataInternacao = dataInternacao;
    }

    public String getDataInternacao() {
        return dataInternacao;
    }

    public void setDataInternacao(String dataInternacao) {
        this.dataInternacao = dataInternacao;
    }
}
