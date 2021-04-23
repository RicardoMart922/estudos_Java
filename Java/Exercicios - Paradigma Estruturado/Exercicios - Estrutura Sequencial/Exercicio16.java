/*
16 - Faça um programa que receba o valor dos catetos de um triângulo, calcule e 
mostre o valor da hipotenusa. 
 */
package exercicio.estrutura.sequencial;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import java.util.Scanner;

public class Exercicio16 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double catetoAdjacente = 0.00, catetoOposto = 0.00, hipotenusa = 0.00;
        
        System.out.printf("Digite o valor do cateto adjacente: ");
        catetoAdjacente = in.nextDouble();
        
        System.out.printf("Digite o valor do cateto oposto: ");
        catetoOposto = in.nextDouble();
        
        hipotenusa = sqrt(pow(catetoAdjacente, 2) + pow(catetoOposto, 2));
        
        System.out.printf("Hipotenusa = %.2f\n", hipotenusa);
        
        in.close();
    } 
}
