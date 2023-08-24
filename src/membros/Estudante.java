package membros;

import biblioteca.Biblioteca;
import multimidia.Exemplar;
import multimidia.Livro;

import java.util.ArrayList;
import java.util.List;

public abstract class Estudante extends Membro{
    private String ra;
    private int curso; // (pelo código)
    private List<Exemplar> material;

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