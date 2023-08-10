package pessoas;

public class Aluno extends Pessoa{
    private String ra;
    private byte curso; // (pelo código)

    public Aluno(String name, String cpf, String ra, byte curso) {
        super(name, cpf);
        this.ra = ra;
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public byte getCurso() {
        return curso;
    }

    public void setCurso(byte curso) {
        this.curso = curso;
    }
}
