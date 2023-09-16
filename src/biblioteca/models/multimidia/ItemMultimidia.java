package biblioteca.models.multimidia;

import java.util.UUID;

import biblioteca.models.Biblioteca;

public abstract class ItemMultimidia {
    private String titulo;
    private String autor;
    private String tombo;
    private boolean disponivel;
    
    public ItemMultimidia(String titulo, String autor, Biblioteca biblioteca) {
        this.titulo = titulo;
        this.autor = autor;
        this.tombo = UUID.randomUUID().toString(); // TODO gerar o tombo de forma consistente
        biblioteca.addItem(this);
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

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
