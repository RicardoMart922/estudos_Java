/*
* 1 - Peras custam R$ 1,00 cada se forem compradas menos do que uma dúzia, e 
* R$ 0,75 se forem compradas pelo menos doze. Escreva um programa que leia o 
* número de peras compradas, calcule e escreva o valor total dessa compra.
*/

package exercicio04;

import java.util.Scanner;

public class PrimeiraQuestao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdPeras;
        float preco;
           
        System.out.print("Informe a quantidade de peras: ");
        qtdPeras = sc.nextInt();
            
        if (qtdPeras < 12) {
            preco = (float) (qtdPeras * 1.00);
            System.out.printf("O preço da compra é R$%.2f\n", preco);
        } else {
            preco = (float) (qtdPeras * 0.75);
            System.out.printf("O preço da compra é R$%.2f\n", preco);
        }
        sc.close();
    }
    
}
