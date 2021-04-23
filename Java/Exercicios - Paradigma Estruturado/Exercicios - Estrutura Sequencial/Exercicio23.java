/*
23 - Faça um programa que receba a medida de dois ângulos de um triângulo, 
calcule e mostre a medida do terceiro ângulo. Sabe-se que a soma dos ângulos 
de um triângulo é 180 graus. 
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double angulo1 = 0.00, angulo2 = 0.00, angulo3 = 0.00;
        
        System.out.printf("Digite o valor do 1º ângulo: ");
        angulo1 = in.nextDouble();
        
        System.out.printf("Digite o valor do 2º ângulo: ");
        angulo2 = in.nextInt();
        
        angulo3 = 180 - (angulo1 + angulo2);
        
        System.out.printf("O valor do 3º ângulo é %.2fº\n", angulo3);
        
        in.close();
    }     
}
