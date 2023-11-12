package biblioteca.models.padraoprojeto;
import biblioteca.models.multimidia.*;

import java.time.Duration;

public class CItemMultimidiaFactory<T> {
    public CD criarCD(String titulo, String autor, Duration duracaoTotal) {
        return new CD(titulo, autor, duracaoTotal);
    }
    public DVD criarDVD(String titulo, String autor, Duration duracaoTotal) {
        return new DVD(titulo, autor, duracaoTotal);
    }
    public Ebook criarEbook(String titulo, String autor, String ISBN, String edicao, String editora, double tamanho, String formato, String url, String requisitosLeitura) {
        return new Ebook(titulo, autor, ISBN, edicao, editora, tamanho, formato, url, requisitosLeitura);
    }
    public Outros criarOutros(String titulo, String autor, String localizacao, String tipoRecurso, String formato) {
        return new Outros(titulo, autor, localizacao, tipoRecurso, formato);
    }
    public LivroFisico criarLivroFisico(String titulo, String autor, String ISBN, String edicao, String editora) {
        return new LivroFisico(titulo, autor, ISBN, edicao, editora);
    }
}
