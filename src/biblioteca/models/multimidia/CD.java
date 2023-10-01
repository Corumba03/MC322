package biblioteca.models.multimidia;

import java.util.ArrayList;
import java.util.List;
import java.time.Duration;

public class CD extends ItemMultimidia {
	private List<String> faixas;
	private Duration duracaoTotal; // Em segundos
    private static int totalCopias; // Contagem de cópias
    private static int disponiveis; // Contagem de exemplares disponíveis
	
    public CD(String titulo, String autor, Duration duracaoTotal) {
        super(titulo, autor);
        totalCopias = getTotalCopias() + 1; // Número total de cópias por edição
        disponiveis = getDisponiveis() + 1; // Número de cópias disponíveis por edição
        this.duracaoTotal = duracaoTotal;
        this.faixas = new ArrayList<>();
    }
    
    
	public Duration getDuracaoTotal() {
		return duracaoTotal;
	}
	public void setDuracaoTotal(Duration duracaoTotal) {
		this.duracaoTotal = duracaoTotal;
	}


	public List<String> getFaixas() {
		return faixas;
	}


	public void setFaixas(List<String> faixas) {
		this.faixas = faixas;
	}

	public int getTotalCopias() {
		return totalCopias;
	}


	public void setTotalCopias(int totalCopias) {
		CD.totalCopias = totalCopias;
	}


	public int getDisponiveis() {
		return disponiveis;
	}


	public void setDisponiveis(int disponiveis) {
		CD.disponiveis = disponiveis;
	}
    
}
