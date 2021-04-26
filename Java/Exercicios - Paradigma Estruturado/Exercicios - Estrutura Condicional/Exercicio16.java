/*
16 - Uma empresa decide aplicar descontos nos seus preços usando a tabela a 
seguir. Faça um programa que receba o preço atual de um produto e seu código, 
calcule e mostre o valor do desconto e o novo preço.
PREÇO ATUAL                    % DE DESCONTO
Até R$ 30,00                     Sem desconto
Entre R$ 30,00 e R$ 100,00       10%
Acima de R$ 100,00               15%
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double precoProduto = 0.00;
        int codigoProduto = 0;
        
        System.out.printf("Preço do produto: R$");
        precoProduto = in.nextDouble();
        
        System.out.printf(">> Códigos disponíveis <<\n");
        System.out.printf("[1] - Produto de limpeza;\n");
        System.out.printf("[2] - Produto alimentício;\n");
        System.out.printf("[3] - Produto de beleza.\n");
        
        System.out.printf("Código do produto: ");
        codigoProduto = in.nextInt();
        
        switch (codigoProduto) {
            case 1:
                if (precoProduto <= 30.00) {
                    System.out.printf("Desconto: R$%.2f\n", (precoProduto * 0));
                    precoProduto -= (precoProduto * 0);
                } else if (precoProduto > 30.00 && precoProduto <= 100.00) {
                    System.out.printf("Desconto: R$%.2f\n", (precoProduto * 0.1));
                    precoProduto -= (precoProduto * 0.1); 
                } else {
                    System.out.printf("Desconto: R$%.2f\n", (precoProduto * 0.15));
                    precoProduto -= (precoProduto * 0.15);
                }
                System.out.printf("Preço do Produto: R$%.2f\n", precoProduto);
                break;
            case 2:
                if (precoProduto <= 30.00) {
                    System.out.printf("Desconto: R$%.2f\n", (precoProduto * 0));
                    precoProduto -= (precoProduto * 0);
                } else if (precoProduto > 30.00 && precoProduto <= 100.00) {
                    System.out.printf("Desconto: R$%.2f\n", (precoProduto * 0.1));
                    precoProduto -= (precoProduto * 0.1); 
                } else {
                    System.out.printf("Desconto: R$%.2f\n", (precoProduto * 0.15));
                    precoProduto -= (precoProduto * 0.15);
                }
                System.out.printf("Preço do Produto: R$%.2f\n", precoProduto);
                break;
            case 3:
                if (precoProduto <= 30.00) {
                    System.out.printf("Desconto: R$%.2f\n", (precoProduto * 0));
                    precoProduto -= (precoProduto * 0);
                } else if (precoProduto > 30.00 && precoProduto <= 100.00) {
                    System.out.printf("Desconto: R$%.2f\n", (precoProduto * 0.1));
                    precoProduto -= (precoProduto * 0.1); 
                } else {
                    System.out.printf("Desconto: R$%.2f\n", (precoProduto * 0.15));
                    precoProduto -= (precoProduto * 0.15);
                }
                System.out.printf("Preço do Produto: R$%.2f\n", precoProduto);
                break;
            default:
                System.out.printf("Código do produto inválido!\n");
                break;
        }
        
        in.close();
    }
    
}
