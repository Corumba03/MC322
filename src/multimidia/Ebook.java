package multimidia;

import java.time.LocalDate;

public class Ebook extends Livro{
    private double tamanho; // Tamanho em MB
    private int totalLicencas; // Numero total permitido de licencas simultaneas
    private int disponiveis; // Contagem de exemplares disponíveis
    private String formato; // PDF, ePub, etc.
    private String URL;
    private String requisitosLeitura; // Software, dispositivo compatível
    private LocalDate dataDisponibilidade;
    
    public Ebook(String titulo, String autor, String ISBN, double tamanho, int estadoConservacao, int totalLicencas, String formato, String URL, String requisitosLeitura, LocalDate dataDisponibilidade) {
        super(titulo, autor, ISBN, estadoConservacao);
        this.totalLicencas = totalLicencas;
        this.disponiveis = 0; // Número de cópias disponíveis por edição
        this.tamanho = tamanho;
        this.formato = formato;
        this.URL = URL;
        this.requisitosLeitura = requisitosLeitura;
        this.dataDisponibilidade = LocalDate.now(); // TODO revisar significado desta data
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

	public int getTotal() {
		return totalLicencas;
	}

	public void setTotal(int total) {
		this.totalLicencas = total;
	}

	public int getDisponiveis() {
		return disponiveis;
	}

	public void setDisponiveis(int disponiveis) {
		this.disponiveis = disponiveis;
	}

	public int getTotalLicencas() {
		return totalLicencas;
	}

	public void setTotalLicencas(int totalLicencas) {
		this.totalLicencas = totalLicencas;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getRequisitosLeitura() {
		return requisitosLeitura;
	}

	public void setRequisitosLeitura(String requisitosLeitura) {
		this.requisitosLeitura = requisitosLeitura;
	}

	public LocalDate getDataDisponibilidade() {
		return dataDisponibilidade;
	}

	public void setDataDisponibilidade(LocalDate dataDisponibilidade) {
		this.dataDisponibilidade = dataDisponibilidade;
	}

    
}