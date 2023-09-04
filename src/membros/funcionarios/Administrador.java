package membros.funcionarios;

import membros.universitario.EstudanteGrad;
import membros.universitario.EstudantePosGrad;
import membros.universitario.Professor;

import java.util.Objects;
import java.util.Scanner;

public class Administrador extends Funcionario {
	public static final int nivelAcesso = 0;
	
    public Administrador(String name, String cpf, String ID) {
        super(name, cpf, ID);
    }

	public static int getNivelacesso() {
		return nivelAcesso;
	}

	public void cadastrarMembro(String tipo, String nome, String endereco, String contato, String nui){
		Scanner input = new Scanner(System.in);
		if (Objects.equals(tipo, "EstudanteGrad")){
			System.out.println("Insira o curso: ");
			String curso = input.nextLine();
			EstudanteGrad novoEstudante = new EstudanteGrad(nome, endereco, contato, nui, curso);
		} else if (Objects.equals(tipo, "EstudantePosGrad") ){
			System.out.println("Insira o curso: ");
			String curso = input.nextLine();
			EstudantePosGrad novoEstudante = new EstudantePosGrad(nome, endereco, contato, nui, curso);

		} else if (Objects.equals(tipo, "Professor")){
			System.out.println("Insira o instituto: ");
			String inst = input.nextLine();
			Professor novoProf = new Professor(nome, endereco, contato, nui, inst);
		}
	}
    
}
