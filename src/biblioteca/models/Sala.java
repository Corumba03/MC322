package biblioteca.models;

public class Sala {
    private Disponibilidade disponibilidade;
    private int capacidadeMax;

    public Sala(int capacidade) {
        this.disponibilidade = Disponibilidade.Disponivel;
        this.capacidadeMax = capacidade;
    }

    public Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }
}
