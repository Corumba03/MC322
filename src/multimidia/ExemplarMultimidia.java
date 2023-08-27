package multimidia;

public class ExemplarMultimidia extends ItemMultimidia{
    // Classe que representa um exemplar de um item multimidia
    private String id;
    private boolean available;

    public ExemplarMultimidia(ItemMultimidia item) {
        super(item.getTitulo(), item.getAutor());
        item.exemplaresMultimidia.add(this);
        this.id = getTombo() + "-" + String.format("%03d", item.exemplaresMultimidia.size());
        this.available = true;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}
