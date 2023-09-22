package biblioteca.models.generics;

import java.util.List;

public class ListaReservas<T> {
    private List<T> itens;

    public ListaReservas(List<T> itens) {
        this.itens = itens;
    }

    public List<T> getItens() {
        return itens;
    }

    public void setItens(List<T> itens) {
        this.itens = itens;
    }
}
