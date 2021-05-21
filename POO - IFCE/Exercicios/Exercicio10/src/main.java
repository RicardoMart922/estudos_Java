import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        int opcao;
        double valorA = 0.00, valorB = 0.00;

        System.out.println("Escolha a operação: ");
        System.out.println("(1)Adição        -=- (2)Subtração");
        System.out.println("(3)Multiplicação -=- (4)Divisaão");
        System.out.println("(5)Raiz Quadrada -=- (6)Potência");
        opcao = in.nextInt();

        if (opcao == 1) {
            System.out.printf("Informe o 1º valor: ");
            valorA = in.nextDouble();
            System.out.printf("Informe o 2º valor: ");
            valorB = in.nextDouble();

            System.out.println(calculadora.soma(valorA, valorB));
        } else if (opcao == 2) {
            System.out.printf("Informe o 1º valor: ");
            valorA = in.nextDouble();
            System.out.printf("Informe o 2º valor: ");
            valorB = in.nextDouble();

            System.out.println(calculadora.subtracao(valorA, valorB));
        } else if (opcao == 3) {
            System.out.printf("Informe o 1º valor: ");
            valorA = in.nextDouble();
            System.out.printf("Informe o 2º valor: ");
            valorB = in.nextDouble();

            System.out.println(calculadora.multiplicacao(valorA, valorB));
        } else if (opcao == 4) {
            System.out.printf("Informe o 1º valor: ");
            valorA = in.nextDouble();
            System.out.printf("Informe o 2º valor: ");
            valorB = in.nextDouble();

            if (valorB != 0) {
                System.out.println(calculadora.divisao(valorA, valorB));
            } else {
                System.out.printf("Erro! Não é possível dividir por zero.");
            }
        } else if (opcao == 5) {
            System.out.printf("Informe o valor: ");
            valorA = in.nextDouble();

            System.out.println(calculadora.raizQuadrada(valorA));
        } else if (opcao == 6) {
            System.out.printf("Informe o valor da base: ");
            valorA = in.nextDouble();
            System.out.printf("Informe o valor do expoente: ");
            valorB = in.nextDouble();

            System.out.println(calculadora.potencia(valorA, valorB));
        } else {
            System.out.printf("Opção inválida!\n");
        }

        in.close();
    }
}