package biblioteca.models.relatorios;

import biblioteca.models.Emprestimo;
import biblioteca.models.Reserva;
import biblioteca.models.membros.Membro;

import java.util.ArrayList;
import java.util.List;

public class RelatorioAtividade extends Relatorio{ // Relatório de atividade de membros
    // TODO implementar o período (talvez seja desnecessário já que Emprestimo, Devolucao e Reserva possuem datas)
    private List<Emprestimo> emprestimos; // Lista de empréstimos realizados pelo membro
    private List<Reserva> reservas; // Lista de reservas pedidas
    public RelatorioAtividade(Membro membro) {
        super(membro);
        this.emprestimos = new ArrayList<>();
        this.reservas = new ArrayList<>();
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
}
