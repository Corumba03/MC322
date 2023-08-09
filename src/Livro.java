public class Livro {
    private String title;
    private String author;
    private String isbn;

    // Construtor do Book


    public Livro(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
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

    public class Volume {
        private String id;
        private boolean available;

        public Volume (){
            this.id = "-" + isbn;
        }

        public String getId() {
            return id;
        }
        public boolean isAvailable() {
            return available;
        }
    }

    // Criação de uma subclasse que representa os exemplares de um livro
}
