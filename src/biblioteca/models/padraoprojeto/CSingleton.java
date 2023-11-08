package biblioteca.models.padraoprojeto;
public class CSingleton {
    private static CSingleton instancia;
    // Construtor privado Singleton
    private CSingleton () {
    }
    // Função que assegura somente uma instanciação da classe
    public static CSingleton getInstance() {
        if (instancia == null) {
            instancia = new CSingleton();
        }
        return instancia;
    }
}
