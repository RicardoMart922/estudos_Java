/*
Faça um programa que leia cinco grupos de quatro valores (A,B, C, D) e mostre-os na ordem lida.
 */
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double valor1 = 0.00, valor2 = 0.00, valor3 = 0.00, valor4 = 0.00;
  
        for (int i = 0; i < 5; i++) {
            System.out.printf("%dº GRUPO\n");

            System.out.printf("1º valor: ");
            valor1 = in.nextDouble();

            System.out.printf("2º valor: ");
            valor2 = in.nextDouble();

            System.out.printf("3º valor: ");
            valor3 = in.nextDouble();

            System.out.printf("4º valor: ");
            valor4 = in.nextDouble();

            System.out.printf("Forma lida:\n");
            System.out.printf("%.2f , %.2f , %.2f , %.2f\n", valor1, valor2, valor3, valor4);
        }

        in.close();
    }
}
