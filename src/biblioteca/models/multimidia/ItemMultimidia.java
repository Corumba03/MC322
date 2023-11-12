package biblioteca.models.multimidia;

import biblioteca.models.padraoprojeto.ItemMultimidiaFactory;

import java.util.List;
import java.util.UUID;


public abstract class ItemMultimidia implements ItemMultimidiaFactory {
    private String titulo;
    private String autor;
    private String id;
    private Status status;
    private List<Comentario> comentarios;
    private EstadoConservacao estadoConservacao;
    
    public ItemMultimidia(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = UUID.randomUUID().toString(); // TODO gerar o id de forma consistente
        this.status = Status.DISPONIVEL;
        this.estadoConservacao = EstadoConservacao.Novo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTombo() {
        return id;
    }

    public void setTombo(String id) {
        this.id = id;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
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

    public EstadoConservacao getEstadoConservacao() {
        return estadoConservacao;
    }

    public void setEstadoConservacao(EstadoConservacao estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }
}
