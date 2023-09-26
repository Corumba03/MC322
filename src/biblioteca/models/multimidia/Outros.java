package biblioteca.models.multimidia;


public class Outros extends ItemMultimidia {
    private static int total; // Contagem de exemplares
    private static int disponiveis; // Contagem de cópias/exemplares disponíveis
    private String localizacao;
    private String tipoRecurso;
    private String formato;
    private int estadoConservacao; // Varia de 0 a 2, sendo 0 novo, 1 conservado e 2 danificado
    
    
    public Outros(String titulo, String autor, String localizacao, String tipoRecurso, String formato) {
        super(titulo, autor);
    	this.localizacao = localizacao;
    	this.tipoRecurso = tipoRecurso;
        this.formato = formato;
        total = getTotal() + 1; // Número total de cópias por edição
        disponiveis = getDisponiveis() + 1; // Número de cópias disponíveis por edição
    }


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		Outros.total = total;
	}


	public int getDisponiveis() {
		return disponiveis;
	}


	public void setDisponiveis(int disponiveis) {
		Outros.disponiveis = disponiveis;
	}


	public String getLocalizacao() {
		return localizacao;
	}


	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}


	public String getTipoRecurso() {
		return tipoRecurso;
	}


	public void setTipoRecurso(String tipoRecurso) {
		this.tipoRecurso = tipoRecurso;
	}


	public String getFormato() {
		return formato;
	}


	public void setFormato(String formato) {
		this.formato = formato;
	}

    
    
}
