/*
17 - Faça um programa que receba o raio, calcule e mostre: 
a) o comprimento de uma esfera;
b) a área de uma esfera;
c) o volume de uma esfera.
 */
package exercicio.estrutura.sequencial;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import java.util.Scanner;

public class Exercicio17 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double raio = 0.00, comprimentoEsfera = 0.00, areaEsfera = 0.00, volumeEsfera = 0.00;
        
        System.out.printf("Digite o valor do raio: ");
        raio = in.nextDouble();
        
        // a) o comprimento de uma esfera;
        comprimentoEsfera = 2 * PI * raio;
        System.out.printf("O comprimento da esfera vale %.2f m\n", comprimentoEsfera);
        
        // b) a área de uma esfera;
        areaEsfera = PI * pow(raio, 2);
        System.out.printf("A área da esfera vale %.2f m²\n", areaEsfera);
        
        // c) o volume de uma esfera.
        volumeEsfera = 3/4 * (PI * pow(raio, 3));
        System.out.printf("O volume da esfera vale %.2f m³\n", volumeEsfera);
 
        in.close();
    }    
}
