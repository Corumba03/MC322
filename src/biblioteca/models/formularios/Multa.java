package biblioteca.models.formularios;

import biblioteca.models.membros.Membro;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Multa {
    private Membro usuario; // Usuário que precisa pagar a multa
    private double valor; // Valor da multa
    private boolean pendente; // Indicador de se a multa já foi paga
    private LocalDate criacao;

    public Multa(Membro usuario) {
        this.usuario = usuario;
        this.criacao = LocalDate.now();
        this.pendente = true;
        this.valor = usuario.getMulta();
    }

    public Membro getUsuario() {
        return usuario;
    }

    public void setUsuario(Membro usuario) {
        this.usuario = usuario;
    }

    public double getValor() {
        this.valor = DAYS.between(this.criacao, LocalDate.now()) * this.usuario.getMulta(); // Atualiza o valor primeiro
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPendente() {
        return pendente;
    }

    public void setPendente(boolean pendente) {
        this.pendente = pendente;
    }

    public LocalDate getCriacao() {
        return criacao;
    }

    public void setCriacao(LocalDate criacao) {
        this.criacao = criacao;
    }
}
