/*
14 - Faça um programa que receba o ano de nascimento de uma pessoa e o ano 
atual, calcule e mostre: 
a) a idade dessa pessoa em anos; 
b) a idade dessa pessoa em meses; 
c) a idade dessa pessoa em dias; 
d) a idade dessa pessoa em semanas. 
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio14 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int anoNascimento = 0, anoAtual = 0;
        double idadeAnos = 0.00, idadeMeses = 0.00, idadeDias = 0.00, idadeSemanas = 0.00;
        
        System.out.printf("Digite o ano do seu nascimento: ");
        anoNascimento = in.nextInt();
        
        System.out.printf("Digite o ano atual: ");
        anoAtual = in.nextInt();
        
        // a) a idade dessa pessoa em anos; 
        idadeAnos = anoAtual - anoNascimento;
        System.out.printf("Você tem %f anos de idade.\n", idadeAnos);
        
        // b) a idade dessa pessoa em meses; 
        idadeMeses = idadeAnos * 12;
        System.out.printf("Você tem %f meses de idade.\n", idadeMeses);
        
        // c) a idade dessa pessoa em dias; 
        idadeDias = idadeAnos * 365;
        System.out.printf("Você tem %f dias de idade.\n", idadeMeses);
        
        // d) a idade dessa pessoa em semanas.
        idadeSemanas = idadeMeses * 4.345;
        System.out.printf("Você tem %f semanas de idade.\n", idadeSemanas);
        
        in.close();
    }
}
