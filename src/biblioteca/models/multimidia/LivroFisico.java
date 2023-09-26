package biblioteca.models.multimidia;


public class LivroFisico extends ItemMultimidia {
    // Classe que representa todos os livros com mesmo título, autor e ISBN
    private final String ISBN;
    private String edicao;
    private String editora;
    private static int total; // Contagem de exemplares
    private static int disponiveis; // Contagem de exemplares disponíveis
    private boolean disponivel;
    private String id; // Código de identificação único do livro

    // Construtor
    public LivroFisico(String titulo, String autor, String ISBN, String edicao, String editora, int estadoConservacao) {
        super(titulo, autor);
        this.ISBN = ISBN;
        this.edicao = edicao;
        this.editora = editora;
        total = getTotal() + 1; // Número total de cópias por edição
        disponiveis = getDisponiveis() + 1; // Número de cópias disponíveis por edição
        this.disponivel = true;
        this.id = getISBN() + "-" + String.format("%03d", this.getTotal());
    }
    
    // Getters & Setters
    public String getTitulo() {
        return super.getTitulo();
    }

    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }

    public String getAutor() {
        return super.getAutor();
    }

    public void setAutor(String autor) {
        super.setAutor(autor);
    }
    
    public String getISBN() {
        return ISBN;
    }

    public int getDisponiveis() {
        return disponiveis;
    }

    public void setDisponiveis(int disponiveis) {
        LivroFisico.disponiveis = disponiveis;
    }

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		LivroFisico.total = total;
	}

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
