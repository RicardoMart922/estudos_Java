package exercicio07;

public class Produto {
    private String nome;
    private double preco;
    
    // Construtor
    public Produto() {
    
    }
    
    public Produto(String nomeProduto, double precoProduto) {
        this.nome = nomeProduto;
        this.preco = precoProduto;
    }
    
    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    
    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    // Método personalizado
    public String etiquetaPrecos() {
        return this.getNome() + " R$" + this.getPreco();
    } 
}
