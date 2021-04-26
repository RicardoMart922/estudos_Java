package exercicio06;

public class PoligonoRegular {
    private int numeroLados;
    private double medidaLado;
    
    // Construtor
    public PoligonoRegular() {
    
    }
    
    public PoligonoRegular(int numeroLados, double medidaLado) {
        this.numeroLados = numeroLados;
        this.medidaLado = medidaLado;
    }
    
    // Getters
    public int getNumeroLados() {
        return numeroLados;
    }

    public double getMedidaLado() {
        return medidaLado;
    }
    
    // Setters
    public void SetNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public void setMedidaLado(double medidaLado) {
        this.medidaLado = medidaLado;
    }
    
}
