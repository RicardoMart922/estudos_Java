package Entidades;

public class ContaCorrente extends Conta implements TaxaManutencao {
    public ContaCorrente() {

    }

    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public double valorTaxa() {
        return (super.getSaldo() * 0.01);
    }

    @Override
    public double atualizaSaldo() {
        this.setSaldo(this.getSaldo() - this.valorTaxa());
        return this.getSaldo();
    }

    @Override
    public String imprimir() {

        return  super.imprimir() +
                "Saldo com a taxa: R$" + this.getSaldo() + "\n" +
                "Saldo sem a taxa: R$" + this.atualizaSaldo() + "\n";
    }
}