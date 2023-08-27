package membros;

import java.util.ArrayList;

public class Professor extends Membro{
	private String instituto;
	private String titulo; //Ex: Professor Doutor I
	
    public Professor(String nome, String cpf, String instituto, String titulo) {
        super(nome, cpf);
        this.instituto = instituto;
        this.titulo = titulo;
    }

	public String getInstituto() {
		return instituto;
	}

	public void setInstituto(String instituto) {
		this.instituto = instituto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
