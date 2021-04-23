/*
21 - Faça um programa que receba o número de horas trabalhadas, o valor do 
salário mínimo e o número de horas extras trabalhadas, calcule e mostre o 
salário a receber, de acordo com as regras a seguir: 
a) a hora trabalhada vale 1/8 do salário mínimo; 
b) a hora extra vale 1/4 do salário mínimo;
c) o salário bruto equivale ao número de horas trabalhadas multiplicado pelo 
valor da hora trabalhada; 
d) a quantia a receber pelas horas extras equivale ao número de horas extras 
trabalhadas multiplicado pelo valor da hora extra; 
e) o salário a receber equivale ao salário bruto mais a quantia a receber pelas 
horas extras.
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numeroHorasTrabalhadas = 0, numeroHorasExtras = 0;
        double salarioMinimo = 0.00, salarioBruto = 0.00, salarioReceber = 0.00, valorHoraExtra = 0.00, valorHoraTrabalhada = 0.00;
        
        System.out.printf("Digite o valor do salário mínimo: R$");
        salarioMinimo = in.nextDouble();
        
        System.out.printf("Digite o número de horas trabalhadas: ");
        numeroHorasTrabalhadas = in.nextInt();
        
        System.out.printf("Digite o número de horas extras trabalhadas: ");
        numeroHorasExtras = in.nextInt();
        
        valorHoraTrabalhada = salarioMinimo / 8;
        valorHoraExtra = numeroHorasExtras * salarioMinimo / 4;
        
        salarioBruto = numeroHorasTrabalhadas * valorHoraTrabalhada;
        
        salarioReceber = salarioBruto + valorHoraExtra;
        
        System.out.printf("O salário a receber é R$%.2f\n", salarioReceber);
        
        in.close();
    }     
}
