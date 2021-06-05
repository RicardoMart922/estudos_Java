package Entities;

public class CarroNovo extends Carro implements Impressao {
    private double imposto;

    // Construtores
    public CarroNovo() {

    }

    public CarroNovo(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
        this.setImposto(3.0);
    }

    // Getters
    public double getImposto() {
        return imposto;
    }

    // Setters
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    // Métodos personalizados
    @Override
    public double calcularPreco() {
        return this.getPreco() + (this.getPreco() * this.getImposto()/100);
    }

    @Override
    public String imprimirDadosCarro() {
        return "Dados dos carros novos: " +
                "\nModelo: " + this.getModelo() +
                "\nMarca: " + this.getMarca() +
                "\nPreço: R$" + this.calcularPreco();
    }
}