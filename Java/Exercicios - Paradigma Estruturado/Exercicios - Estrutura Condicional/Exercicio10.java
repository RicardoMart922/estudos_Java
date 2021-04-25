/*
10 - O preço ao consumidor de um carro novo é a soma do custo de fábrica com a 
porcentagem do distribuidor e dos impostos, ambos aplicados ao custo de 
fábrica. As porcentagens encontram-se na tabela aseguir. Faça um programa que 
receba o custo de fábrica de um carro e mostre o preço ao consumidor.
Custo de Fábrica                     % do distribuidor      % dos impostos
Até R$ 12.000,00                            5                   isento
Entre R$ 12.000,00 e R$ 25.000,00           10                    15
Acima de R$ 25.000,00                       15                    20
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double custoFabrica = 0.00, precoConsumidor = 0.00;
        
        if (custoFabrica >= 12000.00) {
            precoConsumidor = custoFabrica + (custoFabrica * 0.05);
        } else if (custoFabrica > 12000.00 && custoFabrica <= 25000.00) {
            precoConsumidor = custoFabrica + (custoFabrica * 0.1) + (custoFabrica * 0.15);
        } else if (custoFabrica > 25000.00) {
            precoConsumidor = custoFabrica + (custoFabrica * 0.15) + (custoFabrica * 0.2);
        }
        
        System.out.printf("O preço ao consumidor: R$%.2f\n", precoConsumidor);
        
        in.close();
    }
    
}
