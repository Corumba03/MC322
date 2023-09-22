package biblioteca.models.generics;


import java.util.List;

public class ItemBiblioteca<T>{
    private List<T> itensReservados; // Lista genérica de itens reservados
    private List<T> itensEmprestados; // Lista genérica de itens emprestados
    private int numeroDeItensReservados;
    private int numeroDeItensEmprestados;

    public ItemBiblioteca(List<T> itensReservados, List<T> itensEmprestados) {
        this.itensReservados = itensReservados;
        this.itensEmprestados = itensEmprestados;
        this.numeroDeItensEmprestados = itensEmprestados.size();
        this.numeroDeItensReservados = itensReservados.size();
    }

    public List<T> getItensReservados() {
        return itensReservados;
    }

    public void setItensReservados(List<T> itensReservados) {
        this.itensReservados = itensReservados;
    }

    public List<T> getItensEmprestados() {
        return itensEmprestados;
    }

    public void setItensEmprestados(List<T> itensEmprestados) {
        this.itensEmprestados = itensEmprestados;
    }

    public int getNumeroDeItensReservados() {
        return numeroDeItensReservados;
    }

    public void setNumeroDeItensReservados(int numeroDeItensReservados) {
        this.numeroDeItensReservados = numeroDeItensReservados;
    }

    public int getNumeroDeItensEmprestados() {
        return numeroDeItensEmprestados;
    }

    public void setNumeroDeItensEmprestados(int numeroDeItensEmprestados) {
        this.numeroDeItensEmprestados = numeroDeItensEmprestados;
    }

    public void emprestarItem(T item){
        this.itensEmprestados.add(item);
    }
    public void reservarItem(T item){
        this.itensReservados.add(item);
    }

    public void devolverItem(T item){
        if (this.itensEmprestados.contains(item)){
            this.itensEmprestados.remove(item);
            System.out.println("Item devolvido");
        }
    }
}
