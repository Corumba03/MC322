package biblioteca.models;

import biblioteca.models.formularios.Devolucao;
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
    private static List<Membro> membros;
    private static Set<String> categorias;
    private Map<String, ItemMultimidia> itens; // ID como chave
    public static Set<Emprestimo> listaEmprestimos;
    public static Set<Reserva> listaReservas;
    public static Set<Devolucao> listaDevolucoes;
    public Biblioteca(String nome, String inst) {
        this.nome = nome;
        this.inst = inst;
        this.total = 0;
        membros = new ArrayList<>();
        categorias = new HashSet<>();
        List<String> elementos = Arrays.asList("Ciências", "Artes", "Tecnologia", "História", "Literatura", "Matemática", "Música", "Filosofia", "Religião", "Saúde", "Educação", "Esportes", "Geografia");
        categorias.addAll(elementos);
        this.itens = new HashMap<>();
        listaEmprestimos = new HashSet<>();
        listaReservas = new HashSet<>();
        listaDevolucoes = new HashSet<>();
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
        Biblioteca.membros = membros;
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
		Biblioteca.categorias = categorias;
	}
	public Map<String, ItemMultimidia> getItens() {
		return itens;
	}
	public void setItens(Map<String, ItemMultimidia> itens) {
		this.itens = itens;
	}

    public static Set<Emprestimo> getEmprestimos() {
        return listaEmprestimos;
    }

    public static void setEmprestimos(Set<Emprestimo> listaEmprestimos) {
        Biblioteca.listaEmprestimos = listaEmprestimos;
    }

    public static Set<Reserva> getReservas() {
        return listaReservas;
    }

    public static void setReservas(Set<Reserva> listaReservas) {
        Biblioteca.listaReservas = listaReservas;
    }

    public static Set<Emprestimo> getListaEmprestimos() {
        return listaEmprestimos;
    }

    public static void setListaEmprestimos(Set<Emprestimo> listaEmprestimos) {
        Biblioteca.listaEmprestimos = listaEmprestimos;
    }

    public static Set<Reserva> getListaReservas() {
        return listaReservas;
    }

    public static void setListaReservas(Set<Reserva> listaReservas) {
        Biblioteca.listaReservas = listaReservas;
    }

    public static Set<Devolucao> getListaDevolucoes() {
        return listaDevolucoes;
    }

    public static void setListaDevolucoes(Set<Devolucao> listaDevolucoes) {
        Biblioteca.listaDevolucoes = listaDevolucoes;
    }

    public void addReserva(Reserva reserva){
        Biblioteca.listaReservas.add(reserva);
    }
    public void addEmprestimo(Emprestimo emprestimo){
        Biblioteca.listaEmprestimos.add(emprestimo);
    }

    public void addItem(ItemMultimidia item) {
		itens.put(item.getTombo(), item);
	}
    public void addMembro(Membro membro){
        membros.add(membro);
    }

    public void removerMembro(Membro membro){
        membros.remove(membro);
    }

    public void removerMembro(String id){
        for (Membro membro : membros) {
            if (membro.getId().equals(id)) {
                removerMembro(membro);
                break;
            }
        }
    }

    public Membro buscaMembro(String id){
        for (Membro membro : membros){
            if (membro.getId().equals(id)) {
                return membro;
            }
        }
        System.out.println("Membro não encontrado.");
        return null;
    }

}
