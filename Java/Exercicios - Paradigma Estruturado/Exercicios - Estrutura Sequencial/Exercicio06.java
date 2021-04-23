/*
06 - Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. 
Faça um programa que receba o salário fixo do funcionário e o valor de suas 
vendas, calcule e mostre a comissão e seu salário final.
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double salarioFixo = 0.00, valorVendas = 0.00, comissao = 0.00;
        
        System.out.printf("Digite o salário do funcionário: R$");
        salarioFixo = in.nextDouble();
        
        System.out.printf("Digite o valor das vendas do funcionário: R$");
        valorVendas = in.nextDouble();
        
        comissao = (valorVendas * 0.04);
        
        salarioFixo = salarioFixo + comissao;
        
        System.out.printf("Comissão: R$%.2f\n", comissao);
        System.out.printf("Salário: R$%.2f\n", salarioFixo);
        
        in.close();
    }
}
