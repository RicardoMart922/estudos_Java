package exercicio06;

public class Quadrado extends PoligonoRegular {
    
    // Construtor
    public Quadrado(int numeroLados, double medidaLado) {
        super(numeroLados, medidaLado);
    }
    
    // Método personalizado
    public double calculoArea() {
        return Math.pow(this.getMedidaLado(), 2);
    }
}
