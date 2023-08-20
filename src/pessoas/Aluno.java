package pessoas;

import biblioteca.Biblioteca;
import livro.Exemplar;
import livro.Livro;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    private String ra;
    private int curso; // (pelo código)
    private List<Exemplar> material;

    public Aluno(String nome, String cpf, String ra, int curso) {
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

    public List<Exemplar> getMaterial() {
        return material;
    }

    public void setMaterial(List<Exemplar> material) {
        this.material = material;
    }
    // Função para pegar um livro emprestado. (por hora sem exception handling)
    public void pegarLivro(Biblioteca biblioteca, Livro livro){
        for (int i = 0; i < livro.getExemplares().size(); i++){
            if (livro.getExemplares().get(i).isAvailable()){
                this.material.add(livro.getExemplares().get(i));
                livro.getExemplares().get(i).setAvailable(false);
            }
        }
    }
}
