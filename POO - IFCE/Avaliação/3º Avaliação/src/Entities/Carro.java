package Entities;

public abstract class Carro {
    private String marca;
    private String modelo;
    private double preco;

    // Construtores
    public Carro() {

    }

    public Carro(String marca, String modelo, double preco) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPreco(preco);
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Métodos personalizados
    public double calcularPreco() {
        return preco;
    }

}