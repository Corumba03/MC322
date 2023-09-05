package biblioteca.models.multimidia;

import java.util.ArrayList;
import java.util.List;
import java.time.Duration;

public class CD extends ItemMultimidia {
	private List<String> faixas;
	private Duration duracaoTotal; // Em segundos
    private static int totalCopias; // Contagem de cópias
    private static int disponiveis; // Contagem de exemplares disponíveis
    private int estadoConservacao; // Varia de 0 a 2, sendo 0 novo, 1 conservado e 2 danificado
	
    public CD(String titulo, String autor, Duration duracaoTotal, int estadoConservacao) {
        super(titulo, autor);
        totalCopias = 0; // Número total de cópias por edição
        disponiveis = 0; // Número de cópias disponíveis por edição
        this.duracaoTotal = duracaoTotal;
        this.faixas = new ArrayList<>();
        if (estadoConservacao > 2 || estadoConservacao < 0) {
        	System.out.println("Opção de estado de conservação inválida, insira um número de 0 a 2, sendo:"
        			+ "0: novo, 1: usado e 2: danificado.");}
        else { 
        	this.estadoConservacao = estadoConservacao;
        }
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


	public int getEstadoConservacao() {
		return estadoConservacao;
	}


	public void setEstadoConservacao(int estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}
    
}
