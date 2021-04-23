/*
22 - Faça um programa que receba o número de lados de um polígono convexo, 
calcule e mostre o número de diagonais desse polígono. Sabe-se que 
ND = N * (N − 3)/2, em que N é o número de lados do polígono. 
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numeroLados = 0, numeroDiagonais = 0;
        
        System.out.printf("Digite o número de lados do polígono: ");
        numeroLados = in.nextInt();
        
        numeroDiagonais = (numeroLados * (numeroLados - 3)) / 2;
        
        System.out.printf("O número de diagonais desse polígono é %d\n", numeroDiagonais);
        
        in.close();
    }     
}
