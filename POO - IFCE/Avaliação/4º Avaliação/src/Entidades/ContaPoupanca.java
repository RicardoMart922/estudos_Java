package Entidades;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca() {

    }

    public ContaPoupanca(int numero, double saldo, double taxaJuros) {
        super(numero, saldo);
        this.setTaxaJuros(taxaJuros);
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros/100;
    }

    @Override
    public double atualizaSaldo() {
        this.setSaldo(this.getSaldo() + (this.getSaldo() * this.getTaxaJuros()));
        return this.getSaldo();
    }

    @Override
    public String imprimir() {
        return super.imprimir() +
                "Saldo sem o juros: R$" + this.getSaldo() + "\n" +
                "Saldo com o juros: R$" + this.atualizaSaldo() + "\n";
    }
}
