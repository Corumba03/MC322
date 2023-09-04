package membros.universitario;

public class EstudanteGrad extends Universitario {
    private String curso; // Curso pelo código

    public EstudanteGrad(String nome, String endereco, String contato, String nui, String curso) {
        super(nome, endereco, contato, nui);
        this.curso = curso;
        this.setLimiteEmprestimo(5);
        this.setPrazoEmprestimo(20);
        this.setMulta(1);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
