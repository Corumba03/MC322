package biblioteca.models.relatorios;



import java.time.LocalDate;

public abstract class Relatorio {
    private LocalDate ultimaMod;  // Data da última modificação

    public Relatorio() {
        this.ultimaMod = LocalDate.now();
    }

    public LocalDate getUltimaMod() {
        return ultimaMod;
    }

    public void setUltimaMod(LocalDate ultimaMod) {
        this.ultimaMod = ultimaMod;
    }
}
