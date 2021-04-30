package exercicio04;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;
    
    // Construtores
    public Professor() {
    
    }
    
    public Professor(String nomeProfessor, String sexoProfessor, int idadeProfessor, String especialidadeProfessor, double salarioProfessor) {
        super(nomeProfessor, sexoProfessor, idadeProfessor);
        this.especialidade = especialidadeProfessor;
        this.salario = salarioProfessor;
    }
    
    // Getters
    public String getEspecialidade() {
        return especialidade;
    }
    
    public double getSalario() {
        return salario;
    }
    
    // Setters
    public void setEspecialidade(String especialidadeProfessor) {
        this.especialidade = especialidadeProfessor;
    }
    
    public void setSalario(double salarioProfessor) {
        this.salario = salarioProfessor;
    }
    
    // Método personalizado
    public void receberAumento(double aumento) {
        this.setSalario(this.getSalario() + aumento);
    }

    public String toStringPR() {
        return  "Nome: " + this.getNome() + "\n" + "Sexo: " + this.getSexo() + "\n" + 
               "Idade: " + this.getIdade() + "\n" + "Especialidade: " + this.getEspecialidade() + "\n" +
               "Salário: R$" + this.getSalario();
    }
    
    
}
