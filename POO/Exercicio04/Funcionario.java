package exercicio04;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    // Construtores
    public Funcionario() {
    
    }
    
    public Funcionario(String nomeFuncionario, String sexoFuncionario, int idadeFuncionario, String setorFuncionario, boolean estadoFuncionario) {
        super(nomeFuncionario, sexoFuncionario, idadeFuncionario);
        this.setor = setorFuncionario;
        this.trabalhando = estadoFuncionario;
    }
    
    // Getters
    public String getSetor() {
        return setor;
    }
    
    public boolean getTrabalhando() {
        return trabalhando;
    }
    
    // Setters
    public void setSetor(String setorFuncionario) {
        this.setor = setorFuncionario;
    }
    
    public void setTrabalhando(boolean estadoFuncionario) {
        this.trabalhando = estadoFuncionario;
    }
    
    // Método personalizado
    public void mudarEstadoTrabalho() {
        this.setTrabalhando(!this.getTrabalhando());
    }

    public String toStringF() {
        return "Nome: " + this.getNome() + "\n" + "Sexo: " + this.getSexo() + "\n" + 
               "Idade: " + this.getIdade() + "\n" + "Setor: " + this.getSetor() + "\n" +
               "Trabalhando: " + this.getTrabalhando();
    }
    
    
}
