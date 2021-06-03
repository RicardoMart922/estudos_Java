package Main;

import Entities.ScientificCalculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ScientificCalculator calculator = new ScientificCalculator();

        int opcao = 0;
        double valueA = 0.00, valueB = 0.00;
        do {
            System.out.println("Escolha a operação: ");
            System.out.println("(1)Adição        -=- (2)Subtração");
            System.out.println("(3)Multiplicação -=- (4)Divisão");
            System.out.println("(5)Raiz Quadrada -=- (6)Potência \n(0)Sair");
            opcao = in.nextInt();
            if (opcao == 0) {
                System.out.println("Encerrando os trabalhos...\n");
            } else if (opcao == 1) {
                System.out.printf("Informe o 1º valor: ");
                valueA = in.nextDouble();
                System.out.printf("Informe o 2º valor: ");
                valueB = in.nextDouble();

                System.out.println(calculator.addition(valueA, valueB));
            } else if (opcao == 2) {
                System.out.printf("Informe o 1º valor: ");
                valueA = in.nextDouble();
                System.out.printf("Informe o 2º valor: ");
                valueB = in.nextDouble();

                System.out.println(calculator.subtraction(valueA, valueB));
            } else if (opcao == 3) {
                System.out.printf("Informe o 1º valor: ");
                valueA = in.nextDouble();
                System.out.printf("Informe o 2º valor: ");
                valueB = in.nextDouble();

                System.out.println(calculator.multiplication(valueA, valueB));
            } else if (opcao == 4) {
                System.out.printf("Informe o 1º valor: ");
                valueA = in.nextDouble();
                System.out.printf("Informe o 2º valor: ");
                valueB = in.nextDouble();

                if (valueB != 0) {
                    System.out.println(calculator.division(valueA, valueB));
                } else {
                    System.out.printf("Erro! Não é possível dividir por zero.\n");
                }
            } else if (opcao == 5) {
                System.out.printf("Informe o valor: ");
                valueA = in.nextDouble();
                double result = calculator.squareRoot(valueA);
                if (result == 1) {
                    System.out.printf("Não há raiz de número negativo no conjunto dos reais!\n");
                } else {
                    System.out.println(result);
                }
            } else if (opcao == 6) {
                System.out.printf("Informe o valor da base: ");
                valueA = in.nextDouble();
                System.out.printf("Informe o valor do expoente: ");
                valueB = in.nextDouble();

                System.out.println(calculator.potency(valueA, valueB));
            } else {
                System.out.printf("Opção inválida!\n");
            }
        } while (opcao != 0);

        in.close();
    }
}
