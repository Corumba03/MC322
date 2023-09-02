package multimidia;

public class ExemplarLivro extends Livro {
    // Classe que representa um exemplar de um livro
    private String id;
    private boolean available;

    public ExemplarLivro(Livro livro) {
        super(livro.getTitulo(), livro.getAutor(), livro.getISBN(), livro.getEstadoConservacao());
        livro.exemplaresLivro.add(this);
        this.id = getISBN() + "-" + String.format("%03d", livro.exemplaresLivro.size());
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
