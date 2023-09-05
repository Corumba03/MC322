package biblioteca.controllers;

import biblioteca.models.ItemMultimidia;
import biblioteca.models.Membro;

import java.util.List;

public interface BibliotecaController {
    List<ItemMultimidia> consultarItensDisponiveis();
    boolean emprestarItem(Membro membro, ItemMultimidia item);
    boolean devolverItem(Membro membro, ItemMultimidia item);
}