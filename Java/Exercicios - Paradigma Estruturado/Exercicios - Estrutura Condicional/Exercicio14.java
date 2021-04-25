/*
14 - Faça um programa que receba o salário de um funcionário e, usando a tabela 
a seguir, calcule e mostre o novo salário.
FAIXA SALARIAL                % DE AUMENTO
Até R$ 300,00                    50%
R$ 300,00 º----* R$ 500,00       40%
R$ 500,00 º----* R$ 700,00       30%
R$ 700,00 º----* R$ 800,00       20%
R$ 800,00 º----* R$ 1.000,00     10%
Acima de R$ 1.000,00             5%
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double salarioFuncionario = 0.00;
        
        System.out.printf("Salário do funcionário: R$");
        salarioFuncionario = in.nextDouble();
        
        if (salarioFuncionario <= 300.00) {
            salarioFuncionario += (salarioFuncionario * 0.5);
        } else if (salarioFuncionario > 300.00 && salarioFuncionario <= 500.00) {
            salarioFuncionario += (salarioFuncionario * 0.4);
        } else if (salarioFuncionario > 500.00 && salarioFuncionario <= 700.00) {
            salarioFuncionario += (salarioFuncionario * 0.3);
        } else if (salarioFuncionario > 700.00 && salarioFuncionario <= 800.00) {
            salarioFuncionario += (salarioFuncionario * 0.2);
        } else if (salarioFuncionario > 800.00 && salarioFuncionario <= 1000.00) {
            salarioFuncionario += (salarioFuncionario * 0.1);
        } else {
            salarioFuncionario += (salarioFuncionario * 0.05);
        }
        
        System.out.printf("O salário do funcionário agora é R$%.2f\n", salarioFuncionario);
        
        in.close();
    }
    
}
