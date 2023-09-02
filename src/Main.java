import biblioteca.Biblioteca;
import membros.EstudanteGrad;
import membros.funcionarios.Atendente;
import multimidia.ExemplarLivro;
import multimidia.Livro;
import membros.Estudante;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Central", "-");
        Livro umLivro = new Livro("Um titulo", "Um autor", "12345", 0);
        ExemplarLivro umExemplar = new ExemplarLivro(umLivro);


        Estudante umEstudante = new EstudanteGrad("Um aluno", "100.200.300-40", "231231", 42);
        Atendente umAtendente = new Atendente("Um atendente", "123.456.789-10", "9010982380", "1230928");
        umAtendente.emprestar(umEstudante, umExemplar, 30);
        umEstudante.pegarLivro(biblioteca, umLivro);


        System.out.println(umEstudante.getMaterial().get(0).getTitulo());
        System.out.println(umEstudante.getEmprestimos().get(0).getItem().getTitulo());
        System.out.println(biblioteca.getAcervo().get(0).getTitulo());

    }
}

