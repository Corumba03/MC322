package biblioteca.models.generics;

import java.util.ArrayList;
import java.util.List;

public class ListaReservas<T> {
    private List<T> itens;

    public ListaReservas() {
        this.itens = new ArrayList<>();
    }

    public List<T> getItens() {
        return itens;
    }

    public void setItens(List<T> itens) {
        this.itens = itens;
    }
    public void addReserva(T reserva){
        this.itens.add(reserva);
    }
}
