package exercicio04;

public abstract class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    
    // Construtores
    public Pessoa() {
    
    }
    
    public Pessoa(String nomePessoa, String sexoPessoa, int idadePessoa) {
        this.nome = nomePessoa;
        this.sexo = sexoPessoa;
        this.idade = idadePessoa;
    }
    
    // Getters
    public String getNome() {
        return nome;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public int getIdade() {
        return idade;
    }
    
    // Setters
    public void setNome(String nomePessoa) {
        this.nome = nomePessoa;
    }
    
    public void setSexo(String sexoPessoa) {
        this.sexo = sexoPessoa;
    }
    
    public void setIdade(int idadePessoa) {
        this.idade = idadePessoa;
    }
    
    // Método personalizado
    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
    }

}
