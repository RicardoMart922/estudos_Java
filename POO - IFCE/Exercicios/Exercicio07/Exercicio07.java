/*
Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao
final, mostrar a etiqueta de preço de cada produto na mesma ordem em que foram
digitados.
Todo produto possui nome e preço. Produtos importados possuem uma taxa de
alfândega. Para produtos importados, a taxa e alfândega deve ser acrescentada ao
preço final do produto.
 */
package exercicio07;

import java.util.Scanner;

public class Exercicio07 {

    @SuppressWarnings("null")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numeroProduto = 0, i = 0; 
        String nomeProduto; 
        
        double precoProduto = 0.00, taxaAlfandega = 0.00;
        
        Produto produtoComum = null;
        ProdutoImportado produtoImportado = null;
        
        System.out.printf("Entre com o número de produtos: ");
        numeroProduto = in.nextInt();
        
        String [] sequencia = new String[numeroProduto];
        
        while (i < numeroProduto) {
            System.out.printf("Produto %d:\n", i+1);
            System.out.printf("Comum ou importado (c/i)? ");

            sequencia[i] = in.next();
            in.nextLine();

            switch (sequencia[i]) {
                case "i":
                    System.out.printf("Nome: ");
                    nomeProduto = in.next();
                    in.nextLine();  
                
                    System.out.printf("Preço: R$");
                    precoProduto = in.nextDouble();
                    
                    System.out.printf("Taxa da alfândega: R$");
                    taxaAlfandega = in.nextDouble();
                
                    produtoImportado = new ProdutoImportado(nomeProduto, precoProduto, taxaAlfandega);
                    break;
                case "c":
                    System.out.printf("Nome: ");
                    nomeProduto = in.next();
                    in.nextLine();

                    System.out.printf("Preço: R$");
                    precoProduto = in.nextDouble();

                    produtoComum = new Produto(nomeProduto, precoProduto);
                    break;
                default:
                    System.out.printf("Escolha inválida!\n");
                    break;
            }
            
            i++;
            
            if (i == numeroProduto) {
                for (int j = 0; j < numeroProduto; j++) {
                    if (j == 0) {
                        System.out.println("Etiqueta de preços:");
                    }
                    switch (sequencia[j]) {
                        case "i":
                            System.out.println(produtoImportado.etiquetaPrecos());
                            break;
                        case "c":
                            System.out.println(produtoComum.etiquetaPrecos());
                            break;
                    }
                }
            }
        }
        
        in.close();
    } 
    
}
