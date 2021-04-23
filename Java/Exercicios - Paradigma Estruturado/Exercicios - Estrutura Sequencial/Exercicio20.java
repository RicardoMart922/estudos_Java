/*
20 - Faça um programa que receba a medida do ângulo formado por uma escada 
apoiada no chão e a distância em que a escada está da parede, calcule e mostre 
a medida da escada para que se possa alcançar sua ponta. 
 */
package exercicio.estrutura.sequencial;

import static java.lang.Math.cos;
import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double angulo = 0.00, distancia = 0.00, tamanhoEscada = 0.00;
        
        System.out.printf("Digite o valor do ângulo: ");
        angulo = in.nextDouble();
        
        System.out.printf("Digite o valor da distância em que a escada está da parede: ");
        distancia = in.nextDouble();
        
        tamanhoEscada = distancia / cos(angulo);
        
        System.out.printf("O tamanho da escada é %.2f m\n", tamanhoEscada);

        in.close();
    } 
}
