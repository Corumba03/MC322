import livro.Exemplar;
import livro.Livro;
import pessoas.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Biblioteca {
    private String nome;
    private String inst; // Instituto
    private List<Livro> acervo;
    private List<Pessoa> membros;
    private short count; // Total de livros

    public Biblioteca(String nome, String inst) {
        this.nome = nome;
        this.inst = inst;
        this.count = 0;
        this.acervo = new ArrayList<>();
        this.membros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInst() {
        return inst;
    }

    public void setInst(String inst) {
        this.inst = inst;
    }

    public List<Livro> getAcervo() {
        return acervo;
    }

    public void setAcervo(List<Livro> acervo) {
        this.acervo = acervo;
    }

    public List<Pessoa> getMembros() {
        return membros;
    }

    public void setMembros(List<Pessoa> membros) {
        this.membros = membros;
    }

    public short getCount() {
        return count;
    }

    public void setCount(short count) {
        this.count = count;
    }

    private void updateCount(){
        this.count = (short) acervo.size();
    }

    public void addLivro(String title, String author, String isbn){
        short index = -1;
        // Olha entre todos os livros da biblioteca, se já houver algum livro igual marca seu index
        for (short i = 0; i < acervo.size(); i++){
            if (Objects.equals(acervo.get(i).getIsbn(), isbn)){
                index = i;
                break;
            }
        }
        // Se foi detectado o livro no sistema, apenas adiciona um exemplar deste livro, caso contrário adiciona o livro e este exemplar no sistema
        if (index != -1){
            Exemplar novoExemplar = new Exemplar(acervo.get(index));
        } else {
            Livro novoLivro = new Livro(title, author, isbn);
            Exemplar novoExemplar = new Exemplar(novoLivro);
            acervo.add(novoLivro);
            this.updateCount();
        }
    }
}
