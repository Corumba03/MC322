package biblioteca.models.membros;

import bibexceptions.*;
import biblioteca.models.Disponibilidade;
import biblioteca.models.Sala;
import biblioteca.models.formularios.Devolucao;
import biblioteca.models.formularios.Emprestimo;
import biblioteca.models.formularios.Multa;
import biblioteca.models.multimidia.EstadoConservacao;
import biblioteca.models.multimidia.ItemMultimidia;
import biblioteca.models.multimidia.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public abstract class Membro {
    // Classe que representa uma pessoa genérica, por hora sem função específica
    private String nome;
    private String id; //código exclusivo do membro para controle interno
    private String endereco;
    private List<String> contatos; // Lista com telefones, e-mails, etc
    private final LocalDateTime dataRegistro; // Data de registro
    private int limiteEmprestimo; // Limite de empréstimos
    private int prazoEmprestimo; // Prazo limite para empréstimos
    private double multa;
    private List<Emprestimo> listaEmprestimos;
    private List<Multa> listaMultas;

    public Membro(String nome, String endereco, String contato) {
        this.nome = nome;
        this.endereco = endereco;
        this.contatos = new ArrayList<>();
        this.contatos.add(contato);
        this.dataRegistro = LocalDateTime.now();
        this.listaEmprestimos = new ArrayList<>();
        this.listaMultas = new ArrayList<>();
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

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public List<Emprestimo> getEmprestimos() {
        return listaEmprestimos;
    }

    public void setEmprestimos(List<Emprestimo> listaEmprestimos) {
        this.listaEmprestimos = listaEmprestimos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Emprestimo> getListaEmprestimos() {
        return listaEmprestimos;
    }

    public void setListaEmprestimos(List<Emprestimo> listaEmprestimos) {
        this.listaEmprestimos = listaEmprestimos;
    }

    public List<Multa> getListaMultas() {
        return listaMultas;
    }

    public void setListaMultas(List<Multa> listaMultas) {
        this.listaMultas = listaMultas;
    }

    public void fazerEmprestimo(Membro membro, ItemMultimidia item){
        try {
            // Caso o limite de empréstimos já tenha sido atingido
            if (this.listaEmprestimos.size() == this.limiteEmprestimo){
                throw new LimiteExcedidoException("Limite de empréstimos já atingido.");
            } else if (item.getStatus() != Status.DISPONIVEL) {
                throw new ItemIndisponivelException("Item indisponível para emprestímo no momento.");
            } else if (!this.listaMultas.isEmpty()) {
                throw new MultasPendentesException("Podem haver multas pendentes.");
            }
            Emprestimo novoEmprestimo = new Emprestimo(this, item);
            this.listaEmprestimos.add(novoEmprestimo);
            System.out.println("Empréstimo realizado com sucesso.");
        }
        catch (LimiteExcedidoException | ItemIndisponivelException | MultasPendentesException e){
            System.err.println("Erro ao realizar empréstimo: " + e.getMessage());
        }
    }
    public void renovarEmprestimo(Emprestimo emprestimo){ // TODO re-implementar utilizando Exceptions
        if (!this.listaEmprestimos.contains(emprestimo)){
            System.out.println("O empréstimo requisitado não existe ou não pertence ao usuário.");
            return;
        }
        if (emprestimo.getPrazo().isAfter(LocalDate.now())){
            System.out.println("Data limite para o empréstimo já excedida, acerte quaisquer multas relacionadas antes de renovar o empréstimo.");
        } else {
            emprestimo.setPrazo(emprestimo.getPrazo().plusDays(this.prazoEmprestimo));
        }
    }

    public void devolverItem(Emprestimo emprestimo){
        try {
            if (!this.listaEmprestimos.contains(emprestimo)){
                throw new ArgumentoInvalidoException("Item não consta na lista de empréstimos do usuário.");
            }
            else if (emprestimo.getItem().getEstadoConservacao() == EstadoConservacao.Danificado){
                throw new ItemDanificadoException("Item danificado.");
            }

            Devolucao novaDevolucao = new Devolucao(emprestimo.getItem().getEstadoConservacao(), emprestimo.getPrazo()); // TODO adicionar esse objeto a lista de devoluções na biblioteca
            this.listaEmprestimos.remove(emprestimo);
        }
        catch (ArgumentoInvalidoException | ItemDanificadoException e){
            System.err.println("Erro ao devolver item: " + e.getMessage());
        }
    }

    public void reservarSala(Sala sala, int numPessoas){
        try {
            if (sala.getDisponibilidade() != Disponibilidade.Disponivel){
                throw new SalaIndisponivelException("Sala indisponível no momento.");
            }
            else if (sala.getCapacidadeMax() < numPessoas){
                throw new LimiteExcedidoException("O número de pessoas excede a capacidade máxima da sala");
            }
        }
        catch (SalaIndisponivelException | LimiteExcedidoException e){
            System.err.println("Erro ao reservar sala: " + e.getMessage());
        }
    }
}
