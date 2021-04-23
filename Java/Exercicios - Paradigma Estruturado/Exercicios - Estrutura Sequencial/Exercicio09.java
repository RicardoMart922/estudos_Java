/*
09 - Faça um programa que calcule e mostre a área de um trapézio. 
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio09 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double baseMaior = 0.00, baseMenor = 0.00, altura = 0.00, area = 0.00;
        
        System.out.printf("Digite o valor da base maior: ");
        baseMaior = in.nextDouble();
        
        System.out.printf("Digite o valor da base menor: ");
        baseMenor = in.nextDouble();
        
        System.out.printf("Digite o valor da altura: ");
        altura = in.nextDouble();
        
        area = ((baseMaior + baseMenor) * altura) / 2;
        
        System.out.printf("A área do trapézio é %.2f\n", area);
        
        in.close();
    }
}
