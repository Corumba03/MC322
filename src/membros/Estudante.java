package membros;

import biblioteca.Biblioteca;
import multimidia.ExemplarLivro;
import multimidia.Livro;

import java.util.ArrayList;
import java.util.List;

public abstract class Estudante extends Membro{
    private String ra;
    private int curso; // (pelo código)
    private List<ExemplarLivro> material;

    public Estudante(String nome, String cpf, String ra, int curso) {
        super(nome, cpf);
        this.ra = ra;
        this.curso = curso;
        this.material = new ArrayList<>();
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public List<ExemplarLivro> getMaterial() {
        return material;
    }

    public void setMaterial(List<ExemplarLivro> material) {
        this.material = material;
    }
    // Função para pegar um livro emprestado. (por hora sem exception handling)
    public void pegarLivro(Biblioteca biblioteca, Livro livro){
        for (int i = 0; i < livro.getExemplaresLivro().size(); i++){
            if (livro.getExemplaresLivro().get(i).isAvailable()){
                this.material.add(livro.getExemplaresLivro().get(i));
                livro.getExemplaresLivro().get(i).setAvailable(false);
            }
        }
    }
}
