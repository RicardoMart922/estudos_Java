/*
15 - João recebeu seu salário e precisa pagar duas contas atrasadas. Em razão 
do atraso, ele deverá pagar multa de 2% sobre cada conta. Faça um programa que 
calcule e mostre quanto restará do salário de João. 
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio15 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double salario = 0.00, valorConta1 = 0.00, valorConta2 = 0.00;
        
        System.out.printf("Digite o valor do salário: R$");
        salario = in.nextDouble();
        
        System.out.printf("Digite o valor da 1º conta: R$");
        valorConta1 = in.nextDouble();
        
        System.out.printf("Digite o valor da 2º conta: R$");
        valorConta2 = in.nextDouble();
        
        valorConta1 = valorConta1 + (valorConta1 * 0.02);
        valorConta2 = valorConta2 + (valorConta2 * 0.02);
        salario = salario - (valorConta1 + valorConta2);
        
        System.out.printf("Sobrou R$%.2f do salário de João.\n", salario);
        
        in.close();
    } 
}
