/*
12 - Faça um programa que receba o salário bruto de um funcionário e, usando a 
tabela a seguir, calcule emostre o valor a receber. Sabe-se que este é composto 
pelo salário bruto acrescido de gratificação e descontado o imposto de 7% sobre
o salário.
           TABELA DAS GRATIFICAÇÕES
SALÁRIO                                 GRATIFICAÇÃO
Até R$ 350,00                           R$ 100,00
R$ 350,00 º----º R$ 600,00              R$ 75,00
R$ 600,00 *----* R$ 900,00              R$ 50,00
Acima de R$ 900,00                      R$ 35,00
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double salarioBruto = 0.00, valorReceber = 0.00;
        
        System.out.printf("Salário bruto: R$");
        salarioBruto = in.nextDouble();
        
        if (salarioBruto <= 300.00) {
            valorReceber = salarioBruto + 100.00 + (salarioBruto * 0.07);
        } else if (salarioBruto > 300.00 && salarioBruto < 600.00) {
            valorReceber = salarioBruto + 75.00 + (salarioBruto * 0.07);
        } else if (salarioBruto >= 600.00 && salarioBruto <= 900.00) {
            valorReceber = salarioBruto + 50.00 + (salarioBruto * 0.07);
        } else {
            valorReceber = salarioBruto + 35.00 + (salarioBruto * 0.07);
        }
        
        System.out.printf("O valor a receber é R$%.2f\n", valorReceber);
        
        in.close();
    }
    
}
