package exercicio04;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    // Construtores
    public Aluno() {
    
    }
    
    public Aluno(String nomeAluno, String sexoAluno, int idadeAluno, int matriculaAluno, String cursoAluno) {
        super(nomeAluno, sexoAluno, idadeAluno);
        this.matricula = matriculaAluno;
        this.curso = cursoAluno;
    }
    
    // Getters
    public int getMatricula() {
        return matricula;
    }
    
    public String getCurso() {
        return curso;
    }
    
    // Setters
    public void setMatricula(int matriculaAluno) {
        this.matricula = matriculaAluno;
    }
    
    public void setCurso(String cursoAluno) {
        this.curso = cursoAluno;
    }
    
    // Método personalizado
    public void cancelarMatricula() {
        this.setMatricula(0);
        System.out.printf("Matrícula cancelada!\n");
    }

    public String statusAluno() {
        return "Nome: " + this.getNome() + "\n" + "Sexo: " + this.getSexo() + "\n" + 
               "Idade: " + this.getIdade() + "\n" + "Matrícula: " + this.getMatricula() + "\n" +
               "Curso: " + this.getCurso();
    } 
    
    
}
