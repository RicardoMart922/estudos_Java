/*
02 - Faça um programa que receba três números, calcule e mostre a multiplicação
desses números.
*/
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double numero1 = 0.00, numero2 = 0.00, numero3 = 0.00, produto = 0.00;
        
        System.out.printf("Digite o 1º número: ");
        numero1 = in.nextDouble();
        
        System.out.printf("Digite o 2º número: ");
        numero2 = in.nextDouble();
        
        System.out.printf("Digite o 3º número: ");
        numero3 = in.nextDouble();
        
        produto = numero1 * numero2 * numero3;
        
        System.out.printf("O produto dos três números é %.2f", produto);
        
        in.close();
    }
}
