import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Livro> biblioteca = new ArrayList<>(); // Lista de livros registrados (não exemplares)
        List<Livro.Exemplar> acervo = new ArrayList<>(); // Lista de todos os exemplares

        Livro umLivroQualquer = new Livro("O título", "O autor", "12345", biblioteca);
        Livro.Exemplar oLivro = umLivroQualquer.new Exemplar(acervo);

        System.out.println("Livros da biblioteca:");
        for (int i = 0; i < biblioteca.size(); i++){
            System.out.printf(biblioteca.get(i).getTitle() + '|');
            System.out.printf(biblioteca.get(i).getAuthor() + '|');
            System.out.println(biblioteca.get(i).getIsbn() + '\n');

        }

        System.out.println("Acervo da biblioteca:");
        for (int i = 0; i < acervo.size(); i++){
            System.out.printf(acervo.get(i).getTitle_() + '|');
            System.out.println(acervo.get(i).getId());
        }


    }
}

