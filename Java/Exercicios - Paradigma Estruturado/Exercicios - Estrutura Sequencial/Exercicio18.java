/*
18 - Faça um programa que receba uma temperatura em Celsius, calcule e mostre 
essa temperatura em Fahrenheit. Sabe-se que F = 1.8 * C + 32. 
 */
package exercicio.estrutura.sequencial;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double temperaturaCelsius = 0.00, temperaturaFahrenheit = 0.00;
        
        System.out.printf("Digite o valor da temperatura em Celsius: ");
        temperaturaCelsius = in.nextDouble();
        
        temperaturaFahrenheit = 1.8 * temperaturaCelsius + 32;
        
        System.out.printf("A temperatura em Fahrenheit é %.2f ºF\n", temperaturaFahrenheit);
        
        in.close();
    }     
}
