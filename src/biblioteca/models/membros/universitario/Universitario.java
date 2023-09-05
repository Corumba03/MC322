package biblioteca.models.membros.universitario;

import biblioteca.models.membros.Membro;

public abstract class Universitario extends Membro {
        private String nui; // Número de identificação

    public Universitario(String nome, String endereco, String contato, String nui) {
        super(nome, endereco, contato);
        this.nui = nui;
    }
    public String getNui() {
        return nui;
    }

    public void setNui(String nui) {
        this.nui = nui;
    }
}
