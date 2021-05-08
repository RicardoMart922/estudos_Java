/*
Fazer um programa para ler os dados de N imóveis (N fornecido pelo usuário). Ao final,
mostrar o nome e valor de cada imóvel na mesma ordem em que foram digitados.
Todo imóvel possui nome e preço. Imóveis usados possuem um desconto. Para
imóveis usados, o desconto deve ser subtraído do preço final do imóvel usado.
 */
package exercicio08;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
            
       int numeroImoveis = 0, i = 0;
       String nomeImovel, tipoImovel;
       double precoImovel = 0.00, desconto = 0.00;
       
       Imovel imovelNovo = null;
       Imovel imovelUsado = null;
               
        System.out.printf("Entre com o número de imóveis: ");
        numeroImoveis = in.nextInt();
        
        String [] sequenciaImoveis = new String[numeroImoveis];
        
        while (i < numeroImoveis) {
            System.out.printf("Imóvel %d:\n", i+1);
            
            System.out.printf("Novo ou usado(n/u): ");
            sequenciaImoveis[i] = in.next();
            in.nextLine();
            
            switch (sequenciaImoveis[i]) {
                case "n":
                    System.out.printf("Nome: ");
                    nomeImovel = in.next();
                    in.nextLine();
                    
                    System.out.printf("Preço: R$");
                    precoImovel = in.nextDouble();
                    
                    imovelNovo = new ImovelNovo(nomeImovel, precoImovel);
                    break;
                case "u":
                    System.out.printf("Nome: ");
                    nomeImovel = in.next();
                    in.nextLine();
                    
                    System.out.printf("Preço: R$");
                    precoImovel = in.nextDouble();
                    
                    System.out.printf("Desconto: R$");
                    desconto = in.nextDouble();
                    
                    imovelUsado = new ImovelUsado(nomeImovel, precoImovel, desconto);
                    break;
                default:
                    System.out.printf("Opção inválida!\n");
                    break;
            }
            
            i++;
            
            if (i == numeroImoveis) {
                for (int j = 0; j < numeroImoveis; j++) {
		    if (j == 0) {
                        System.out.println();
                        System.out.printf("Valor dos Imóveis:\n");
                    }
                    
                    switch (sequenciaImoveis[j]) {
                        case "n":
                            System.out.println(imovelNovo.valorImovel());
                            break;
                        case "u":
                            System.out.println(imovelUsado.valorImovel());
                            break;
                    }
                }
            }
        }
        in.close();
    }
    
}
