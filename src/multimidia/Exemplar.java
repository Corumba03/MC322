package multimidia;

public class Exemplar extends Livro {
    // Classe que representa um exemplar de um livro
    private String id;
    private boolean available;

    public Exemplar(Livro livro) {
        super(livro.getTitulo(), livro.getAutor(), livro.getISBN());
        livro.exemplares.add(this);
        this.id = getISBN() + "-" + String.format("%03d", livro.exemplares.size());
        this.available = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
