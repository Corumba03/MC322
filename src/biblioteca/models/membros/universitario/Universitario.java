package biblioteca.models.membros.universitario;

import biblioteca.models.membros.Membro;

public abstract class Universitario extends Membro {

    public Universitario(String nome, String endereco, String contato, String nui) {
        super(nome, endereco, contato);
    }
}
