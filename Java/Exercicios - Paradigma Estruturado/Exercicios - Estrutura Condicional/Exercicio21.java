/*
21 - Faça um programa que receba o preço de um produto e seu código de origem e 
mostre sua procedência. A procedência obedece à tabela a seguir.
CÓDIGO DE ORIGEM           PROCEDÊNCIA
1                              Sul
2                             Norte
3                             Leste
4                             Oeste
5 ou 6                       Nordeste
7 ou 8 ou 9                  Sudeste
10 a 20                    Centro-oeste
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double precoProduto = 0.00;
        int codigoOrigem = 0;
                
        System.out.printf("Preço do produto: R$");
        precoProduto = in.nextDouble();
        
        System.out.printf("Código de origem: ");
        codigoOrigem = in.nextInt();
        
        switch (codigoOrigem) {
            case 1:
                System.out.printf("Precedência: Sul\n");
                break;
            case 2:
                System.out.printf("Precedência: Norte\n");
                break;
            case 3:
                System.out.printf("Precedência: Leste\n");
                break;
            case 4:
                System.out.printf("Precedência: Oeste\n");
                break;
            default:
                if (codigoOrigem == 5 || codigoOrigem == 6) {
                    System.out.printf("Precedência: Nordeste\n");
                } else if (codigoOrigem == 7 || codigoOrigem == 8 || codigoOrigem == 9) {
                    System.out.printf("Precedência: Suldeste\n");
                } else if (codigoOrigem >= 10 && codigoOrigem <= 20) {
                    System.out.printf("Precedência: Centro-oeste\n");
                } else {
                    System.out.printf("Código de origem inválido!\n");
                }
                break;
        }
                
        in.close();
    }
    
}
