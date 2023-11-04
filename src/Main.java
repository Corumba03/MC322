import biblioteca.models.Biblioteca;
import biblioteca.models.multimidia.ItemMultimidia;
import biblioteca.models.multimidia.LivroFisico;


public class Main {
    
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Uma biblioteca", "IC");
        ItemMultimidia itemMultimidia = new LivroFisico("titulo", "autor", "12345", "1", "editor");

    }
}
