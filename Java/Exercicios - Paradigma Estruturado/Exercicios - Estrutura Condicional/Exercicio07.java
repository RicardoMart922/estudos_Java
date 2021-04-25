/*
7 - Uma empresa decide dar um aumento de 30% aos funcionários com salários 
inferiores a R$ 500,00. Faça um programa que receba o salário do funcionário 
e mostre o valor do salário reajustado ou uma mensagem, caso ele não tenha 
direito ao aumento.
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double salarioFuncionario = 0.00;
        
        System.out.printf("Digite o salário do funcionário: R$");
        salarioFuncionario = in.nextDouble();
        
        if (salarioFuncionario < 500.00) {
            salarioFuncionario += (salarioFuncionario * 0.3);
            System.out.printf("Novo salário = R$%.2f\n", salarioFuncionario);
        } else {
            System.out.printf("o funcionário não tem direito!\n");
        }
        
        in.close();
    }
    
}
