package multimidia;

import java.util.List;
import java.util.UUID;

public abstract class ItemMultimidia {
    private String titulo;
    private String autor;
    private String tombo;
    protected List<ExemplarMultimidia> exemplaresMultimidia;
    private int total; // Contagem de exemplares
    private int disponiveis; // Contagem de cópias/exemplares disponíveis
    
    public ItemMultimidia(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.tombo = UUID.randomUUID().toString(); // TODO gerar o tombo de forma consistente
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTombo() {
        return tombo;
    }

    public void setTombo(String tombo) {
        this.tombo = tombo;
    }

	public List<ExemplarMultimidia> getExemplaresMultimidia() {
		return exemplaresMultimidia;
	}

	public void setExemplares(List<ExemplarMultimidia> exemplaresMultimidia) {
		this.exemplaresMultimidia = exemplaresMultimidia;
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

	public void setExemplaresMultimidia(List<ExemplarMultimidia> exemplaresMultimidia) {
		this.exemplaresMultimidia = exemplaresMultimidia;
	}
    
}
