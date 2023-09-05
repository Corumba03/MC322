package biblioteca.views;

import biblioteca.models.ItemMultimidia;

import java.util.List;

public interface BibliotecaView {
    void mostrarItensDisponiveis(List<ItemMultimidia> itens);
    void mostrarEmprestimoStatus(boolean sucesso);
    void mostrarDevolucaoStatus(boolean sucesso);
}