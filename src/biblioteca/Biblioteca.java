package biblioteca;

import membros.Membro;

import java.util.ArrayList;
import java.util.List;

import multimidia.ItemMultimidia;


public class Biblioteca {
    // Classe que representa uma biblioteca
    private String nome;
    private String inst; // Instituto
    private List<ItemMultimidia> acervo;
    private List<Membro> membros;
    private int total; // Total de livros

    public Biblioteca(String nome, String inst) {
        this.nome = nome;
        this.inst = inst;
        this.total = 0;
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

    public List<ItemMultimidia> getAcervo() {
        return acervo;
    }

    public void setAcervo(List<ItemMultimidia> acervo) {
        this.acervo = acervo;
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public void setMembros(List<Membro> membros) {
        this.membros = membros;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private void updateCount(){
        this.total = acervo.size();
    }
    
    public void addItem(ItemMultimidia item){
        this.acervo.add(item);
    }

}
