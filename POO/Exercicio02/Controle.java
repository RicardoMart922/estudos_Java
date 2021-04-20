package exercicio02;

public class Controle implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public Controle() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }
    
    private int getVolume() {
        return this.volume;
    }
    
    private boolean getLigado() {
        return this.ligado;
    }
    
    private boolean getTocando() {
        return this.tocando;
    }
    
    private void setVolume(int vol) {
        this.volume = vol;
    }
    
    private void setLigado(boolean lig) {
        this.ligado = lig;
    }
    
    private void setTocando(boolean toc) {
        this.tocando = toc;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        if (this.getLigado()) {
            System.out.println("Está tocando? " + this.getTocando());
            System.out.println("Volume: " + this.getVolume());
            for (int i = 10; i <= this.getVolume(); i += 10) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void aumentarVolume() {
        if (this.getLigado() || this.getVolume() < 100) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossivel aumentar o volume.");
        }
    }

    @Override
    public void diminuirVolume() {
        if (this.getLigado() || this.getVolume() > 0) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossivel diminuir o volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("O mudo já está ligado.");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        } else {
            System.out.println("O mudo já está desligado.");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
}
