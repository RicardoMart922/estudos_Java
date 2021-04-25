/*
9 - Um banco concederá um crédito especial aos seus clientes, de acordo com o 
saldo médio no último ano. Faça um programa que receba o saldo médio de um 
cliente e calcule o valor do crédito, de acordo com a tabela a seguir. Mostre 
o saldo médio e o valor do crédito.
Saldo Médio                  Percentual
Acima de R$ 400,00               30% do saldo médio
R$ 400,00 *-----º R$ 300,00      25% do saldo médio
R$ 300,00 *-----º R$ 200,00      20% do saldo médio
Até R$ 200,00                    10% do saldo médio
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double saldoMedio = 0.00, credito = 0.00;
        
        System.out.printf("Saldo médio: R$");
        saldoMedio = in.nextDouble();
        
        if (saldoMedio > 400.00) {
            credito = (saldoMedio * 0.3);
        } else if (saldoMedio <= 400.00 && saldoMedio > 300.00) {
            credito = (saldoMedio * 0.25);
        } else if (saldoMedio <= 300.00 && saldoMedio > 200.00) {
            credito = (saldoMedio * 0.2);
        } else if (saldoMedio <= 200.00) {
            credito = (saldoMedio * 0.1);
        }
        
        System.out.printf("Saldo médio = R$%.2f\n", saldoMedio);
        System.out.printf("Crédito = R$%.2f\n", credito);
        
        in.close();
    }
    
}
