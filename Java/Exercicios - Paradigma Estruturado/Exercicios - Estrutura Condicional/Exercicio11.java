/*
11 - Faça um programa que receba o salário atual de um funcionário e, usando 
a tabela a seguir, calcule e mostre o valor do aumento e o novo salário.
Salário                     Percentual de Aumento
Até R$ 300,00                      15% 
R$ 300,00 º----º R$ 600,00         10% 
R$ 600,00 *----* R$ 900,00         5% 
Acima de R$ 900,00                 0%
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double salarioAtual = 0.00, aumento = 0.00;
        
        System.out.printf("Salário atual do funcionário: R$");
        salarioAtual = in.nextDouble();
        
        if (salarioAtual <= 300.00) {
            aumento = (salarioAtual * 0.15);
        } else if (salarioAtual > 300.00 && salarioAtual < 600.00) {
            aumento = (salarioAtual * 0.1);
        } else if (salarioAtual >= 600.00 && salarioAtual <= 900.00) {
            aumento = (salarioAtual * 0.05);
        } else {
            aumento = (salarioAtual * 0.0);
        }
        
        salarioAtual += aumento; 
        
        System.out.printf("Valor do aumento: R$%.2f\n", aumento);
        System.out.printf("O salário do funcionário: R$%.2f\n", salarioAtual);
        
        in.close();
    }
    
}
