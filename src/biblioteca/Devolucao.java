package biblioteca;

import membros.Membro;
import multimidia.ItemMultimidia;

import java.time.LocalDate;

public class Devolucao {
    private Membro dono; // Quem pediu o empréstimo
    private ItemMultimidia item; // Item sendo emprestado
    private LocalDate criacao; // Data de criação

    private Devolucao(Emprestimo emprestimo){
        this.dono = emprestimo.getDono();
        this.item = emprestimo.getItem();
        this.criacao = LocalDate.now();
    }

    public Membro getDono() {
        return dono;
    }

    public void setDono(Membro dono) {
        this.dono = dono;
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
