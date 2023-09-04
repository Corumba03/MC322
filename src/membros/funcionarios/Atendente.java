package membros.funcionarios;


public class Atendente extends Funcionario {
	private String gestor; //ID do gerente responsável
	public static final int nivelAcesso = 2;
	
    public Atendente(String name, String cpf, String ID, String gestor) {
        super(name, cpf, ID);
        this.gestor = gestor;
    }

	public String getGestor() {
		return gestor;
	}

	public void setGestor(String gestor) {
		this.gestor = gestor;
	}

	public int getNivelAcesso() {
		return nivelAcesso;
	}

}
