package avaliacao;

public class PessoaJuridica extends Cliente {
    private int cnpj;
    
    // Construtores
    public PessoaJuridica () {
    
    }
    
    public PessoaJuridica (String nomeEmpresa, int cnpjEmpresa, String enderecoEmpresa, int telefoneEmpresa) {
        super(nomeEmpresa, enderecoEmpresa, telefoneEmpresa);
        this.cnpj = cnpjEmpresa;
    }
    
    // Getter

    public int getCnpj() {
        return cnpj;
    }

    // Setter
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    
    // Método personalizado
    public String imprimirDados() {
        return "Nome: " + this.getNome() + ", CNPJ: " + this.getCnpj() + 
                ", Endereço: " + this.getEndereco() + ", Telefone: " + this.getTelefone();
    }
}
