package Entidades;

public class Gerente extends Funcionario {
    private String cra;

    public Gerente() {

    }

    public Gerente(String cra) {
        this.cra = cra;
    }

    public String getCra() {
        return cra;
    }

    public void setCra(String cra) {
        this.cra = cra;
    }

    public void liberarPagamento() {
        System.out.printf("Pagamento liberado!");
    }

    public String statusGerente() {
        return "Nome: " + getNome() + "\nSexo: " + getSexo() + "\n" + super.statusFuncionario() + "\nCRA: " + getCra();
    }
}
