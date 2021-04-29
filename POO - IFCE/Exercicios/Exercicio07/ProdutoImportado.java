package exercicio07;

public class ProdutoImportado extends Produto {
    private double taxaAlfandega;
    
    // Construtor
    public ProdutoImportado() {
    
    }
    
    public ProdutoImportado(String nome, double preco, double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }
    
    // Getters
    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }
    
    // Setters
    public void setTaxaAlfandega(double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }
    
    // Método personalizado
    public double totalPreco() {
        return super.getPreco() + this.getTaxaAlfandega();
    }
    
    @Override
    public String etiquetaPrecos() {
        return this.getNome() + " R$" + this.totalPreco() + "(taxa alfâdega: R$" + this.getTaxaAlfandega() + ")S";
    } 
     
}
