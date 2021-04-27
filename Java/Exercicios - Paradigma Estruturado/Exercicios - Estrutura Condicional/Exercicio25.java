/*
25 - Uma empresa decidiu dar uma gratificação de Natal a seus funcionários, 
baseada no número de horas extras e no número de horas que o funcionário faltou 
ao trabalho. O valor do prêmio é obtido pela consulta à tabela que se segue, 
na qual:

H = número de horas extras – (2/3 * (número de horas falta))

H (MINUTOS)            PRÊMIO (R$)
  >= 2.400                500,00
1.800 *---º 2.400         400,00
1.200 *---º 1.800         300,00
  600 *---º 1.200         200,00
< 600                     100,00
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double numeroHorasTotais = 0.00, valorPremio = 0.00;
        double numeroHorasExtras = 0.00, numeroHorasFalta = 0.00;
        
        System.out.printf("Número de horas extras (em minutos): ");
        numeroHorasExtras = in.nextDouble();
        
        System.out.printf("Número de horas que o funcionário faltou (em minutos): ");
        numeroHorasFalta = in.nextDouble();
        
        numeroHorasTotais = numeroHorasExtras - (0.666666 * numeroHorasFalta);
        
        if (numeroHorasTotais < 600.00) {
            valorPremio = 100.00;
        } else if (numeroHorasTotais >= 600.00 && numeroHorasTotais < 1200.00) {
            valorPremio = 200.00;
        } else if (numeroHorasTotais >= 1200.00 && numeroHorasTotais < 1800.00) {
            valorPremio = 300.00;
        } else if (numeroHorasTotais >= 1800&& numeroHorasTotais < 2400.00) {
            valorPremio = 400.00;
        } else {
            valorPremio = 500.00;
        }
        
        System.out.printf("O número totais de horas é: %.2f\n", numeroHorasTotais);
        System.out.printf("O prêmio do funcionário é R$%.2f\n",  valorPremio);
        
        in.close();
    }
    
}
