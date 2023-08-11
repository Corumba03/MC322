import livro.Exemplar;
import livro.Livro;

public class Main {
    public static void main(String[] args) {
        Livro newLivro = new Livro("Title", "Author", "12345");
        Exemplar newExemplar = new Exemplar(newLivro);
        System.out.println(newExemplar.getTitle() + "\n" +
                newExemplar.getId());
    }
}
// Testando git
