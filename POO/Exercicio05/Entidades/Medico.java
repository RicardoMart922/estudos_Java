package Entidades;

public class Medico extends Funcionario {
    private String crm;

    public Medico () {

    }

    public Medico (String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void opera() {
        System.out.printf("Operação bem sucedida!");
    }

    public String statusMedico() {
        return "Nome: " + getNome() + "\nSexo: " + getSexo() + "\n" + super.statusFuncionario() + "\nCRM: " + getCrm();
    }
}
