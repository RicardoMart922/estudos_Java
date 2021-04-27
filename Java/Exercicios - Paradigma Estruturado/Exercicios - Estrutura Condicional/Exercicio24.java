/*
24 - Faça um programa que receba o preço, a categoria (1 — limpeza; 2 — alimentação; ou 3 — vestuário) 
e a situação (R — produtos que necessitam de refrigeração; e N — produtos que não necessitam de refrigeração). 
Calcule e mostre:

■ O valor do aumento, usando as regras que se seguem.
PREÇO            CATEGORIA               PERCENTUAL DE AUMENTO

                    1                           5%
 <= 25              2                           8%
                    3                           10%

                    1                           12%
  > 25              2                           15%
                    3                           18%

■ O valor do imposto, usando as regras a seguir:
O produto que preencher pelo menos um dos seguintes requisitos pagará imposto 
equivalente a 5% do preço; caso contrário, pagará 8%. 
Os requisitos são:
Categoria: 2
Situação: R

■ O novo preço, ou seja, o preço mais aumento menos imposto. 

■ A classificação, usando as regras a seguir. 
NOVO PREÇO                       CLASSIFICAÇÃO
<= R$50,00                          Barato
Entre R$50,00 e R$120,00            Normal
>= R$ 120,00                        Caro

 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double precoProduto = 0.00;
        double valorAumento = 0.00, valorImposto = 0.00;
        int categoriaProduto = 0;
        String situacaoProduto;
        
        System.out.printf("Preço do produto: R$");
        precoProduto = in.nextDouble();
        
        System.out.printf(">> CATEGORIA DO PRODUTO <<\n");
        System.out.printf("[1] - Limpeza  [2] - Alimentação  [3] - Vestuário\n");
        System.out.printf("Categoria: ");
        categoriaProduto = in.nextInt();
        in.nextLine();
        
        System.out.printf(">> SITUAÇÃO DO PRODUTO <<\n");
        System.out.printf("[R] - Necessitam de refrigeração.\n");
        System.out.printf("[N] - Não necessitam de refrigeração.\n");
        System.out.printf("Situação: S");
        situacaoProduto = in.nextLine();
        
        // Valor do aumento
        if (precoProduto <= 25.00) {
            switch (categoriaProduto) {
                case 1:
                    valorAumento = precoProduto * 0.05;
                    break;
                case 2:
                    valorAumento = precoProduto * 0.08;
                    break;
                case 3:
                    valorAumento = precoProduto * 0.1;
                    break;
                default:
                    System.out.printf("Categoria inválida!\n");
                    break;
            }
        } else {
            switch (categoriaProduto) {
                case 1:
                    valorAumento = precoProduto * 0.12;
                    break;
                case 2:
                    valorAumento = precoProduto * 0.15;
                    break;
                case 3:
                    valorAumento = precoProduto * 0.18;
                    break;
                default:
                    System.out.printf("Categoria inválida!\n");
                    break;
            }
        }
        
        // Valor do imposto
        if (categoriaProduto == 2 || "R".equals(situacaoProduto)) {
            valorImposto = precoProduto * 0.05;
        } else {
            valorImposto = precoProduto * 0.08;
        }
        
        // Preço final do produto
        precoProduto += valorAumento - valorImposto;
        System.out.printf("Preço do produto: R$%.2f\n", precoProduto);
        
        if (precoProduto <= 50.00) {
            System.out.printf("É um produto barato!\n");
        } else if (precoProduto > 50.00 && precoProduto < 120.00) {
            System.out.printf("É um produto normal!\n");
        } else {
            System.out.printf("É um produto caro!\n");
        }
        
        in.close();
    }
    
}
