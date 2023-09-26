package biblioteca.models.formularios;

import biblioteca.models.multimidia.EstadoConservacao;

import java.time.LocalDate;

public class Devolucao {
    private LocalDate dataEsperada; // Data de devolução esperada
    private LocalDate dataDevolucao; // Data de devolução real
    private EstadoConservacao estadoDevolucao; // Estado de conservação do item quando devolvido

    public Devolucao(EstadoConservacao estadoDevolucao, LocalDate dataEsperada) {
        this.estadoDevolucao = estadoDevolucao;
        this.dataEsperada = dataEsperada;
        this.dataDevolucao = LocalDate.now();
    }
    public LocalDate getDataEsperada() {
        return dataEsperada;
    }

    public void setDataEsperada(LocalDate dataEsperada) {
        this.dataEsperada = dataEsperada;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public EstadoConservacao getEstadoDevolucao() {
        return estadoDevolucao;
    }

    public void setEstadoDevolucao(EstadoConservacao estadoDevolucao) {
        this.estadoDevolucao = estadoDevolucao;
    }
}
