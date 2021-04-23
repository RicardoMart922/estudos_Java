/*
05 - Faça um programa que receba o preço de um produto, calcule e mostre o novo 
preço, sabendo-se que este sofreu um desconto de 10%. 
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double preco = 0.00;
        
        System.out.printf("Digite o preço do produto: R$");
        preco = in.nextDouble();
        
        preco = preco - (preco * 0.1);
        
        System.out.printf("O novo preço do produto é R$%.2f\n", preco);
        
        in.close();
    }
}
