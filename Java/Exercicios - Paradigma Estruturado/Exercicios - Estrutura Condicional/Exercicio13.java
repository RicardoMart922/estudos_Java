/*
13 - Faça um programa que receba o preço de um produto, calcule e mostre, de 
acordo com as tabelas a seguir, o novo preço e a classificação.
    TABELA 1 — PERCENTUAL DE AUMENTO
Preço                               %
Até R$ 50,00                        5
Entre R$ 50,00 e R$ 100,00          10
Acima de R$ 100,00                  15

    TABELA 2 — CLASSIFICAÇÕES
Novo Preço                               Classificação
Até R$ 80,00                                Barato
Entre R$ 80,00 e R$ 120,00 (inclusive)      Normal
Entre R$ 120,00 e R$ 200,00 (inclusive)     Caro
Maior que R$ 200,00                         Muito Caro
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double precoProduto = 0.00;
        
        System.out.printf("Preço do produto: R$");
        precoProduto = in.nextDouble();
        
        if (precoProduto <= 50.00) {
            precoProduto += (precoProduto * 0.05); 
        } else if (precoProduto > 50.00 && precoProduto <= 100.00) {
            precoProduto += (precoProduto * 0.1);
        } else {
            precoProduto += (precoProduto * 0.15);
        }
        
        if (precoProduto <= 80.00) {
            System.out.printf("Preço do produto: R$%.2f\n", precoProduto);
            System.out.printf("Classificação: Barato!\n");
        } else if (precoProduto > 80.00 && precoProduto <= 120.00) {
            System.out.printf("Preço do produto: R$%.2f\n", precoProduto);
            System.out.printf("Classificação: Normal!\n");
        } else if (precoProduto > 120.00 && precoProduto <= 200.00) {
            System.out.printf("Preço do produto: R$%.2f\n", precoProduto);
            System.out.printf("Classificação: Caro!\n");
        } else {
            System.out.printf("Preço do produto: R$%.2f\n", precoProduto);
            System.out.printf("Classificação: Muito caro!\n");
        }
        
        in.close();
    }
    
}
