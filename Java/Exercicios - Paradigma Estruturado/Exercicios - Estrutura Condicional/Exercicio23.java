/*
23 - Faça um programa que receba: 
■ o código do produto comprado; e
■ a quantidade comprada do produto.
Calcule e mostre: 
■ o preço unitário do produto comprado, seguindo a Tabela I; 
■ o preço total da nota; 
■ o valor do desconto, seguindo a Tabela II e aplicado sobre o preço total da nota; e
■ o preço final da nota depois do desconto. 

TABELA I
CÓDIGO             PREÇO
1 a 10            R$ 10,00
11 a 20           R$ 15,00
21 a 30           R$ 20,00
31 a 40           R$ 30,00

TABELA II
PREÇO TOTAL DA NOTA            % DE DESCONTO
Até R$ 250,00                       5%
Entre R$ 250,00 e R$ 500,00         10%
Acima de R$ 500,00                  15%
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int codigoProduto = 0, quantidadeProduto = 0;
        double precoUnitario = 0.00, precoTotal = 0.00, precoFinal = 0.00, desconto = 0.00;
        
        System.out.printf("Código do produto: ");
        codigoProduto = in.nextInt();
        
        System.out.printf("Quantidade comprada do produto: ");
        quantidadeProduto = in.nextInt();
        
        if (codigoProduto >= 1 && codigoProduto <= 10) {
            precoUnitario = 10.00;
        } else if (codigoProduto >= 11 && codigoProduto <= 20) {
            precoUnitario = 15.00;
        } else if (codigoProduto >= 21 && codigoProduto <= 30) {
            precoUnitario = 20.00;
        } else if (codigoProduto >= 31 && codigoProduto <= 40) {
            precoUnitario = 30.00;
        } else {
            System.out.printf("Código do produto inválido!\n");
        }
        
        System.out.printf("Preço unitário do produto: R$%.2f\n", precoUnitario);
        
        precoTotal = precoUnitario * quantidadeProduto;
        
        System.out.printf("Preço total da nota: R$%.2f\n", precoTotal);
        
        if (precoTotal <= 250.00) {
            desconto = precoTotal * 0.05;
        } else if (precoTotal > 250.00 && precoTotal <= 500.00) {
            desconto = precoTotal * 0.1;
        } else {
            desconto = precoTotal * 0.15;
        }
        
        System.out.printf("O valor do desconto: R$%.2f\n", desconto);
        
        precoFinal = precoTotal - desconto;
        
        System.out.printf("Preço final da nota: R$%.2f\n", precoFinal);
                
        in.close();
    }
    
}
