package multimidia;


import java.util.ArrayList;
import java.util.List;

public class Livro extends ItemMultimidia{
    // Classe que representa todos os livros com mesmo título, autor e ISBN
    private final String ISBN;
    protected List<Exemplar> exemplares;
    private int qtd; // Contagem de exemplares
    private int disponiveis; // Contagem de exemplares disponíveis

    // Constructor
    public Livro(String titulo, String autor, String ISBN) {
        super(titulo, autor);
        this.ISBN = ISBN;
        this.exemplares = new ArrayList<>();
        this.qtd = 0;
        this.disponiveis = 0;
    }

    // Getters & Setters
    public String getTitulo() {
        return super.getTitulo();
    }

    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }

    public String getAutor() {
        return super.getAutor();
    }

    public void setAutor(String autor) {
        super.setAutor(autor);
    }
    
    public String getISBN() {
        return ISBN;
    }

    public List<Exemplar> getExemplares() {
        return exemplares;
    }

    public void setExemplares(List<Exemplar> exemplares) {
        this.exemplares = exemplares;
    }

    public int getDisponiveis() {
        return disponiveis;
    }

    public void setDisponiveis(int disponiveis) {
        this.disponiveis = disponiveis;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(byte qtd) {
        this.qtd = qtd;
    }
}
