public class CalculadoraCientifica extends Calculadora {
    // Construtor
    public CalculadoraCientifica() {

    }

    // Métodos personalizados
    public double raizQuadrada(double valor) {
        return Math.sqrt(valor);
    }

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}
