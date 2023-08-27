package membros.funcionarios;

public class Administrador extends Funcionario {
	public static final int nivelAcesso = 0;
	
    public Administrador(String name, String cpf, String ID) {
        super(name, cpf, ID);
    }

	public static int getNivelacesso() {
		return nivelAcesso;
	}
    
}
