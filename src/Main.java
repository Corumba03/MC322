import biblioteca.Biblioteca;
import membros.EstudanteGrad;
import multimidia.ExemplarLivro;
import multimidia.Livro;
import membros.Estudante;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Central", "-");
        Livro umLivro = new Livro("Um titulo", "Um autor", "12345");
        ExemplarLivro umExemplar = new ExemplarLivro(umLivro);


        Estudante umEstudante = new EstudanteGrad("Um aluno", "100.200.300-40", "231231", 42);
        umEstudante.pegarLivro(biblioteca, umLivro);
        System.out.println(umEstudante.getMaterial().get(0).getTitulo());

    }
}

