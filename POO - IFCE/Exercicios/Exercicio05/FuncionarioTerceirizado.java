package exercicio05;

public class FuncionarioTerceirizado extends Funcionario{
    private double despesaAdicional;
    
    // Construtores
    public FuncionarioTerceirizado() {
    
    }
    
    public FuncionarioTerceirizado(String nome, int hora, double valor, double despesa) {
        super(nome, hora, valor);
        this.despesaAdicional = despesa;
    }
    
    // Getter
    public double getDespesaAdicional() {
        return despesaAdicional;
    }

    // Setter
    public void setDespesaAdicional(double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }
    
    // Métodos personalizados
    @Override
    public double pagamentos() {
        double pagamento = super.pagamentos() + this.getDespesaAdicional();
        return pagamento;
    }
}
