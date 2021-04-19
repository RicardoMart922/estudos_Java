package exercicio05;

public class Funcionario {
    private String nome;
    private int horasTrabalhadas;
    private double valorHora;
    
    // Construtores
    public Funcionario() {
        
    }
    
    public Funcionario(String nomeFun, int hora, double valor) {
        this.nome = nomeFun;
        this.horasTrabalhadas = hora;
        this.valorHora = valor;
    }
    
    // Getters
    public String getNome() {
        return nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }
    
    // Setters
    public void setNome(String nomeFun) {
        this.nome = nomeFun;
    }

    public void setHorasTrabalhadas(int horas) {
        this.horasTrabalhadas = horas;
    }

    public void setValorHora(double valor) {
        this.valorHora = valor;
    }
    
    // Método personalizado
    public double pagamentos() {
        double pagamento = this.getValorHora() * this.getHorasTrabalhadas();
        return pagamento;
    } 
    
    public void status() {
        System.out.println(this.getNome() + ": R$" + this.pagamentos());
    }
}
