/*
Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, deseja-se
registrar nome, horas trabalhadas e valor por hora. 
Funcionários terceirizado possuem ainda uma despesa adicional.
O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas
trabalhadas, sendo que os funcionários terceirizados ainda recebem um bônus correspondente
a 100% de sua despesa adicional.
Fazer um programa para instanciar um funcionário próprio e outro terceirizado. Depois de ler
os dados dos funcionários, mostrar nome e pagamento de cada funcionário.
*/
package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String nome;
        int horasTrabalhadas = 0;
        double valorHora = 0.00, despesa = 0.00;
        
        // Primeiro Funcionário
        System.out.printf("Informe o nome do 1º funcionário: ");
        nome = in.next();
        in.nextLine();
            
        System.out.printf("Informe o quantidades de horas trabalhadas: ");
        horasTrabalhadas = in.nextInt();
            
        System.out.printf("Informe o valor da hora trabalhada: R$");
        valorHora = in.nextDouble();

        FuncionarioProprio funcionarioProprio = new FuncionarioProprio(nome, horasTrabalhadas, valorHora);
        
        System.out.printf("-=-=-=-=-==-=-=-=-=-");
        // Segundo Funcionário
        System.out.printf("Informe o nome do 2º funcionário: ");
        nome = in.next();
        in.nextLine();
            
        System.out.printf("Informe o quantidades de horas trabalhadas: ");
        horasTrabalhadas = in.nextInt();
            
        System.out.printf("Informe o valor da hora trabalhada: R$");
        valorHora = in.nextDouble();
        
        System.out.printf("Informe o valor do bônus: R$");
        despesa = in.nextDouble();
                    
        FuncionarioTerceirizado funcionarioTerceirizado = new FuncionarioTerceirizado(nome, horasTrabalhadas, valorHora, despesa);
        
        // Apresentação do pagamento
        System.out.printf(">>>=-=-> PAGAMENTOS <-=-=<<<");
        funcionarioProprio.status();
      
        funcionarioTerceirizado.status();
        
        in.close();
    }
    
}
