/*
11 - Faça um programa que calcule e mostre a área de um losango.
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio11 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double diagonalMaior = 0.00, diagonalMenor = 0.00, area = 0.00;
        
        System.out.printf("Digite o valor da diagonal maior: ");
        diagonalMaior = in.nextDouble();
        
        System.out.printf("Digite o valor da diagonal menor: ");
        diagonalMenor = in.nextDouble();
        
        area = (diagonalMaior * diagonalMenor) / 2;
        
        System.out.printf("A área do losango é %.2f m²\n", area);
        
        in.close();
    }
}
