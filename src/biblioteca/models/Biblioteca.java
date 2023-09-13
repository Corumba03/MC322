package biblioteca.models;

import biblioteca.models.membros.Membro;
import biblioteca.models.multimidia.ItemMultimidia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Biblioteca {
    // Classe que representa uma biblioteca
    private String nome;
    private String inst; // Instituto
    private int total; // Total de livros
    private List<Membro> membros;
    private Set<String> categorias;
    private Map<String, ItemMultimidia> itens;
    public Biblioteca(String nome, String inst) {
        this.nome = nome;
        this.inst = inst;
        this.total = 0;
        this.membros = new ArrayList<>();
        this.categorias = new HashSet<>();
        List<String> elementos = Arrays.asList("Ciências", "Artes", "Tecnologia", "História", "Literatura", "Matemática", "Música", "Filosofia", "Religião", "Saúde", "Educação", "Esportes", "Geografia");
        categorias.addAll(elementos);
        this.itens = new HashMap<>();
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
	public Set<String> getCategorias() {
		return categorias;
	}
	public void setCategorias(Set<String> categorias) {
		this.categorias = categorias;
	}
	public Map<String, ItemMultimidia> getItens() {
		return itens;
	}
	public void setItens(Map<String, ItemMultimidia> itens) {
		this.itens = itens;
	}
	public void adicionarItem(ItemMultimidia item) {
		itens.put(item.getTombo(), item);
	}

}
