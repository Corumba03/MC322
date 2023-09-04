package biblioteca;

import membros.Membro;
import multimidia.ItemMultimidia;


import java.time.LocalDate;


public class Emprestimo {
    private Membro dono; // Quem pediu o empréstimo
    private ItemMultimidia item; // Item sendo emprestado
    private LocalDate criacao; // Data de criação
    private LocalDate deadline; // Data limite
    private int extensionsCount; // Quantidade de extensões de deadline realizadas
    private Reserva[] extensions; // Extensões realizadas

    public Emprestimo(Membro dono, ItemMultimidia item) {
        this.dono = dono;
        this.criacao = LocalDate.now()   ;
        this.deadline = criacao.plusDays(dono.getPrazoEmprestimo());
        this.item = item;
        this.extensionsCount = 0;
        this.extensions = new Reserva[0];
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

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public int getExtensionsCount() {
        return extensionsCount;
    }

    public void setExtensionsCount(int extensionsCount) {
        this.extensionsCount = extensionsCount;
    }

    public ItemMultimidia getItem() {
        return item;
    }

    public void setItem(ItemMultimidia item) {
        this.item = item;
    }

    public Reserva[] getExtensions() {
        return extensions;
    }

    public void setExtensions(Reserva[] extensions) {
        this.extensions = extensions;
    }
}
