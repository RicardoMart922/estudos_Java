/*
19 - Faça um programa que receba a altura e o sexo de uma pessoa e calcule e 
mostre seu peso ideal, utilizando as seguintes fórmulas (onde h é a altura):
■ para homens: (72.7 * h) – 58.
■ para mulheres: (62.1 * h) – 44.7. 
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double altura = 0.00, pesoIdeal = 0.00;
        String sexo;
        
        System.out.printf("Sexo: ");
        sexo = in.nextLine();
        
        System.out.printf("Altura: ");
        altura = in.nextDouble();
        
        if ("Masculino".equals(sexo) || "masculino".equals(sexo) || "M".equals(sexo) || "m".equals(sexo)) {
            pesoIdeal = (72.7 * altura) - 58.0;
            System.out.printf("O peso ideal para esse homem é %.2f kg\n", pesoIdeal);
        } else if ("Feminino".equals(sexo) || "feminino".equals(sexo) || "F".equals(sexo) || "f".equals(sexo)) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("O peso ideal para essa mulher é %.2f kg\n", pesoIdeal);
        }
        
        in.close();
    }
    
}
