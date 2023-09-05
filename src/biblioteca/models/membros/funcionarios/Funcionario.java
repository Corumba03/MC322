package biblioteca.models.membros.funcionarios;

import biblioteca.models.membros.Membro;

public abstract class Funcionario extends Membro {
	enum Cargo{
		Administrador, Atendente, Gerente
	}
	private String id; //código exclusivo do funcionário para controle interno
	private Cargo cargo; // Cargo do funcionário
	private int nivelAcesso; // 0: maior nível de acesso;  // TODO passar este atributo para Membro

	public Funcionario(String nome, String endereco, String contato, String id) {
		super(nome, endereco, contato);
		this.id = id;
		this.cargo = Cargo.Atendente;
		this.nivelAcesso = 5;
	}

	public String getid() {
		return id;
	}

	public void setid(String iD) {
		id = iD;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Funcionario.Cargo getCargo() {
		return cargo;
	}

	protected void setCargo(Funcionario.Cargo cargo) {
		this.cargo = cargo;
	}

	public int getNivelAcesso() {
		return nivelAcesso;
	}

	protected void setNivelAcesso(int nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
}
