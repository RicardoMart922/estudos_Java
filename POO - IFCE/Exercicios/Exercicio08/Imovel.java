package exercicio08;

public abstract class Imovel {
    private String nome;
    private double preco;
    
    // Construtores
    public Imovel() {
    
    }
    
    public Imovel(String nomeImovel, double precoImovel) {
        this.nome = nomeImovel;
        this.preco = precoImovel;
    }
    
    // Getters
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    // Setters
    public void setNome(String nomeImovel) {
        this.nome = nomeImovel;
    }
    
    public void setPreco(double precoImovel) {
        this.preco = precoImovel;
    }
    
    // Método personalizado
    public String valorImovel() {
        return this.getNome() + " R$" + this.getPreco();
    }
}
