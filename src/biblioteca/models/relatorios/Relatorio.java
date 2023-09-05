package biblioteca.models.relatorios;

import biblioteca.models.membros.Membro;

import java.time.LocalDate;

public abstract class Relatorio {
    private Membro membro;  // Membro ao qual o relatório está relacionado
    private LocalDate ultimaMod;  // Data da última modificação

    public Relatorio(Membro membro) {
        this.membro = membro;
        this.ultimaMod = LocalDate.now();
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public LocalDate getUltimaMod() {
        return ultimaMod;
    }

    public void setUltimaMod(LocalDate ultimaMod) {
        this.ultimaMod = ultimaMod;
    }
}
