package biblioteca.controllers;

import biblioteca.models.Membro;

import java.util.List;

public interface MembroController {
    List<Membro> listarMembros();
    Membro buscarMembroPorIdentificacao(String identificacao);
}