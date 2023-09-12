package biblioteca.models.multimidia;

public class Equipamento {
	public enum CategoriaEquipamento {
		INFORMATICA, AUDIOVISUAL, IMPRESSAO
	}

	// Detalhes de computadores, tablets, projetores, etc.
	public class Informatica {
		private final CategoriaEquipamento categoria;
		public Informatica(CategoriaEquipamento categoria) {
			this.categoria = CategoriaEquipamento.INFORMATICA;
		}
		
		public CategoriaEquipamento getCategoria() {
			return categoria;
		}
	}
	
	// Equipamentos como câmeras, microfones, caixas de som, etc.
	public class Audiovisual {
		private final CategoriaEquipamento categoria;
		public Audiovisual(){
			this.categoria = CategoriaEquipamento.AUDIOVISUAL;
		}
		
		public CategoriaEquipamento getCategoria() {
			return categoria;
		}
	}
	
	// Impressoras, scanners, copiadoras, etc.
	public class Impressao {
		private final CategoriaEquipamento categoria;
		public Impressao(){
			this.categoria = CategoriaEquipamento.IMPRESSAO;
		}
		
		public CategoriaEquipamento getCategoria() {
			return categoria;
		}
	}

}