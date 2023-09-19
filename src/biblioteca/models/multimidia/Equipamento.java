package biblioteca.models.multimidia;

public class Equipamento {
	public enum CategoriaEquipamento {
		PROJETOR, COMPUTADOR, TABLET
	}
	private String marca;
	private String modelo;

	private CategoriaEquipamento tipo;

	public Equipamento(String marca, String modelo, CategoriaEquipamento tipo) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public CategoriaEquipamento getTipo() {
		return tipo;
	}

	public void setTipo(CategoriaEquipamento tipo) {
		this.tipo = tipo;
	}
}