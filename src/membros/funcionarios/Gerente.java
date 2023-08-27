package membros.funcionarios;
import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
	private List<Funcionario> equipe; //ID dos funcionários geridos pelo gerente
	public static final int nivelAcesso = 1;
	
    public Gerente(String name, String cpf, String ID) {
        super(name, cpf, ID);
        this.equipe = new ArrayList<>();
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
