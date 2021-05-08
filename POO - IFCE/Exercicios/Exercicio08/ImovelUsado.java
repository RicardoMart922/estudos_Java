package exercicio08;

public class ImovelUsado extends Imovel {
    private double desconto;
    
    // Construtores
    public ImovelUsado() {
    
    }
    
    public ImovelUsado(String nomeImovel, double precoImovel, double descontoImovel) {
        super(nomeImovel, precoImovel);
        this.desconto = descontoImovel;
    }
    
    // Getters
    public double getDesconto() {
        return desconto;
    }

    // Setters
    public void setDesconto(double descontoImovel) {
        this.desconto = descontoImovel;
    }
    
    // Método personalizado
    @Override
    public String valorImovel() {
        this.setPreco(this.getPreco() - this.getDesconto());
        return this.getNome() + " R$" + this.getPreco() + "(desconto R$" + this.getDesconto() + ")";
    }
}
