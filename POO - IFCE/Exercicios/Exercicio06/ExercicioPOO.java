/*
Um polígono diz-se regular se tiver todos os seus lados iguais. De acordo com o 
modelo abaixo fazer um programa para instanciar polígonos regulares:
*/
package exercicio06;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int opcao = 0, numeroLados = 0;
        double medidaLado = 0.00;
        
        System.out.printf("Informe o tipo do polígono: \n");
        
        do {
            System.out.printf(">> [1]-QUADRADO <=> [2]-TRIÂNGULO EQUILÁTERO <<\n");
            System.out.printf("Opção: ");
            opcao = in.nextInt();
            if (opcao != 1 && opcao != 2) {
                System.out.printf("ERRO! Opção inválida.\n");
            }
        } while (opcao != 1 && opcao != 2); 
        
        if (opcao == 1) {
            numeroLados = 4;
            
            do {
                System.out.printf("Informe o valor da medida do lado do quadrado: ");
                medidaLado = in.nextDouble();
                if (medidaLado <= 0) {
                    System.out.printf("ERRO! Medida inválida.\n");
                }
            } while (medidaLado <= 0);
            
            Quadrado quadrado = new Quadrado(numeroLados, medidaLado);
            System.out.printf("Área = %.2f m\n", quadrado.calculoArea());
        } else {
            numeroLados = 3;
           
            do {
                System.out.printf("Informe o valor da medida do lado do triângulo equilátero: ");
                medidaLado = in.nextDouble();
                if (medidaLado <= 0) {
                    System.out.printf("ERRO! Medida inválida.\n");
                }
            } while (medidaLado <= 0);
            
            TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(numeroLados, medidaLado);
            System.out.printf("Área = %.2f m\n", trianguloEquilatero.calculoArea());
        }
        
        in.close();
    }
    
}
