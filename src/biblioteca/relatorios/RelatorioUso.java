package biblioteca.relatorios;

import membros.Membro;

public class RelatorioUso extends Relatorio{
    private int[] EmprestimosTotal; // 0: CD; 1: DVD; 2: Ebook; 3: Livro físico; 4: Outros // TODO implementar com enum
    public RelatorioUso(Membro membro) {
        super(membro);
    }

    public int[] getEmprestimosTotal() {
        return EmprestimosTotal;
    }

    public void setEmprestimosTotal(int[] emprestimosTotal) {
        EmprestimosTotal = emprestimosTotal;
    }
}
