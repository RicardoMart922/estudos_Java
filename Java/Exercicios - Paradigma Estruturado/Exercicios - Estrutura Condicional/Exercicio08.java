/*
8 - Faça um programa para calcular e mostrar o salário reajustado de um 
funcionário. O percentual de aumento encontra-se na tabela a seguir.
salário            Percentual de Aumento
Até R$ 300,00                 35%
Acima de R$ 300,00            15%
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double salario = 0.00;
        
        System.out.printf("Salário: R$");
        salario = in.nextDouble();
        
        
        if (salario <= 300.00) {
            salario += (salario * 0.35);
            System.out.printf("O novo salário = R$%.2f\n", salario);
        } else {
            salario += (salario * 0.15);
            System.out.printf("O novo salário = R$%.2f\n", salario);
        }
        
        in.close();
    }
    
}
