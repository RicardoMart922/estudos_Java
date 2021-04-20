package exercicio03;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Construtores
    public Livro() {
    
    }
    
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    
    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }
    
    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    // Método personalizado
    public void detalhes() {
        System.out.printf("=-=-=-=-> DETALHES DO LIVRO <-=-=-=-=\n");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotalPaginas());
    }
    
    public void status() {
        System.out.printf("=-=-=-=-> SITUAÇÃO DO LIVRO <-=-=-=-=\n");
        System.out.println("Quem está lendo o livro? " + this.getLeitor().getNome());
        if (this.getAberto()) {
            System.out.println("A página em que o livro estar aberto é " + this.getPagAtual());
        } else {
            System.out.println("O livro estar fechado!");
        }
    }

    // Métodos da interface (Publicação)
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pagina) {
        if (pagina > this.getTotalPaginas()) {
            System.out.println("Página atual: Erro. Impossível folhear até essa página!");
        } else {
            this.pagAtual = pagina;
        }
    }

    @Override
    public void avancarPagina() {
        if (this.getAberto()) {
            this.pagAtual++;
        } else {
            System.out.println("O livro estar fechado.");
        }
    }

    @Override
    public void voltarPagina() {
        if (this.getAberto()) {
            this.pagAtual--;
        } else {
            System.out.println("O livro estar fechado.");
        }
    }
}
