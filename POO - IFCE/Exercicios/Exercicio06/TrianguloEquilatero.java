package exercicio06;

public class TrianguloEquilatero extends PoligonoRegular {
    
    // Construtor
    public TrianguloEquilatero(int numeroLados, double medidaLado) {
        super(numeroLados, medidaLado);
    }
    
    // Método personalizado
    public double calculoArea() {
        return (Math.sqrt(3) / 4) * Math.pow(this.getMedidaLado(), 2); 
    }
}
