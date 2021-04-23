/*
08 - Faça um programa que receba o peso de uma pessoa em quilos, calcule e 
mostre esse peso em gramas.
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double peso = 0.00;
        
        System.out.printf("Digite o peso em KG: ");
        peso = in.nextDouble();
        
        peso = peso * 1000;
        
        System.out.printf("O peso em gramas é %.2f\n", peso);
        
        in.close();
    }
}
