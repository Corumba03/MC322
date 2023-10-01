package biblioteca.models.multimidia;

import java.time.LocalDate;

public class Ebook extends LivroFisico {
    private double tamanho; // Tamanho em MB
    private static int totalLicencas; // Numero total permitido de licencas simultaneas
    private static int disponiveis; // Contagem de exemplares disponíveis
    private String formato; // PDF, ePub, etc.
    private String url;
    private String requisitosLeitura; // Software, dispositivo compatível
    private LocalDate dataDisponibilidade;

	public Ebook(String titulo, String autor, String ISBN, String edicao, String editora, double tamanho, String formato, String url, String requisitosLeitura) {
		super(titulo, autor, ISBN, edicao, editora);
		this.tamanho = tamanho;
		this.formato = formato;
		this.url = url;
		this.requisitosLeitura = requisitosLeitura;
		this.dataDisponibilidade = LocalDate.now(); // TODO revisar significado desta data
		Ebook.totalLicencas = Ebook.totalLicencas + 1;
		disponiveis = getDisponiveis() + 1;
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
		totalLicencas = total;
	}

	public int getDisponiveis() {
		return disponiveis;
	}

	public void setDisponiveis(int disponiveis) {
		Ebook.disponiveis = disponiveis;
	}

	public int getTotalLicencas() {
		return totalLicencas;
	}

	public void setTotalLicencas(int totalLicencas) {
		Ebook.totalLicencas = totalLicencas;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String geturl() {
		return url;
	}

	public void seturl(String uRL) {
		url = uRL;
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