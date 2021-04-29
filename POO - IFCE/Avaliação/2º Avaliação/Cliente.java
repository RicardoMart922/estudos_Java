package avaliacao;

public class Cliente {
    private String nome;
    private String endereco;
    private int telefone;
    
    // Construtores
    public Cliente() {
    
    }
    
    public Cliente (String nomeCliente, String enderecoCliente, int telefoneCliente) {
        this.nome = nomeCliente;
        this.endereco = enderecoCliente;
        this.telefone = telefoneCliente;
    }
    
    // Getters
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getTelefone() {
        return telefone;
    }
    
    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }   
}
