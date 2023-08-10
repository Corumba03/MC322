package livro;

import pessoas.Pessoa;

public class Professor extends Pessoa {
    private String id; // "RA de professor"
    private String inst; // Instituto
    private String grad; // Curso de graduação
    private String post_grad; // Curso de pós (se houver)

    public Professor(String name, String cpf, String id, String inst, String grad) {
        super(name, cpf);
        this.id = id;
        this.inst = inst;
        this.grad = grad;
        this.post_grad = null;
    }

    public Professor(String name, String cpf, String id, String inst, String grad, String post_grad) {
        super(name, cpf);
        this.id = id;
        this.inst = inst;
        this.grad = grad;
        this.post_grad = post_grad;
    }
}
