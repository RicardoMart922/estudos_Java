package Entities;

public class CarroUsado extends Carro implements Impressao {
    private double desconto;

    // Construtores
    public CarroUsado() {

    }

    public CarroUsado(String marca, String modelo, double preco, double desconto) {
        super(marca, modelo, preco);
        this.setDesconto(desconto);
    }

    // Getters
    public double getDesconto() {
        return desconto;
    }

    // Setters
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    // Métodos personalizados
    @Override
    public double calcularPreco() {
        return this.getPreco() - (this.getPreco() * getDesconto()/100);
    }

    @Override
    public String imprimirDadosCarro() {
        return "Dados dos carros usados: " +
                "\nModelo: " + this.getModelo() +
                "\nMarca: " + this.getMarca() +
                "\nPreço: R$" + this.calcularPreco();
    }
}