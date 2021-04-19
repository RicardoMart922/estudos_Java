/*
* Elabore um programa que receba o nome de n produtos e seus respectivos preços, armazene-
* os em dois vetores separados, um para os produtos e outro para os preços. O programa deve
*
* calcular e mostrar:
* a) A quantidade de produtos com preço inferior a R$ 40,00;
* b) O nome dos produtos com preço entre R$ 40,00 e R$ 100,00;
* c) A média dos preços dos produtos com preço superior a R$ 100,00.
 */
package exercicio01;

import java.util.Scanner;

public class ExercicioDeFixação {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n = 0, cont = 0, qtd = 0;
        double media = 0.0;
        System.out.print("Digite a quantidade de produtos: ");
        n = in.nextInt();
        in.nextLine();
        
        String [] nome = new String[n];
        double [] preco = new double[n];
        
        for (int i = 0; i < n; i++) { 
            System.out.print("Informe o nome do produto: ");
            nome[i] = in.nextLine();
            
            System.out.print("Informe o preço do produto: R$");
            preco[i] = in.nextDouble();
            in.nextLine();
            
            if (preco[i] < 40.0) {
                cont++;
            }
        }
        // a) A quantidade de produtos com preço inferior a R$ 40,00;
        System.out.printf("Há %d produtos com preço inferior a R$40,00.\n\n", cont);
        
        // b) O nome dos produtos com preço entre R$ 40,00 e R$ 100,00;
        System.out.print("Nome dos produtos com preço entre R$40,00 e R$100,00.\n\n");
        for (int j = 0; j < n; j++) {
            if (preco[j] >= 40.0 && preco[j] <= 100.00) {
                System.out.printf("%s\n", nome[j]);
            }
        }
        
        // c) A média dos preços dos produtos com preço superior a R$ 100,00.
        for (int p = 0; p < n; p++) {
            if (preco[p] > 100.00) {
                media += preco[p];
                qtd++;
            }
        }
        System.out.printf("A média dos preços dos produtos com preço superior a R$100,00 é %.2f.\n", (media/qtd));
    }
    
}