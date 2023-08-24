package multimidia;

import java.util.UUID;

public abstract class ItemMultimidia {
    private String titulo;
    private String autor;

    private String tombo;

    public ItemMultimidia(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.tombo = UUID.randomUUID().toString(); // TODO gerar o tombo de forma consistente
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
        return tombo;
    }

    public void setTombo(String tombo) {
        this.tombo = tombo;
    }
}
