package pessoas;


public class Membro {
    // Classe que representa uma pessoa genérica, por hora sem função específica
    private String nome;
    private String cpf;

<<<<<<< HEAD:src/pessoas/Membro.java
    public Membro(String name, String cpf) {
        this.name = name;
=======
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
>>>>>>> 7b0ce040d5cee0e9bfefc6124ab78068b6fd1723:src/pessoas/Pessoa.java
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
