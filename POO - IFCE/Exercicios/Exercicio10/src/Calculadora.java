public abstract class Calculadora {
    private double valorA;
    private double valorB;

    // Construtores
    public Calculadora() {

    }

    public Calculadora(double valorA, double valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    // Getters
    public double getValorA() {
        return valorA;
    }

    public double getValorB() {
        return valorB;
    }

    // Setters
    public void setValorA(double valor) {
        this.valorA = valor;
    }

    public void setValorB(double valor) {
        this.valorB = valor;
    }

    // Métodos personalizados
    public double soma(double valorA, double valorB) {
        return valorA + valorB;
    }

    public double subtracao(double valorA, double valorB) {
        return valorA - valorB;
    }

    public double multiplicacao(double valorA, double valorB) {
        return valorA * valorB;
    }

    public double divisao(double valorA, double valorB) {
        if (valorB != 0) {
            return valorA / valorB;
        }
        return 0.00;
    }
}
