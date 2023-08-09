import java.util.List;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private List<Volume>;

    // Construtor do Book
    public Book (String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author
    }
    public String getIsbn() {
        return isbn;
    }

    // Criação de uma subclasse que representa os exemplares de um livro
    public class Volume {
        private String id;
        private boolean available;

        public Volume (String title, String author, String isbn){
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        public String getId() {
            return id;
        }
        public boolean isAvailable() {
            return available;
        }
    }
}
