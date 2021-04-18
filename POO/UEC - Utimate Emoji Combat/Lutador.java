package UEC;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    // Construtores
    public Lutador() {
    
    }
    
    public Lutador(String nomeLutador, String nacionalidadeLutador, int idadeLutador, double alturaLutador, double pesoLutador, int vitoriaLutador, int derrotaLutador, int empateLutador) {
        this.setNome(nomeLutador);
        this.setNacionalidade(nacionalidadeLutador);
        this.setIdade(idadeLutador);
        this.setAltura(alturaLutador);
        this.setPeso(pesoLutador);
        this.setVitorias(vitoriaLutador);
        this.setDerrotas(derrotaLutador);
        this.setEmpates(empateLutador);
    }
    
    // Getters
    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }    
    
    public int getIdade() {
        return idade;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public int getVitorias() {
        return vitorias;
    }
    
    public int getDerrotas() {
        return derrotas;
    }
    
    public int getEmpates() {
        return empates;
    }
    
    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        if (peso >= 52.2 && peso <= 70.3) {
            this.setCategoria("Peso leve");
        } else if (peso > 70.3 && peso <= 83.9) {
            this.setCategoria("Peso médio");
        } else if (peso > 83.9 && peso <= 120.2) {
            this.setCategoria("Peso pesado");
        } else {
            this.setCategoria("Peso inválido");
        }
    }
    
    private void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    // Métodos personalizados
    public void apresentar() {
        System.out.println(">>> APRESENTÇÃO DO LUTADOR <<<");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso() + "kg");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println(">>>>>>>>>>>>-<<<<<<<<<<<<");
    }
    
    public void status() {
        System.out.println(">>>>>>>>>>>>-<<<<<<<<<<<<");
        System.out.println(this.getNome());
        System.out.println(this.getIdade() + "anos de idade.");
        if (this.getDerrotas() == 0) {
            System.out.println("Invicto!");
        }
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
    
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    } 
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
