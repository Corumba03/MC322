package biblioteca.models.membros;

import biblioteca.models.Emprestimo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public abstract class Membro {
    // Classe que representa uma pessoa genérica, por hora sem função específica
    private String nome;
    private String endereco;
    private List<String> contatos; // Lista com telefones, e-mails, etc
    private final LocalDate dataRegistro; // Data de registro
    private int limiteEmprestimo; // Limite de empréstimos
    private int prazoEmprestimo; // Prazo limite para empréstimos
    private double multa;
    private List<Emprestimo> emprestimos;

    public Membro(String nome, String endereco, String contato) {
        this.nome = nome;
        this.endereco = endereco;
        this.contatos = new ArrayList<>();
        this.contatos.add(contato);
        this.dataRegistro = LocalDate.now();
        this.emprestimos = new ArrayList<>();
        this.limiteEmprestimo = 1;
        this.prazoEmprestimo = 1;
        this.multa = 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<String> getContatos() {
        return contatos;
    }

    public void setContatos(List<String> contato) {
        this.contatos = contato;
    }

    public void addContato(String contato){
        this.contatos.add(contato);
    }

    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(int limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public int getPrazoEmprestimo() {
        return prazoEmprestimo;
    }

    public void setPrazoEmprestimo(int prazoEmprestimo) {
        this.prazoEmprestimo = prazoEmprestimo;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public void renovarEmprestimo(Emprestimo emprestimo){
        if (!this.emprestimos.contains(emprestimo)){
            System.out.println("O empréstimo requisitado não existe ou não pertence ao usuário.");
            return;
        }
        if (emprestimo.getPrazo().isAfter(LocalDate.now())){
            System.out.println("Data limite para o empréstimo já excedida, acerte quaisquer multas relacionadas antes de renovar o empréstimo.");
        } else {
            emprestimo.setPrazo(emprestimo.getPrazo().plusDays(this.prazoEmprestimo));
        }
    }
}
