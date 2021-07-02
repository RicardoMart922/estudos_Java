package Main;

import Entidades.ContaCorrente;
import Entidades.ContaPoupanca;
import Entidades.Titular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Titular> titularList = new ArrayList<>();

        ContaPoupanca contaPoupanca = null;
        ContaCorrente contaCorrente = null;

        int idTitular;
        String nome;
        char tipo;

        System.out.printf("Digite o número de titulates: ");
        int numeroTitulates = in.nextInt();

        for (int i = 1; i <= numeroTitulates; i++) {

            System.out.println(i + "º Titular");
            System.out.printf("Informe o id: ");
            idTitular = in.nextInt();

            System.out.printf("Informe o nome: ");
            nome = in.next();
            in.nextLine();

            System.out.println("Informe o tipo de conta. \n[c] Conta Corrente <-> [p] Conta Poupança ");
            System.out.printf("Tipo: ");
            tipo = in.next().charAt(0);

            do {
                if (tipo == 'c') {
                    System.out.printf("Informe o número da conta: ");
                    int numeroConta = in.nextInt();

                    System.out.printf("Informe o saldo: R$");
                    double saldoConta = in.nextDouble();

                    contaCorrente = new ContaCorrente(numeroConta, saldoConta);
                } else if (tipo == 'p') {
                    System.out.printf("Informe o número da conta: ");
                    int numeroConta = in.nextInt();

                    System.out.printf("Informe o saldo: R$");
                    double saldoConta = in.nextDouble();

                    System.out.printf("Informe a taxa de juros: ");
                    double taxaJuros = in.nextDouble();

                    contaPoupanca = new ContaPoupanca(numeroConta, saldoConta, taxaJuros);
                } else {
                    System.out.println("Tipo inválido!");
                }

            } while (tipo == 'c' && tipo == 'p');

            switch (tipo) {
                case 'c':
                    titularList.add(new Titular(idTitular, nome, contaCorrente));
                break;
                case 'p':
                    titularList.add(new Titular(idTitular, nome, contaPoupanca));
                break;
            default:
                System.out.println("Tipo inválido!");
            }
        }

        System.out.println();

        for (Titular titular : titularList) {
            System.out.println(titular.imprimir());
        }

        in.close();
    }

}
