package biblioteca.views;

import biblioteca.models.Membro;

import java.util.List;

public interface MembroView {
    void mostrarListaMembros(List<Membro> membros);
    void mostrarDetalhesMembro(Membro membro);
}