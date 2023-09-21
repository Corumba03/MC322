package biblioteca.models.multimidia;

import java.util.ArrayList;

import biblioteca.models.formularios.Emprestimo;
import biblioteca.models.formularios.Reserva;

public class ItemBiblioteca<T>{
    private String titulo;
    private String id;
    private Status status;
    private ArrayList<Reserva> itensReservados;
    private ArrayList<Emprestimo> itensEmprestados;
    private int qtdReservados;
    private int qtdEmprestados;

    public ItemBiblioteca(String titulo, String id, Status status, int qtdReservados, int qtdEmprestados) {
		super();
		this.titulo = titulo;
		this.id = id;
		this.status = status;
		this.itensReservados = new ArrayList<Reserva>();
		this.itensEmprestados = new ArrayList<Emprestimo>();
		this.qtdReservados = itensEmprestados.size();
		this.qtdEmprestados = itensEmprestados.size();
	}

	public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void emprestar() {
    }
    public void devolver() {
    }
    public void reservar() {
    }
}
