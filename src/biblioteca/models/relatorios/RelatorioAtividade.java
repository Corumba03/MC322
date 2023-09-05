package biblioteca.models.relatorios;

import biblioteca.models.formularios.Devolucao;
import biblioteca.models.formularios.Emprestimo;
import biblioteca.models.formularios.Reserva;
import biblioteca.models.membros.Membro;

import java.util.ArrayList;
import java.util.List;

public class RelatorioAtividade extends Relatorio{ // Relatório de atividade de membros

    // TODO implementar o período (talvez seja desnecessário já que Emprestimo, Devolucao e Reserva possuem datas)
    private Membro membro; // Membro ao qual o relatório fala sobre
    private List<Emprestimo> emprestimos; // Lista de empréstimos realizados pelo membro
    private List<Reserva> reservas; // Lista de reservas pedidas
    private List<Devolucao> devolucoes; // Lista de emprestimos devolvidos
    public RelatorioAtividade(Membro membro) {
        this.membro = membro;
        this.emprestimos = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.devolucoes = new ArrayList<>();
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }


    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public List<Devolucao> getDevolucoes() {
        return devolucoes;
    }

    public void setDevolucoes(List<Devolucao> devolucoes) {
        this.devolucoes = devolucoes;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }
}
