package UEC;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int qtdLutadores = 0; 
        
        // Variáveis da classe Lutador
        String nome, nacionalidade;
        double altura = 0.0, peso = 0.0;
        int idade = 0, vitorias = 0, derrotas = 0, empates = 0;
        
        System.out.printf("Informe a quantidade de lutadores: ");
        qtdLutadores = in.nextInt();
        
        Lutador []vetorLutadores = new Lutador[qtdLutadores];
        
        for (int i = 0; i < qtdLutadores; i++) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.printf("Digite o nome do lutador: ");
            nome = in.next();
            in.nextLine();
            
            System.out.printf("Digite a nacionalidade do lutador: ");
            nacionalidade = in.next();
            in.nextLine();
            
            System.out.printf("Digite a idade do lutador: ");
            idade = in.nextInt();
            
            System.out. printf("Digite o peso do lutador: ");
            peso = in.nextDouble();
            
            System.out.printf("Digite a altura do lutador: ");
            altura = in.nextDouble();
            
            System.out.printf("Digite o número de vitórias: ");
            vitorias = in.nextInt();
            
            System.out.printf("Digite o número de derrotas: ");
            derrotas = in.nextInt();
            
            System.out.printf("Digite o número de empates: ");
            empates = in.nextInt();
            
            vetorLutadores[i] = new Lutador(nome, nacionalidade, idade, altura, peso, vitorias, derrotas, empates);
        }
        
        Luta luta = new Luta();
	
	// Para fins de teste, utilizei dois lutadores
        luta.marcaLuta(vetorLutadores[0], vetorLutadores[1]);
        luta.lutar();
        
        System.out.println("Status dos Lutadores Pos-Luta");
   
        vetorLutadores[0].status();
        vetorLutadores[1].status();
   
    }
    
}
