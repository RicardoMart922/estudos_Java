/*
19 - Sabe-se que, para iluminar de maneira correta os cômodos de uma casa, para 
cada m2, deve-se usar 18 W de potência. Faça um programa que receba as duas 
dimensões de um cômodo (em metros), calcule e mostre a sua área (em m2) e a 
potência de iluminação que deverá ser utilizada.
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double larguraComodo = 0.00, comprimentoComodo = 0.00, areaComodo = 0.00, potenciaInluminacao = 0.00;
        
        System.out.printf("Digite o valor da largura do cômodo: ");
        larguraComodo = in.nextDouble();
        
        System.out.printf("Digite o valor do comprimento do cômodo: ");
        comprimentoComodo = in.nextDouble();
        
        areaComodo = larguraComodo * comprimentoComodo;
        
        potenciaInluminacao = areaComodo * 18;
        
        System.out.printf("A área do cômodo é %.2f m² e a potência necessária para a inluminação é %.2f W\n", areaComodo, potenciaInluminacao);
        
        in.close();
    } 
}
