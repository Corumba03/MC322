package biblioteca.models.padraoprojeto;
import biblioteca.models.multimidia.*;

public class CItemMultimidiaFactory<T> {
    public ItemMultimidia criarCD() {
        return new CD();
    }
    public ItemMultimidia criarDVD() {
        return new DVD();
    }
    public ItemMultimidia criarEbook() {
        return new Ebook();
    }
    public ItemMultimidia criarOutros() {
        return new Outros();
    }
    public ItemMultimidia criarLivroFisico() {
        return new LivroFisico();
    }
}
