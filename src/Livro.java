import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String title;
    private String author;
    private final String isbn;

    // Construtor do Book


    public Livro(String title, String author, String isbn, List<Livro> biblioteca) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        biblioteca.add(this);
    }

    // Getters
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn() {
        return isbn;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Criação de uma subclasse que representa os exemplares de um livro
    public class Exemplar {
        private final String id;
        private boolean available;

        // Constructor
        public Exemplar (List<Exemplar> acervo){
            this.id = isbn + "-" +  acervo.size();
            this.available = true;
            acervo.add(this);
        }

        // Getters
        public String getId() {
            return id;
        }
        public boolean isAvailable() {
            return available;
        }

        public String getTitle_(){
            return getTitle();
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }
    }


}
