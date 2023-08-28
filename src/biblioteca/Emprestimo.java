package biblioteca;

import membros.Membro;
import membros.funcionarios.Funcionario;
import multimidia.ItemMultimidia;


import java.time.LocalDate;



public class Emprestimo {
    private Funcionario operador; // Quem realizou o empréstimo
    private Membro dono; // Quem pediu o empréstimo
    private ItemMultimidia item; // Item sendo emprestado
    private LocalDate criacao; // Data de criação
    private LocalDate deadline; // Data limite
    private int extensionsCount; // Quantidade de extensões de deadline realizadas
    private RenovacaoReserva[] extensions; // Extensões realizadas

    public Emprestimo(Membro dono, Funcionario operador, int dias, ItemMultimidia item) {
        this.dono = dono;
        this.operador = operador;
        this.criacao = LocalDate.now()   ;
        this.deadline = criacao.plusDays(dias);
        this.item = item;
        this.extensionsCount = 0;
        this.extensions = new RenovacaoReserva[0];
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

    public Funcionario getOperador() {
        return operador;
    }

    public void setOperador(Funcionario operador) {
        this.operador = operador;
    }

    public ItemMultimidia getItem() {
        return item;
    }

    public void setItem(ItemMultimidia item) {
        this.item = item;
    }

    public RenovacaoReserva[] getExtensions() {
        return extensions;
    }

    public void setExtensions(RenovacaoReserva[] extensions) {
        this.extensions = extensions;
    }
}
