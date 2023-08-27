package multimidia;

public class DVD extends ItemMultimidia{
	private int duracao; //Duração do conteúdo do DVD em segundos
    public DVD(String titulo, String autor, int duracao) {
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