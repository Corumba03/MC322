package multimidia;


import java.util.ArrayList;
import java.util.List;

public class Livro extends ItemMultimidia{
    // Classe que representa todos os livros com mesmo título, autor e ISBN
    private final String ISBN;
    protected List<ExemplarLivro> exemplaresLivro;
    private int total; // Contagem de exemplares
    private int disponiveis; // Contagem de exemplares disponíveis
    private int estadoConservacao; // Varia de 0 a 2, sendo 0 novo, 1 conservado e 2 danificado

    // Construtor
    public Livro(String titulo, String autor, String ISBN, int estadoConservacao) {
        super(titulo, autor);
        this.ISBN = ISBN;
        this.exemplaresLivro = new ArrayList<>();
        this.total = 0; // Número total de cópias por edição
        this.disponiveis = 0; // Número de cópias disponíveis por edição
        if (estadoConservacao > 2 || estadoConservacao < 0) {
        	System.out.println("Opção de estado de conservação inválida, insira um número de 0 a 2, sendo:"
        			+ "0: novo, 1: usado e 2: danificado.");}
        else { 
        	this.estadoConservacao = estadoConservacao;
        }
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

    public List<ExemplarLivro> getExemplaresLivro() {
        return exemplaresLivro;
    }

    public void setExemplaresLivro(List<ExemplarLivro> exemplaresLivro) {
        this.exemplaresLivro = exemplaresLivro;
    }

    public int getDisponiveis() {
        return disponiveis;
    }

    public void setDisponiveis(int disponiveis) {
        this.disponiveis = disponiveis;
    }

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getEstadoConservacao() {
		return estadoConservacao;
	}

	public void setEstadoConservacao(int estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}
    
    
}
