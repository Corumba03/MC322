package membros;


public abstract class Membro {
    // Classe que representa uma pessoa genérica, por hora sem função específica
    private String nome;
    private String cpf;
    
    public Membro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
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

}
