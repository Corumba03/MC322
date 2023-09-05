package biblioteca.models.formularios;

import biblioteca.models.membros.Membro;
import biblioteca.models.multimidia.ItemMultimidia;


import java.time.LocalDate;


public class Emprestimo {
    private Membro dono; // Quem pediu o empréstimo
    private ItemMultimidia item; // Item sendo emprestado
    private LocalDate criacao; // Data de criação
    private LocalDate prazo; // Data limite
    private boolean ativo; // Uma marca para indicar que o empréstimo ainda está ativo/pendente

    public Emprestimo(Membro dono, ItemMultimidia item) {
        this.dono = dono;
        this.criacao = LocalDate.now()   ;
        this.prazo = criacao.plusDays(dono.getPrazoEmprestimo());
        this.item = item;
    }

    public Membro getDono() {
        return dono;
    }

    public void setDono(Membro dono) {
        this.dono = dono;
    }

    public LocalDate getCriacao() {
        return criacao;
    }

    public void setCriacao(LocalDate criacao) {
        this.criacao = criacao;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public ItemMultimidia getItem() {
        return item;
    }

    public void setItem(ItemMultimidia item) {
        this.item = item;
    }

}
