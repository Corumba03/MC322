package membros.funcionarios;

import membros.Membro;

public abstract class Funcionario extends Membro {
	private String ID; //código exclusivo do funcionário para controle interno
	
	public Funcionario(String name, String cpf, String ID) {
		super(name, cpf);
		this.ID = ID;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

}
