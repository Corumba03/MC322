package multimidia;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DVD extends ItemMultimidia {
	private List<String> elenco;
	private Duration duracaoTotal; // Em segundos
    private int totalCopias; // Contagem de cópias
    private int disponiveis; // Contagem de exemplares disponíveis
    private int estadoConservacao; // Varia de 0 a 2, sendo 0 novo, 1 conservado e 2 danificado
    
    public DVD(String titulo, String autor, Duration duracaoTotal, int estadoConservacao) {
        super(titulo, autor);
        this.totalCopias = 0; // Número total de cópias por edição
        this.disponiveis = 0; // Número de cópias disponíveis por edição
        this.duracaoTotal = duracaoTotal;
        this.elenco = new ArrayList<>();
        if (estadoConservacao > 2 || estadoConservacao < 0) {
        	System.out.println("Opção de estado de conservação inválida, insira um número de 0 a 2, sendo:"
        			+ "0: novo, 1: usado e 2: danificado.");}
        else { 
        	this.estadoConservacao = estadoConservacao;
        }
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
		this.totalCopias = totalCopias;
	}

	public int getDisponiveis() {
		return disponiveis;
	}

	public void setDisponiveis(int disponiveis) {
		this.disponiveis = disponiveis;
	}

	public int getEstadoConservacao() {
		return estadoConservacao;
	}

	public void setEstadoConservacao(int estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}

    
}