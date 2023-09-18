package biblioteca.models.relatorios;

public class RelatorioUso extends Relatorio{
	public enum Item {
		CD, DVD, EBOOK, LIVRO, OUTROS
	}
	private Item emprestimosTotal;

    public RelatorioUso(Item item) {
        this.emprestimosTotal = item;
    }
    public Item getEmprestimosTotal() {
        return emprestimosTotal;
    }
    public void setEmprestimosTotal(Item emprestimosTotal) {
        this.emprestimosTotal = emprestimosTotal;
    }
	public Item getItem() {
		return emprestimosTotal;
	}
	public void setItem(Item emprestimosTotal) {
		this.emprestimosTotal = emprestimosTotal;
	}
}
