package multimidia;


public class Outros extends ItemMultimidia{
    private int total; // Contagem de exemplares
    private int disponiveis; // Contagem de cópias/exemplares disponíveis
    private String localizacao;
    private String tipoRecurso;
    private String formato;
    private int estadoConservacao; // Varia de 0 a 2, sendo 0 novo, 1 conservado e 2 danificado
    
    
    public Outros(String titulo, String autor, String localizacao, String tipoRecurso, String formato, int estadoConservacao) {
        super(titulo, autor);
    	this.localizacao = localizacao;
    	this.tipoRecurso = tipoRecurso;
        this.formato = formato;
        this.total = 0; // Número total de cópias por edição
        this.disponiveis = 0; // Número de cópias disponíveis por edição
        if (estadoConservacao > 2 || estadoConservacao < 0) {
        	System.out.println("Opção de estado de conservação inválida, insira um número de 0 a 2, sendo:"
        			+ "0: novo, 1: usado e 2: danificado.");}
        else { 
        	this.estadoConservacao = estadoConservacao;
        }
    }


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public int getDisponiveis() {
		return disponiveis;
	}


	public void setDisponiveis(int disponiveis) {
		this.disponiveis = disponiveis;
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


	public int getEstadoConservacao() {
		return estadoConservacao;
	}


	public void setEstadoConservacao(int estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}
    
    
}