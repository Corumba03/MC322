package biblioteca.models.membros.universitario;

public class Professor extends Universitario{
	private String instituto;

	public Professor(String nome, String endereco, String contato, String nui, String instituto) {
		super(nome, endereco, contato, nui);
		this.instituto = instituto;
		this.setLimiteEmprestimo(7);
		this.setPrazoEmprestimo(30);
		this.setMulta(0.5);
	}

	public String getInstituto() {
		return instituto;
	}

	public void setInstituto(String instituto) {
		this.instituto = instituto;
	}

}
