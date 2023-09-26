package biblioteca.models.multimidia;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DVD extends ItemMultimidia {
	private List<String> elenco;
	private Duration duracaoTotal; // Em segundos
    private static int totalCopias; // Contagem de cópias
    private static int disponiveis; // Contagem de exemplares disponíveis
    
    public DVD(String titulo, String autor, Duration duracaoTotal) {
        super(titulo, autor);
        totalCopias = getTotalCopias() + 1; // Número total de cópias por edição
        disponiveis = getDisponiveis() + 1; // Número de cópias disponíveis por edição
        this.duracaoTotal = duracaoTotal;
        this.elenco = new ArrayList<>();
    }

	public List<String> getElenco() {
		return elenco;
	}

	public void setElenco(List<String> elenco) {
		this.elenco = elenco;
	}

	public Duration getDuracaoTotal() {
		return duracaoTotal;
	}

	public void setDuracaoTotal(Duration duracaoTotal) {
		this.duracaoTotal = duracaoTotal;
	}

	public int getTotalCopias() {
		return totalCopias;
	}

	public void setTotalCopias(int totalCopias) {
		DVD.totalCopias = totalCopias;
	}

	public int getDisponiveis() {
		return disponiveis;
	}

	public void setDisponiveis(int disponiveis) {
		DVD.disponiveis = disponiveis;
	}


    
}