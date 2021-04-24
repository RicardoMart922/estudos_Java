/*
4 - Faça um programa que receba três números e mostre o maior
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double numero1 = 0.00, numero2 = 0.00, numero3 = 0.00;
        
        System.out.printf("1º número: ");
        numero1 = in.nextDouble();
        
        System.out.printf("2º número: ");
        numero2 = in.nextDouble();
        
        System.out.printf("3º número: ");
        numero3 = in.nextDouble();
        
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.printf("O %.2f é maior que os demais!\n", numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.printf("O %.2f é maior que os demias!\n", numero2);
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.printf("O %.2f é maior que os demais!\n", numero3);
        }
         
        in.close();
    }
}
