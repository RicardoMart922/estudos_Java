/*
6 - Faça um programa que receba dois números e execute uma das operações 
listadas a seguir, de acordo com aescolha do usuário. Se for digitada uma opção 
inválida, mostre mensagem de erro e termine a execução do programa. 
As opções são: 
a) O primeiro número elevado ao segundo número. 
b) Raiz quadrada de cada um dos números. 
c) Raiz cúbica de cada um dos números. 
 */
package exercicio.estrutura.condional;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double numero1 = 0.00, numero2 = 0.00, potencia = 0, raizQuadrada = 0, raizCubica = 0;
        int opcao = 0;
        
        System.out.printf("1º número: ");
        numero1 = in.nextDouble();
        
        System.out.printf("2º número: ");
        numero2 = in.nextDouble();
        
        System.out.printf("1 - Potência\n");
        System.out.printf("2 - Raiz quadrada\n");
        System.out.printf("3 - Raiz cúbica\n");
        
        System.out.printf("Opção: ");
        opcao = in.nextInt();
        
        switch (opcao) {
            case 1:
                potencia = pow(numero1, numero2);
                System.out.printf("%.2f^%.2f = %.2f\n", numero1, numero2, potencia);
                break;
            case 2:
                raizQuadrada = sqrt(numero1);
                System.out.printf("Raiz quadrada de %.2f = %.2f\n", numero1, raizQuadrada);
                raizQuadrada = sqrt(numero2);
                System.out.printf("Raiz quadrada de %.2f = %.2f\n", numero2, raizQuadrada);                
                break;
            case 3:    
                raizCubica = pow(numero1, 0.3333333);
                System.out.printf("Raiz cúbica de %.2f = %.2f\n", numero1, raizCubica);
                raizCubica = pow(numero2, 0.3333333);
                System.out.printf("Raiz cúbica de %.2f = %.2f\n", numero2, raizCubica);
                break;
            default:
                System.out.printf("Opção inválida!\n");
                break;
        }
        
        in.close();
    }
    
}
