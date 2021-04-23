/*
03 - Faça um programa que receba dois números, calcule e mostre a divisão do 
primeiro número pelo segundo. Sabe-se que o segundo número não pode ser zero, 
portanto, não é necessário se preocupar com validações.
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double numero1 = 0.00, numero2 = 0.00, divisao = 0.00;
        
        System.out.printf("Digite um número: ");
        numero1 = in.nextDouble();
        
        System.out.printf("Digite outro número: ");
        numero2 = in.nextDouble();
        
        divisao = numero1 / numero2;
        
        System.out.printf("A divisão do %.2f / %.2f = %.2f\n", numero1, numero2, divisao);
        
        in.close();
    }
}
