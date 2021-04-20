package exercicio03;

public class Aula09 {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Ricardo", "M", 20);
        Livro l = new Livro("Assassin's Creed : Renascença", "Oliver Bowden", 375, p);
        
        l.detalhes();
        l.abrir();
        l.folhear(150);
        l.status();
    }
    
}
