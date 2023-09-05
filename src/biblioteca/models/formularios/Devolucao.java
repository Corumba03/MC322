package biblioteca.models.formularios;

import java.time.LocalDate;

public class Devolucao {
    private LocalDate dataEsperada; // Data de devolução esperada
    private LocalDate dataDevolucao; // Data de devolução real
    private int estadoDevolucao; // Estado de conservação do item quando devolvido

    public Devolucao(int estadoDevolucao, LocalDate dataEsperada) {
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

    public int getEstadoDevolucao() {
        return estadoDevolucao;
    }

    public void setEstadoDevolucao(int estadoDevolucao) {
        this.estadoDevolucao = estadoDevolucao;
    }
}
