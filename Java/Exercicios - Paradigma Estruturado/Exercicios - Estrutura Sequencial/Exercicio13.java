/*
13 - Faça um programa que calcule e mostre a tabuada de um número digitado pelo 
usuário. 
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double numero = 0.00;
        
        System.out.printf("Digite um número: ");
        numero = in.nextDouble();
        
        System.out.printf("%.2f X 1 = %.2f\n", numero, numero * 1);
        System.out.printf("%.2f X 2 = %.2f\n", numero, numero * 2);
        System.out.printf("%.2f X 3 = %.2f\n", numero, numero * 3);
        System.out.printf("%.2f X 4 = %.2f\n", numero, numero * 4);
        System.out.printf("%.2f X 5 = %.2f\n", numero, numero * 5);
        System.out.printf("%.2f X 6 = %.2f\n", numero, numero * 6);
        System.out.printf("%.2f X 7 = %.2f\n", numero, numero * 7);
        System.out.printf("%.2f X 8 = %.2f\n", numero, numero * 8);
        System.out.printf("%.2f X 9 = %.2f\n", numero, numero * 9);
        System.out.printf("%.2f X 10 = %.2f\n", numero, numero * 10);
        
        in.close();
    }
}
