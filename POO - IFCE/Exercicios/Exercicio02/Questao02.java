/*
* 2) Faça um programa que leia uma matriz 4 x 4, imprima essa matriz e retorne 
* a localização (linha e a coluna) do maior valor lido.
*/
package exercicio02;

import java.util.Scanner;

public class Questao02 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double [][] matriz = new double[4][4];
        double maior = 0.0;
        int linha = 0, coluna = 0, n = 1;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%dº Elemento: ", n);
                n++;
                matriz[i][j] = in.nextDouble();
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                System.out.printf("%.1f | ", matriz[x][y]);
            }
            System.out.println();
        }
        System.out.printf("Na linha %d e na coluna %d se encontra o maior elemento.", (linha+1), (coluna+1));
    }
    
}
