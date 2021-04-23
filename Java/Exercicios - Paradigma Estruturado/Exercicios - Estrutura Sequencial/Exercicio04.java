/*
04 - Faça um programa que receba duas notas, calcule e mostre a média ponderada 
dessas notas, considerando peso 2 para a primeira e peso 3 para a segunda.
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double nota1 = 0.00, nota2 = 0.00, mediaPonderada = 0.00;
        
        System.out.printf("Digite a 1º nota: ");
        nota1 = in.nextDouble();
        
        System.out.printf("Digite a 2º nota: ");
        nota2 = in.nextDouble();
        
        mediaPonderada = ((2 * nota1) + (3 * nota2)) / 5;
        
        System.out.printf("A média ponderada entre %.2f e %.2f é %.2f\n", nota1, nota2, mediaPonderada);
        
        in.close();
    }
}
