/*
* 1) Crie um programa que declare uma matriz 3 x 3. Em seguida preencha com o 
* número 1 a diagonal principal e com 0 os demais elementos. Escreva ao final 
* a matriz obtida.
*/
package exercicio02;

public class Questao01 {
    public static void main(String[] args) {
        
        int [][] matriz = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.printf("%d | ", matriz[x][y]);
            }
            System.out.println();
        }
    }
}
