package biblioteca.models.relatorios;



import java.time.LocalDateTime;

public abstract class Relatorio {
    private LocalDateTime ultimaMod;  // Data da última modificação

    public Relatorio() {
        this.ultimaMod = LocalDateTime.now();
    }

    public LocalDateTime getUltimaMod() {
        return ultimaMod;
    }

    public void setUltimaMod(LocalDateTime ultimaMod) {
        this.ultimaMod = ultimaMod;
    }
}
