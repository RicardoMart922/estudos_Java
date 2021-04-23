/*
24 - Faça um programa que receba a quantidade de dinheiro em reais que uma 
pessoa que vai viajar possui. Ela vai passar por vários países e precisa 
converter seu dinheiro em dólares, marco alemão e libra esterlina. Sabe-se que 
a cotação do dólar é de R$ 1,80; do marco alemão, de R$ 2,00; e da libra 
esterlina, de R$ 3,57. O programa deve fazer as conversões e mostrá-las. 
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double reais = 0.00, dolar = 0.00, marcoAlemao = 0.00, libraEsterlina = 0.00;
        
        System.out.printf("Digite o valor da quantia em reais; R$");
        reais = in.nextDouble();
        
        dolar = reais / 1.8;
        
        marcoAlemao = reais / 2.0;
        
        libraEsterlina = reais / 3.57;
        
        System.out.printf("%.2f convertido em dólar = %.2f\n", reais, dolar);
        System.out.printf("%.2f convertido em marco alemão = %.2f\n", reais, marcoAlemao);
        System.out.printf("%.2f convertido em libra esterlina = %.2f\n", reais, libraEsterlina);
        
        in.close();
    }     
}
