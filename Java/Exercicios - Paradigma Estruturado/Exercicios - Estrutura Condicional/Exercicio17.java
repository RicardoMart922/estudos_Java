/*
17 - Faça um programa que verifique a validade de uma senha fornecida pelo 
usuário. A senha é 4531. O programa deve mostrar uma mensagem de permissão de 
acesso ou não.
 */
package exercicio.estrutura.condional;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int senha = 0;
        
        System.out.printf("Senha: ");
        senha = in.nextInt();
        
        if (senha == 4531) {
            System.out.printf("Acesso permitido!\n");
        } else {
            System.out.printf("Acesso negado!\n");
        }
        
        in.close();
    }
    
}
