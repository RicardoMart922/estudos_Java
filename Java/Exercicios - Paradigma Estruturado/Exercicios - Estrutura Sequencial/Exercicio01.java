/*
01 - Faça um programa que receba dois números, calcule e mostre a subtração do 
primeiro número pelo segundo.
*/
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double numero1 = 0.00, numero2 = 0.00, subtracao = 0.00;
        
        System.out.printf("Digite o primeiro número: ");
        numero1 = in.nextDouble();
        
        System.out.printf("Digite o segundo número: ");
        numero2 = in.nextDouble();
        
        subtracao = numero1 - numero2;
        
        System.out.printf("A subtração do número %.2f por %.2f = %.2f\n", numero1, numero2, subtracao);

	in.close();
    }
    
}
