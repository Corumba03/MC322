package biblioteca.models.membros.funcionarios;

import biblioteca.models.membros.universitario.EstudanteGrad;
import biblioteca.models.membros.universitario.EstudantePosGrad;
import biblioteca.models.membros.universitario.Professor;

import java.util.Objects;
import java.util.Scanner;

public class Administrador extends Funcionario {

	public Administrador(String nome, String endereco, String contato, String id) {
		super(nome, endereco, contato, id);
		this.setCargo(Cargo.Administrador);
		this.setNivelAcesso(0);
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
