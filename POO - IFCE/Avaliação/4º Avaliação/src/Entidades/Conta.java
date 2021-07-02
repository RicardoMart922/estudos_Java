package Entidades;

public abstract class Conta {
    private int numero;
    private double saldo;

    public Conta() {

    }

    public Conta(int numero, double saldo) {
        this.setNumero(numero);
        this.setSaldo(saldo);
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            this.saldo = 0.00;
        } else {
            this.saldo = saldo;
        }
    }

    public void sacar(double valor) {
        if (valor < this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
        } else {
            System.out.println("Impossível completar essa ação.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
        } else {
            System.out.println("Impossível completar essa ação.");
        }
    }

    public double atualizaSaldo() {
        return this.getSaldo();
    }

    public String imprimir() {
        return "Número da conta: " + this.getNumero() + "\n" +
                "Saldo : R$" + this.getSaldo() + "\n";
    }
}
