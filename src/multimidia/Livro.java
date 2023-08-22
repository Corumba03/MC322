package multimidia;


import java.util.ArrayList;
import java.util.List;

public class Livro extends ItemMultimidia{
    // Classe que representa todos os livros com mesmo título, autor e ISBN
    private String title;
    private String author;
    private final String isbn;
    protected List<Exemplar> exemplares;
    private byte count; // Contagem de exemplares
    private byte available; // Contagem de exemplares disponíveis

    // Constructor
    public Livro(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.exemplares = new ArrayList<>();
        this.count = 0;
        this.available = 0;
    }

    // Getters & Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public List<Exemplar> getExemplares() {
        return exemplares;
    }

    public void setExemplares(List<Exemplar> exemplares) {
        this.exemplares = exemplares;
    }

    public byte getAvailable() {
        return available;
    }

    public void setAvailable(byte available) {
        this.available = available;
    }

    public byte getCount() {
        return count;
    }

    public void setCount(byte count) {
        this.count = count;
    }
}
