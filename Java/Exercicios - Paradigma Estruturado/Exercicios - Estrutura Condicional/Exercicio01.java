/*
1 - Faça um programa que receba quatro notas de um aluno, calcule e mostre a 
média aritmética das notas e a mensagem de aprovado ou reprovado, considerando 
para aprovação média 7.
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double nota1 = 0.00, nota2 = 0.00, nota3 = 0.00, nota4 = 0.00;
        double media = 0.00;
        
        System.out.printf("1º nota: ");
        nota1 = in.nextDouble();
        
        System.out.printf("2º nota: ");
        nota2 = in.nextDouble();
        
        System.out.printf("3º nota: ");
        nota3 = in.nextDouble();
        
        System.out.printf("4º nota: ");
        nota4 = in.nextDouble();
        
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.printf("Média = %.2f\n", media);
        
        if (media >= 7.00) {
            System.out.printf("Aprovado!\n");
        } else {
            System.out.printf("Reprovado!\n");
        }
        
        in.close();
    }
}
