package biblioteca;

import membros.Membro;
import membros.funcionarios.Funcionario;

import java.util.Date;

public class Emprestimo {
    private Funcionario operador; // Quem realizou o empréstimo
    private Membro dono; // Quem pediu o empréstimo
    private Date criacao; // Data de criação
    private Date deadline; // Data limite
    private int extensionsCount; // Quantidade de extensões de deadline realizadas
    private RenovacaoReserva[] extensions; // Extensões realizadas
    
}
