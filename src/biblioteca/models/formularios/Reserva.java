package biblioteca.models.formularios;

import biblioteca.models.membros.Membro;
import biblioteca.models.multimidia.ItemMultimidia;

import java.time.LocalDate;

public class Reserva {
    private Membro usuario; // Membro que requisitou a reserva
    private ItemMultimidia item; // Item sendo reservado
    private LocalDate criacao; //  Data de criação

    public Reserva(Membro usuario, ItemMultimidia item) {
        this.usuario = usuario;
        this.item = item;
        this.criacao = LocalDate.now();
    }

    public Membro getUsuario() {
        return usuario;
    }

    public void setUsuario(Membro usuario) {
        this.usuario = usuario;
    }

    public ItemMultimidia getItem() {
        return item;
    }

    public void setItem(ItemMultimidia item) {
        this.item = item;
    }

    public LocalDate getCriacao() {
        return criacao;
    }

    public void setCriacao(LocalDate criacao) {
        this.criacao = criacao;
    }
}
