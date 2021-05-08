/*
5 - Faça um programa que receba dois números e execute as operações listadas a 
seguir, de acordo com a escolha do usuário.
        Escolha do usuário              Operação
            1                           Média entre os números digitados
            2                           Diferença do maior pelo menor
            3                           Produto entre os números digitados
            4                           Divisão do primeiro pelo segundo
Se a opção digitada for inválida, mostre uma mensagem de erro e termine a 
execução do programa. Lembre-se de que, na operação 4, o segundo número deve 
ser diferente de zero.
 */
package exercicio.estrutura.condional;

import static java.lang.System.exit;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double numero1 = 0.00, numero2 = 0.00, resultado = 0.00;
        int opcao = 0;
        
        System.out.printf("1º número: ");
        numero1 = in.nextDouble();
        
        System.out.printf("2º número: ");
        numero2 = in.nextDouble();
        
        if (numero2 == 0.0) {
            System.out.printf("O 2º número não pode ser igual a zero!\n");
            exit(1);
        }
        
        
        System.out.printf("1 - Média\n");
        System.out.printf("2 - Diferença\n");
        System.out.printf("3 - Produto\n");
        System.out.printf("4 - Divisão\n");
        
        System.out.printf("Opção: ");
        opcao = in.nextInt();
        
        switch (opcao) {
            case 1:
                resultado = (numero1 + numero2) / 2;
                System.out.printf("Média: %.2f\n", resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.printf("Diferença: %.2f\n", resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.printf("Produto: %.2f\n", resultado);
                break;
            case 4:
                resultado = numero1 / numero2;
                System.out.printf("Divisão: %.2f\n", resultado);
                break;
            default:
                System.out.printf("Opção inválida!\n");
                break;
        }
        
        in.close();
    }
}
