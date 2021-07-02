package Entidades;

public class Titular {
    private int idTitular;
    private String nome;
    private ContaPoupanca contaPoupanca;
    private ContaCorrente contaCorrente;

    public Titular() {
        this.contaPoupanca = new ContaPoupanca();
        this.contaCorrente = new ContaCorrente();
    }

    public Titular(int idTitular, String nome, ContaPoupanca contaPoupanca) {
        this.setIdTitular(idTitular);
        this.setNome(nome);
        this.setContaPoupanca(contaPoupanca);
    }

    public Titular(int idTitular, String nome, ContaCorrente contaCorrente) {
        this.setIdTitular(idTitular);
        this.setNome(nome);
        this.setContaCorrente(contaCorrente);
    }

    public int getIdTitular() {
        return idTitular;
    }

    public String getNome() {
        return nome;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setIdTitular(int idTitular) {
        this.idTitular = idTitular;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }

    public void  setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public String imprimir() {
        if (this.getContaPoupanca() != null) {
            return "Id: " + this.getIdTitular() + "\n" +
                    "Nome: " + this.getNome() + "\n" +
                    "Conta Poupança: \n" + this.getContaPoupanca().imprimir();
        } else if (this.getContaCorrente() != null) {
            return "Id: " + this.getIdTitular() + "\n" +
                   "Nome: " + this.getNome() + "\n" +
                    "Conta Corrente: \n" + this.getContaCorrente().imprimir();
        }
        return "Erro!";
    }

}
