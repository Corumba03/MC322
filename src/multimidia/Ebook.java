package multimidia;

public class Ebook extends Livro{
    private double tamanho; // Tamanho em MB
    public Ebook(String titulo, String autor, String ISBN, double tamanho) {
        super(titulo, autor, ISBN);
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}