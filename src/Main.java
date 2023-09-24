import biblioteca.models.formularios.Reserva;
import biblioteca.models.generics.ListaReservas;
import biblioteca.models.membros.universitario.EstudanteGrad;
import biblioteca.models.multimidia.LivroFisico;




public class Main {
    
    public static void main(String[] args) {
        EstudanteGrad umEstudante = new EstudanteGrad("Nome", "endereço", "0800", "12345", "curso");
        LivroFisico umLivro = new LivroFisico("título", "autor", "5678", "1ª edição", "a editora", 0);
        Reserva novaReserva = new Reserva(umEstudante, umLivro);
        ListaReservas listaReservas = new ListaReservas<>();
        listaReservas.addReserva(novaReserva);
    }
}
