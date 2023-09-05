package biblioteca.models.membros.funcionarios;


public class Atendente extends Funcionario {
	private Gerente gestor;
	public static final int nivelAcesso = 2;

	public Atendente(String nome, String endereco, String contato, String id, Gerente gestor) {
		super(nome, endereco, contato, id);
		this.gestor = gestor;
		this.setCargo(Cargo.Atendente);
		this.setNivelAcesso(2);
	}

	public Gerente getGestor() {
		return gestor;
	}

	public void setGestor(Gerente gestor) {
		this.gestor = gestor;
	}

	public int getNivelAcesso() {
		return nivelAcesso;
	}

}
