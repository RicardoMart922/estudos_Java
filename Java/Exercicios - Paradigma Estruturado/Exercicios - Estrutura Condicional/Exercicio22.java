/*
22 - Faça um programa que receba a idade e o peso de uma pessoa. De acordo com 
a tabela a seguir, verifique e mostre em qual grupo de risco essa pessoa se 
encaixa.
IDADE                          PESO
                    Até 60  |  Entre 60 e 90 (inclusive) |  Acima de 90
Menores que 20  |       9             8                          7
De 20 a 50      |       6             5                          4
Maiores que 50  |       3             2                          1
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int idade = 0;
        double peso = 0.00;
        
        System.out.printf("Idade: ");
        idade = in.nextInt();
        
        System.out.printf("Peso: ");
        peso = in.nextDouble();
        
        if (idade < 20) {
            if (peso <= 60.00) {
                System.out.printf("Seu grupo é o 9\n");
            } else if (peso > 60.00 && peso <= 90.00) {
                System.out.printf("Seu grupo é o 8\n");
            } else {
                System.out.printf("Seu grupo é o 7\n");
            }
        } else if (idade >= 20 && idade <= 50) {
            if (peso <= 60.00) {
                System.out.printf("Seu grupo é o 6\n");
            } else if (peso > 60.00 && peso <= 90.00) {
                System.out.printf("Seu grupo é o 5\n");
            } else {
                System.out.printf("Seu grupo é o 4\n");
            }
        } else {
            if (peso <= 60.00) {
                System.out.printf("Seu grupo é o 3\n");
            } else if (peso > 60.00 && peso <= 90.00) {
                System.out.printf("Seu grupo é o 2\n");
            } else {
                System.out.printf("Seu grupo é o 1\n");
            }
        }
        
        in.close();
    }
    
}
