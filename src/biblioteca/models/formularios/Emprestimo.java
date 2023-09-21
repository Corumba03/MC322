package biblioteca.models.formularios;

import biblioteca.models.membros.Membro;

import biblioteca.models.multimidia.ItemMultimidia;
import biblioteca.models.multimidia.Status;


import java.time.LocalDate;


public class Emprestimo {
    private Membro dono; // Quem pediu o empréstimo
    private ItemMultimidia item ; // Item sendo emprestados
    private LocalDate dataEmprestimo; // Data de criação
    private LocalDate dataDevolucao; // Data limite
    private boolean ativo; // Uma marca para indicar que o empréstimo ainda está ativo/pendente

    public Emprestimo(Membro dono, ItemMultimidia item) {
        this.dono = dono;
        this.dataEmprestimo = LocalDate.now()   ;
        this.dataDevolucao = dataEmprestimo.plusDays(dono.getPrazoEmprestimo());
        this.item = item;
        item.setStatus(Status.EMPRESTADO);
    }

    public Membro getDono() {
        return dono;
    }

    public void setDono(Membro dono) {
        this.dono = dono;
    }

    public LocalDate getCriacao() {
        return dataEmprestimo;
    }

    public void setCriacao(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getPrazo() {
        return dataDevolucao;
    }

    public void setPrazo(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public ItemMultimidia getItem() {
        return item;
    }

    public void setItem(ItemMultimidia item) {
        this.item = item;
    }

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
