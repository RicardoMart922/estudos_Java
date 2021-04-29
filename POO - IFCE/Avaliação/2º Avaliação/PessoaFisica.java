package avaliacao;

public class PessoaFisica extends Cliente {
    private int cpf;
    
    // Construtores
    public PessoaFisica() {
    
    }
    
    public PessoaFisica (String nomePessoa, int cpfPessoa, String enderecoPessoa, int telefonePessoa) {
        super(nomePessoa, enderecoPessoa, telefonePessoa);
        this.cpf = cpfPessoa;
    }
    
    // Getter
    public int getCpf() {
        return cpf;
    }
    
    // Setter
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    // Método personalizado
    public String imprimirDados() {
        return "Nome: " + this.getNome() + ", CPF: " + this.getCpf() + 
                ", Endereço: " + this.getEndereco() + ", Telefone: " + this.getTelefone();
    }
}
