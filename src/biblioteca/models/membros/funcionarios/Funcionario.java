package biblioteca.models.membros.funcionarios;

import bibexceptions.AcessoNegadoException;
import bibexceptions.ItemInvalidoException;
import biblioteca.models.Biblioteca;
import biblioteca.models.membros.Membro;
import biblioteca.models.multimidia.ItemMultimidia;

public abstract class Funcionario extends Membro {
	public enum Cargo{
		Administrador, Atendente, Gerente
	}
	private Cargo cargo; // Cargo do funcionário
	private int nivelAcesso; // 0: maior nível de acesso;  // TODO passar este atributo para Membro

	public Funcionario(String nome, String endereco, String contato, String id) {
		super(nome, endereco, contato);
		this.cargo = Cargo.Atendente;
		this.nivelAcesso = 5; // Número arbitrátrio que garante que um "funcionário genérico" não tenha permissões
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

	public void cadastrarItem(ItemMultimidia item, Biblioteca biblioteca){

		try {
			if (this.nivelAcesso > 1){ // Menos que um gerente
				throw new AcessoNegadoException("Permissão insuficiente para cadastrar item.");
			}
			if (biblioteca.getItens().containsKey(item.getTombo())){
				throw new ItemInvalidoException("ID já consta na base de dados");
			}
			biblioteca.addItem(item);
			System.out.println("Item cadastrado com sucesso.");
		} catch (AcessoNegadoException | ItemInvalidoException e){
			System.err.println("Erro ao cadastrar item:" + e.getMessage());
		}
	}
}
