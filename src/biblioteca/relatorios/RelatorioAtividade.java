package biblioteca.relatorios;

import biblioteca.Devolucao;
import biblioteca.Emprestimo;
import biblioteca.Reserva;
import membros.Membro;

import java.util.ArrayList;
import java.util.List;

public class RelatorioAtividade extends Relatorio{ // Relatório de atividade de membros
    // TODO implementar o período (talvez seja desnecessário já que Emprestimo, Devolucao e Reserva possuem datas)
    private List<Emprestimo> emprestimos; // Lista de empréstimos realizados pelo membro
    private List<Devolucao> devolucoes; // Lista de devoluções efetuadas
    private List<Reserva> reservas; // Lista de reservas pedidas
    public RelatorioAtividade(Membro membro) {
        super(membro);
        this.emprestimos = new ArrayList<>();
        this.devolucoes = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public List<Devolucao> getDevolucoes() {
        return devolucoes;
    }

    public void setDevolucoes(List<Devolucao> devolucoes) {
        this.devolucoes = devolucoes;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
