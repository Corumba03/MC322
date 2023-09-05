package biblioteca.controllers;

import biblioteca.models.Membro;

import java.util.ArrayList;
import java.util.List;

public class MembroControllerImpl implements MembroController {
    private List<Membro> membros;

    public MembroControllerImpl() {
        membros = new ArrayList<>();
    }

    @Override
    public List<Membro> listarMembros() {
        return membros;
    }

    @Override
    public Membro buscarMembroPorIdentificacao(String identificacao) {
        // Lógica de busca
        return null;
    }
}