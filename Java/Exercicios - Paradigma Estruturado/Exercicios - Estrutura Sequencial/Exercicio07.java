/*
07 - Faça um programa que receba o peso de uma pessoa, calcule e mostre: 
a) o novo peso, se a pessoa engordar 15% sobre o peso digitado;
b) o novo peso, se a pessoa emagrecer 20% sobre o peso digitado. 
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio07 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double peso = 0.00;
        
        System.out.printf("Digite o seu peso: ");
        peso = in.nextDouble();
        
        peso = peso + (peso * 0.15);
        
        System.out.printf("O seu novo peso se você engorda em 15%% é %.2fkg\n", peso);
        
        peso = peso - (peso * 0.2);
        
        System.out.printf("O seu novo peso se você emagrecer em 20%% é %.2fkg\n", peso);
        
        in.close();
    }
}
