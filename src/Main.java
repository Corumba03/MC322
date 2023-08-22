import biblioteca.Biblioteca;
import multimidia.Exemplar;
import multimidia.Livro;
import pessoas.Aluno;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Central", "-");
        Livro umLivro = new Livro("Um titulo", "Um autor", "12345");
        Exemplar umExemplar = new Exemplar(umLivro);


        Aluno umAluno = new Aluno("Um aluno", "100.200.300-40", "231231", 42);
        umAluno.pegarLivro(biblioteca, umLivro);
        System.out.println(umAluno.getMaterial().get(0).getTitulo());

    }
}

