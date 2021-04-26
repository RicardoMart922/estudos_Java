/*
18 - Faça um programa que receba a idade de uma pessoa e mostre a mensagem de 
maioridade ou não.
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int idade = 0;
        
        System.out.printf("Idade: ");
        idade = in.nextInt();
        
        if (idade < 18) {
            System.out.printf("Ainda não atingiu a maioridade.\n");
        } else {
            System.out.printf("Chegou a maioridade!\n");
        }
        
        in.close();
    }
    
}
