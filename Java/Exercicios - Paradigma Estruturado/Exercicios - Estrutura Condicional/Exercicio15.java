/*
15 - Uma agência bancária possui dois tipos de investimentos, conforme o quadro 
a seguir. Faça um programa que receba o tipo de investimento e seu valor, 
calcule e mostre o valor corrigido após um mês de investimento, de acordo com 
o tipo de investimento.
TIPO           DESCRIÇÃO                RENDIMENTO MENSAL
 1              Poupança                       3%
 2              Fundos de renda fixa           4%
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double valorInvestimento = 0.00, valorCorrigido = 0.00;
        int tipoInvestimento = 0;
        
        System.out.printf("Valor do investimento: R$");
        valorInvestimento = in.nextDouble();
        
        System.out.printf("Escolha o tipo do investimento\n");
        System.out.printf("=-=-=- 1 - Poupança <<>> 2 - Fundos de renda fixa -=-=-=\n");
        System.out.printf("Escolha: ");
        tipoInvestimento = in.nextInt();
        
        switch (tipoInvestimento) {
            case 1: 
                valorCorrigido = valorInvestimento + (valorInvestimento * 0.03);
                System.out.printf("Após um mês no investimento da poupança, o valor corrigido é R$%.2f\n", valorCorrigido);
                break;
            case 2:
                valorCorrigido = valorInvestimento + (valorInvestimento * 0.04);
                System.out.printf("Após um mês no investimento do fundo de renda fixa, o valor corrigido é R$%.2f\n", valorCorrigido);
                break;
            default:
                System.out.printf("Tipo de investimento inválido!\n");
                break;
        }
        
        in.close();
    }
    
}
