/*
Fazer um programa para ler os dados de N Clientes (N fornecido pelo usuário) de 
acordo com o modelo abaixo. Ao final, imprimir os dados destes clientes na mesma
ordem em que foram digitados.
 */
package avaliacao;

import java.util.Scanner;

public class Main {
    
    @SuppressWarnings("null")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numeroCliente = 0, cpfCliente = 0, cnpjCliente = 0, telefoneCliente = 0, i = 0;
        String nomeCliente, enderecoCliente;
        
        PessoaFisica pessoaFisica = null;
        PessoaJuridica pessoaJuridica = null;
        
        do {
            System.out.printf("Entre com o número de clientes: ");
            numeroCliente = in.nextInt();
            
            if (numeroCliente < 0) {
                System.out.printf("Erro! Número inválido.\n");
            } else if (numeroCliente == 0) {
                System.out.printf("Nenhum cliente!\n");
            }
            
        } while (numeroCliente < 0);
        
        String [] sequenciaClientes = new String[numeroCliente];
        
        while (i < numeroCliente) {
            System.out.printf("Cliente %d:\n", i+1);
            
            System.out.printf("Pessoa Física ou Jurídica (f/j)? ");
            sequenciaClientes[i] = in.next();
            in.nextLine();
            
            switch (sequenciaClientes[i]) {
                case "f":
                    System.out.printf("Nome: ");
                    nomeCliente = in.next();
                    in.nextLine();
                    
                    System.out.printf("CPF: ");
                    cpfCliente = in.nextInt();
                    
                    System.out.printf("Endereco: ");
                    enderecoCliente = in.next();
                    in.nextLine();
                    
                    System.out.printf("Telefone: ");
                    telefoneCliente = in.nextInt();
                    
                    pessoaFisica = new PessoaFisica(nomeCliente, cpfCliente, enderecoCliente, telefoneCliente);
                    break;
                case "j":
                    System.out.printf("Nome: ");
                    nomeCliente = in.next();
                    in.nextLine();
                    
                    System.out.printf("CNPJ: ");
                    cnpjCliente = in.nextInt();
                    
                    System.out.printf("Endereco: ");
                    enderecoCliente = in.next();
                    in.nextLine();
                    
                    System.out.printf("Telefone: ");
                    telefoneCliente = in.nextInt();
                    
                    pessoaJuridica = new PessoaJuridica(nomeCliente, cnpjCliente, enderecoCliente, telefoneCliente);
                    break;
                default:
                    System.out.printf("Opção inválida!\n");
                    break;
            }
            
            i++;
            
            if (i == numeroCliente) {
                for (int j = 0; j < numeroCliente; j++) {
                    System.out.printf("Cliente %d:\n", j+1);
                    switch (sequenciaClientes[j]) {
                        case "f":
                            System.out.println(pessoaFisica.imprimirDados());
                            break;
                        case "j":
                            System.out.println(pessoaJuridica.imprimirDados());
                            break;
                    }
                }
            }
        }

        in.close();
    }
    
}
