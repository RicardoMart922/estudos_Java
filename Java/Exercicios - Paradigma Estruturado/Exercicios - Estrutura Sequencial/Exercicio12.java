/*
12 - Faça um programa que receba o valor do salário mínimo e o valor do salário 
de um funcionário, calcule e mostre a quantidade de salários mínimos que esse 
funcionário ganha.
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio12 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double salarioMinimo = 0.00, salarioFuncionario = 0.00;
        int qtdSalarioMinimo = 0;
        
        System.out.printf("Digite o valor do salário mínimo: R$");
        salarioMinimo = in.nextDouble();
        
        System.out.printf("Digite o valor do salário do funcionário: R$");
        salarioFuncionario = in.nextDouble();
        
        qtdSalarioMinimo =(int) salarioFuncionario / (int) salarioMinimo;
        
        System.out.printf("A quantidade de salários é %d\n", qtdSalarioMinimo);
        
        in.close();
    }
}
