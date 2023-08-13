package biblioteca;

import livro.Livro;
import pessoas.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    // Classe que representa uma biblioteca
    private String nome;
    private String inst; // Instituto
    private List<Livro> acervo;
    private List<Pessoa> membros;
    private short count; // Total de livros

    public Biblioteca(String nome, String inst) {
        this.nome = nome;
        this.inst = inst;
        this.count = 0;
        this.acervo = new ArrayList<>();
        this.membros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInst() {
        return inst;
    }

    public void setInst(String inst) {
        this.inst = inst;
    }

    public List<Livro> getAcervo() {
        return acervo;
    }

    public void setAcervo(List<Livro> acervo) {
        this.acervo = acervo;
    }

    public List<Pessoa> getMembros() {
        return membros;
    }

    public void setMembros(List<Pessoa> membros) {
        this.membros = membros;
    }

    public short getCount() {
        return count;
    }

    public void setCount(short count) {
        this.count = count;
    }

    private void updateCount(){
        this.count = (short) acervo.size();
    }

}
