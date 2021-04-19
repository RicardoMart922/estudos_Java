package exercicio03;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        int n = 0;
        String nome;
        double preco;
        
        Scanner in = new Scanner(System.in);
        
        do {
            System.out.printf("Digite um número: ");
            n = in.nextInt();
            if (n < 0) {
                System.out.println("Número inválido.");
            }
        } while (n < 0);
        
        Produto [] vetorP = new Produto[n];
        
        for(int i = 0; i < n; i++) {
            in.nextLine();
            System.out.printf("Digite o nome do %dº produto: ", i+1);
            nome = in.nextLine();
            do{
                System.out.printf("Digite o preço do %dº produto: R$", i+1);
                preco = in.nextDouble();
                if (preco < 0) {
                    System.out.printf("Preço inválido.");
                }
            } while(preco < 0);
            
            vetorP[i] = new Produto(nome, preco);
        }
        
        double soma = 0.0;
        for (Produto p : vetorP) {
            soma = soma + p.getPreco();
        }
            
        double media = soma / n;
            
        System.out.printf("A média dos preços é: R$%.2f\n", media);
        
        in.close();
    }
    
}
