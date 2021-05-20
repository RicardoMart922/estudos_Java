import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Funcionario;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Funcionario> funcionario = new ArrayList<>();

        int idFuncionario = 0, id = 0, indice = 0, numeroFuncionario = 0, posicao = 0;
        String nomeFuncionario;
        double salarioFuncionario = 0.00, porcentagem = 0.00;

        do {
            System.out.printf("Quantos funcionários serão registrados? ");
            numeroFuncionario = in.nextInt();

            if (numeroFuncionario < 0) {
                System.out.printf("Número inválido!\n");
            }
        } while (numeroFuncionario < 0);

        for (int i = 0; i < numeroFuncionario; i++) {
            System.out.printf("Funcionário #%d:\n", i+1);
            do {
                System.out.printf("ID: ");
                idFuncionario = in.nextInt();

                if (idFuncionario <= 0) {
                    System.out.printf("Id inválido!\n");
                }

                if (i != 0) {
                    do {
                        for (Funcionario func : funcionario) {
                            if (func.getId() == idFuncionario) {
                                id = func.getId();
                                System.out.printf("ID: ");
                                idFuncionario = in.nextInt();
                            }
                        }
                    } while (id == idFuncionario);
                }
            } while (idFuncionario <= 0);

            System.out.printf("Nome: ");
            nomeFuncionario = in.next();
            in.nextLine();

            do {
                System.out.printf("Salário: R$");
                salarioFuncionario = in.nextDouble();

                if (salarioFuncionario < 0.00) {
                    System.out.printf("Salário inválido!\n");
                }
            } while (salarioFuncionario < 0.00);

            funcionario.add(new Funcionario(idFuncionario, nomeFuncionario, salarioFuncionario));
        }

        System.out.printf("Digite o id do funcionário que terá aumento de salário: ");
        indice = in.nextInt();

        for (Funcionario func: funcionario) {
            if (func.getId() == indice) {
                System.out.printf("Entre com a porcentagem: ");
                porcentagem = in.nextDouble();
                func.aumentoSalario(porcentagem);
            } else {
                if (posicao == funcionario.size()) {
                    System.out.printf("O id não existe!\n");
                }
            }
            posicao++;
        }

        System.out.printf("\nLista de funcionários \n");

        for (Funcionario func: funcionario) {
            System.out.println(func.listaFuncionario());
        }

        in.close();
    }

}