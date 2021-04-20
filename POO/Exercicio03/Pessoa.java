package exercicio03;

public class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    
    // Construtores
    public Pessoa() {
    
    }
    
    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
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
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    // Método personalizado
    public void fazerAnivarsario() {
        this.setIdade(this.getIdade() + 1);
    }
}
