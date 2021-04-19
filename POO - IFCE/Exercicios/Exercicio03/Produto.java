package exercicio03;

public class Produto {
    String nome;
    double preco;
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }
    
    public double getPreco() {
        return this.preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double valor) {
        this.preco = valor;
    }
}