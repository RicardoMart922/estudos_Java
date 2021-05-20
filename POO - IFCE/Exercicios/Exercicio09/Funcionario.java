public class Funcionario {
    private int id;
    private String nome;
    private double salario;

    // Builders
    public Funcionario() {

    }

    public Funcionario(int idFuncionario, String nomeFuncionario, double salarioFuncionario) {
        this.id = idFuncionario;
        this.nome = nomeFuncionario;
        this.salario = salarioFuncionario;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    // Setters
    private void setId(int idFuncionario) {
        this.id = idFuncionario;
    }

    private void setNome(String nomeFuncionario) {
        this.nome = nomeFuncionario;
    }

    private void setSalario(double salarioFuncionario) {
        this.salario = salarioFuncionario;
    }

    // Métodos personalizados
    public void aumentoSalario(double porcentagem) {
        setSalario(getSalario() + (getSalario() * porcentagem / 100.00));
    }

    public String listaFuncionario() {
        return getId() + ", " + getNome() + ", R$" + getSalario();
    }
}