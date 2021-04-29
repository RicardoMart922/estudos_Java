/*
* Elabore um programa que corrija provas de múltipla escolha. Cada prova tem 10 
* questões e cada questão vale 1 ponto. A primeira informação a ser lida é o 
* gabarito da prova, em seguida deve ser lido o número do aluno e suas respostas. 
* Existem 10 alunos matriculados nessa turma. Calcule e mostre:
* a) O número de cada aluno e sua respectiva nota;
* b) A percentagem de aprovação de alunos na prova considerando a nota mínima 6.0;
* Observação: o gabarito e resposta dos alunos são vetores do tipo char;
*/
package avaliação;

import java.util.Scanner;

public class Avaliacao {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int m = 0, n = 1, x = 1, acerto = 0, qtdAprovado = 0;
        char [] gabarito = new char[10];
        char [] resAluno = new char[10];
        double [][] nota = new double[2][10];
        
        System.out.println("Gabarito da prova!");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Resposta da %dº Questão: ", n);
            gabarito[i] = in.nextLine().charAt(0);
            n++;
        }
        
        System.out.println();
        System.out.println("Resposta do aluno!");
        
        while (x < 11) {
            n = 1;
            System.out.printf("\nResposta do %dº aluno(a): \n\n", x);
            for (int j = 0; j < 10; j++) {
                System.out.printf("Resposta da %dº Questão: ", n);
                resAluno[j] = in.nextLine().charAt(0);
                if (gabarito[j] == resAluno[j]) {
                    acerto++;
                }
                n++;
            }
            nota[0][m] = x;
            nota[1][m] = acerto;
            acerto = 0;
            m++;
            x++;
        }
        
        // a) O número de cada aluno e sua respectiva nota;
        for (int l = 0; l < 1; l++) {
            for (int c = 0; c < 10; c++) {
                System.out.printf("Nº -> %.0f | Nota -> %.2f\n", nota[0][c], nota[1][c]);
                if (nota[1][c] >= 6.0) {
                    qtdAprovado++;
                }
            }
        }
        
        // b) A percentagem de aprovação de alunos na prova considerando a nota mínima 6.0;
        System.out.printf("A porcentagem aprovação dos alunos nessa prova foi %d0%%\n", qtdAprovado);
    }
    
}