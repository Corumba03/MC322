package biblioteca.models.relatorios;

public class RelatorioUso extends Relatorio{
    private int[] emprestimosTotal; // 0: CD; 1: DVD; 2: Ebook; 3: Livro físico; 4: Outros // TODO implementar com enum

    public RelatorioUso(int[] emprestimosTotal) {
        this.emprestimosTotal = emprestimosTotal;
    }

    public int[] getEmprestimosTotal() {
        return emprestimosTotal;
    }

    public void setEmprestimosTotal(int[] emprestimosTotal) {
        this.emprestimosTotal = emprestimosTotal;
    }
}
