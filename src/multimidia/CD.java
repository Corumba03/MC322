package multimidia;

public class CD extends ItemMultimidia{
	private int duracao; //Duração do conteúdo do CD em segundos
    public CD(String titulo, String autor, int duracao) {
        super(titulo, autor);
        this.duracao = duracao;
    }
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
    
}
