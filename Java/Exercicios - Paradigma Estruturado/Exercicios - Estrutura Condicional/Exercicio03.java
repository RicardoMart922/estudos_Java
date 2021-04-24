/*
3 - Faça um programa que receba dois números e mostre o menor.
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio03 {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double numero1 = 0.00, numero2 = 0.00;
        
        System.out.printf("1º número: ");
        numero1 = in.nextDouble();
        
        System.out.printf("2º número: ");
        numero2 = in.nextDouble();
        
        if (numero1 > numero2) {
            System.out.printf("O %.2f é maior que %.2f\n", numero1, numero2);
        } else {
            System.out.printf("O %.2f é maior que %.2f\n", numero2, numero1);
        }
        
        in.close();
    }
}
