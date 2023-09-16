package biblioteca.models;

import biblioteca.models.formularios.Emprestimo;
import biblioteca.models.formularios.Reserva;
import biblioteca.models.membros.Membro;
import biblioteca.models.multimidia.ItemMultimidia;

import java.util.*;

public class Biblioteca {
    // Classe que representa uma biblioteca
    private String nome;
    private String inst; // Instituto
    private int total; // Total de livros
    private List<Membro> membros;
    private Set<String> categorias;
    private Map<String, ItemMultimidia> itens;
    private Set<Emprestimo> emprestimos;
    private List<Reserva> reservas;
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
	public void addItem(ItemMultimidia item) {
		itens.put(item.getTombo(), item);
	}
    public void addMembro(Membro membro){
        this.membros.add(membro);
    }

    public void removerMembro(Membro membro){
        this.membros.remove(membro);
    }

    public void removerMembro(String id){
        for (Membro membro : membros) {
            if (membro.getId().equals(id)) {
                removerMembro(membro);
                break;
            }
        }
    }

    public Membro getMembro(String id){
        for (Membro membro : membros){
            if (membro.getId().equals(id)) {
                return membro;
            }
        }
        System.out.println("Membro não encontrado.");
        return null;
    }

}
