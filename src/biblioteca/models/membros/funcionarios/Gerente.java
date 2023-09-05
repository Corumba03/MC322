package biblioteca.models.membros.funcionarios;
import java.util.List;

public class Gerente extends Funcionario {
	private List<Funcionario> equipe; //ID dos funcionários geridos pelo gerente
	public static final int nivelAcesso = 1;

	public Gerente(String nome, String endereco, String contato, String id, List<Funcionario> equipe) {
		super(nome, endereco, contato, id);
		this.equipe = equipe;
		this.setCargo(Cargo.Gerente);
		this.setNivelAcesso(1);
	}

	public List<Funcionario> getEquipe() {
		return equipe;
	}
	public void setEquipe(List<Funcionario> equipe) {
		this.equipe = equipe;
	}
	public static int getNivelacesso() {
		return nivelAcesso;
	}
    
}
