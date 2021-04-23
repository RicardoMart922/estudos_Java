/*
10 - Faça um programa que calcule e mostre a área de um quadrado.
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio10 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double lado = 0.00, area = 0.00;
        
        System.out.printf("Digite o valor do lado do quadrado: ");
        lado = in.nextDouble();
        
        area = lado * lado;
        
        System.out.printf("A área do quadrado é %.2f m²\n", area);
        
        in.close();
    }
}
