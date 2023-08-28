package membros;
import biblioteca.Emprestimo;

import java.util.ArrayList;
import java.util.List;


public abstract class Membro {
    // Classe que representa uma pessoa genérica, por hora sem função específica
    private String nome;
    private String cpf;
    private List<Emprestimo> emprestimos;  // Lista de empréstimos
    public Membro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.emprestimos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public void retirarItem(Emprestimo emprestimo){
        this.emprestimos.add(emprestimo);
    }
}
