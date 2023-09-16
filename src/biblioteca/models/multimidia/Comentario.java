package biblioteca.models.multimidia;

public class Comentario {
    private String membroId;
    private String itemId;
    private String texto;

    public Comentario(String membroId, String itemId, String texto) {
        this.membroId = membroId;
        this.itemId = itemId;
        this.texto = texto;
    }

    public String getMembroId() {
        return membroId;
    }

    public void setMembroId(String membroId) {
        this.membroId = membroId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
