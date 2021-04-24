/*
2 - Faça um programa que receba duas notas, calcule e mostre a média aritmética
e a mensagem que se encontra na tabela a seguir: 
    Média aritmética         Mensagem
      0.0 *----º 3.0    |    Reprovado
      3.0 *----º 7.0    |    Exame
      7.0 *----* 10.0   |    Aprovado
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double nota1 = 0.00, nota2 = 0.00, media = 0.00;
        
        System.out.printf("1º nota: ");
        nota1 = in.nextDouble();
        
        System.out.printf("2º nota: ");
        nota2 = in.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        System.out.printf("Média = %.2f\n", media);
        
        if (media >= 0.0 && media < 3.0) {
            System.out.printf("Reprovado!\n");
        } else if (media >= 3.0 && media < 7.0) {
            System.out.printf("Exame!\n");
        } else if (media >= 7.0 && media <= 10.0) {
            System.out.printf("Aprovado!\n");
        }
        
        in.close();        
    }
}
