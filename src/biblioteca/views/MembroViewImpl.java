package biblioteca.views;

import biblioteca.controllers.MembroController;
import biblioteca.models.Membro;

import java.util.List;

public class MembroViewImpl implements MembroView {
    private MembroController membroController;

    public MembroViewImpl(MembroController controller) {
        membroController = controller;
    }

    @Override
    public void mostrarListaMembros(List<Membro> membros) {
        // Implementação da exibição da lista de membros
    }

    @Override
    public void mostrarDetalhesMembro(Membro membro) {
        // Implementação da exibição dos detalhes de um membro
    }
}