package biblioteca.models.multimidia;

import biblioteca.models.formularios.Emprestimo;

public class ItemBiblioteca<T>{
    private String titulo;
    private String id;
    private Status status;

    public ItemBiblioteca(String titulo, String id) {
        this.titulo = titulo;
        this.id = id;
        this.status = Status.DISPONIVEL;
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
