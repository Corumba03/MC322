package biblioteca.models.padraoprojeto;

public interface Observer {
    // Método chamado quando o estado do sujeito é alterado
    void update(String message);
}