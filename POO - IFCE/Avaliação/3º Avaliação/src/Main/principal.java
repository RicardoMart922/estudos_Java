package Main;

import Entities.CarroNovo;
import Entities.CarroUsado;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Digite o número de carros: ");
        int numeroCarros = in.nextInt();

        CarroNovo[] vetorCarroNovo = new CarroNovo[numeroCarros];
        CarroUsado[] vetorCarroUsado = new CarroUsado[numeroCarros];

        char [] sequenciaCarro = new char[numeroCarros];

        for (int i = 0; i < numeroCarros; i++) {
            System.out.printf("Carro %d\n", i+1);

            System.out.printf("Carro novo ou usado(n/u): ");
            sequenciaCarro[i] = in.next().charAt(0);

            System.out.printf("Modelo: ");
            in.nextLine();
            String modeloCarro = in.nextLine();

            System.out.printf("Marca: ");
            String marcaCarro = in.nextLine();

            System.out.printf("Preço: R$");
            double precoCarro = in.nextDouble();

            if (sequenciaCarro[i] == 'n') {
                vetorCarroNovo[i] = new CarroNovo(marcaCarro, modeloCarro, precoCarro);
            } else if (sequenciaCarro[i] == 'u') {
                System.out.printf("Desconto: ");
                double descontoCarro = in.nextDouble();
                vetorCarroUsado[i] = new CarroUsado(marcaCarro, modeloCarro, precoCarro, descontoCarro);
            } else {
                System.out.printf("Opção inválida!\n");
            }
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        int j = 0;
        for(CarroNovo carro: vetorCarroNovo) {
            if (sequenciaCarro[j] == 'n') {
                System.out.println(vetorCarroNovo[j].imprimirDadosCarro());
                System.out.println();
            } else if(sequenciaCarro[j] == 'u') {
                System.out.println(vetorCarroUsado[j].imprimirDadosCarro());
                System.out.println();
            }
            j++;
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        in.close();
    }
}