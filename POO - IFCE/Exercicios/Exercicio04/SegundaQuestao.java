/*
* 2 - Foi feita uma pesquisa entre os habitantes de uma cidade. Foram coletados 
* os dados de idade, sexo (M/F) e salário. Faça um programa que calcule e 
* mostre:
* a) A média dos salários do grupo;
* b) A maior e a menor idade do grupo;
* c) A quantidade de mulheres na cidade;
* d) A idade e o sexo da pessoa que possui o menor salário;
* Finalize a entrada de dados ao ser digitada uma idade igual a zero.
*/

package exercicio04;

import java.util.Scanner;

public class SegundaQuestao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salario = 0.0f, mediaSalario = 0.0f, menorSalario = 0.0f;
        int idade = 0, maiorIdade = 0, menorIdade = 0, qtdMulheres = 0;
        int qtdGrupo = 0, i = 1, j = 1, idadeMenorSal = 0;
        String sexo, sexoMenorSal = null;
        
        do {
            System.out.print("Idade: ");
            idade = sc.nextInt();
            if (idade == 0) {
                break;
            }
            sc.nextLine();
            System.out.print("Sexo [F/M]: ");
            sexo = sc.nextLine();
            System.out.print("Salário: R$");
            salario = sc.nextFloat();
            qtdGrupo += 1;
            // Quantidade de mulheres da cidade
            if ("F".equals(sexo)) { 
                qtdMulheres += 1;
            }
            // Idade e sexo da pessoa com menor salário
            if (j == 1) {
                menorSalario = salario;
                idadeMenorSal = idade;
                sexoMenorSal = sexo;
                j += 1;
            } else {
                if (salario < menorSalario) {
                    menorSalario = salario;
                    idadeMenorSal = idade;
                    sexoMenorSal = sexo;
                }
            }
            // Média salarial do grupo
            mediaSalario += salario;
            // Maior e menor idade
            if (i == 1) {
                maiorIdade = idade;
                menorIdade = idade;
                i += 1;
            } else {
                if (idade > maiorIdade) {
                    maiorIdade = idade;
                } else if (idade < menorIdade) {
                    menorIdade = idade;
                }
            }
        } while (idade != 0);
        
        System.out.printf("A média dos salários do grupo é R$%.2f \n", (mediaSalario/qtdGrupo));
        System.out.printf("A maior idade do grupo é %d \n", maiorIdade);
        System.out.printf("A menor idade do grupo é %d \n", menorIdade);
        System.out.printf("A quantidade de mulheres da cidade é %d \n", qtdMulheres);
        System.out.printf("A idade e o sexo da pessoa que possui o menor salário é ");
        System.out.printf("respectivamente %d anos e do sexo %s \n", idadeMenorSal, sexoMenorSal);
        sc.close();
    }
    
}
