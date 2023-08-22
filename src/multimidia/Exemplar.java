package multimidia;

public class Exemplar extends Livro {
    // Classe que representa um exemplar de um livro
    private String id;
    private boolean availability;

    public Exemplar(Livro livro) {
        super(livro.getTitle(), livro.getAuthor(), livro.getIsbn());
        livro.exemplares.add(this);
        this.id = getIsbn() + "-" + String.format("%03d", livro.exemplares.size());
        this.availability = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailable(boolean availability) {
        this.availability = availability;
    }
}
