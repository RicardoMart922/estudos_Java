package UEC;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    // Getters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }
    
    // Setters
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    // Métodos personalizados
    public void marcaLuta(Lutador lutador1, Lutador lutador2) {
        if (lutador1.getCategoria() == lutador2.getCategoria() && lutador1 != lutador2) {
            this.setAprovado(true);
            this.setDesafiado(lutador1);
            this.setDesafiante(lutador2);
        } else {
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar() {
        if (this.getAprovado()) {
            System.out.println("Apresentação do 1º Lutador!");
            this.getDesafiado().apresentar();
            System.out.println("Apresentação do 2º Lutador!");
            this.getDesafiante().apresentar();
            
            Random n = new Random();
            int resultado = n.nextInt(3);
            
            switch (resultado) {
                case 0: // Empate
                    System.out.println("Empate!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1: // Vitória do Desafiado
                    System.out.println("O " + this.getDesafiado().getNome() + " ganhou a luta!");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2: // Vitória do Desafiante
                    System.out.println("O " + this.getDesafiante().getNome() + " ganhou a luta!");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
            }
        } else {
            System.out.println("A luta não poderá acontecer.");
        }
    }
}
