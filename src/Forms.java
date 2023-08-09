import java.util.Date;

public class Forms {
    public String type; // Empréstimo x Devolução
    public Date date; // Data que foi retirado ou devolvido
    public Livro.Exemplar livro; // Livro que foi retirado/devolvido

    // Constructor
    public Forms(String type, Date date, Livro.Exemplar livro) {
        this.type = type;
        this.date = date;
        this.livro = livro;
    }

    // Getters
    public String getType() {
        return type;
    }
    public Date getDate() {
        return date;
    }
    public Livro.Exemplar getLivro() {
        return livro;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    private void setLivro(Livro.Exemplar livro) {
        this.livro = livro;
    }

    public class Borrow_form {
        private Date deadline; // Data limite para devolver
        public int multa; // Valor inicial da multa
        public boolean active; // Um marcador para identificar se o empréstimo foi ou não resolvido (motivação arquivística)


    }
}
