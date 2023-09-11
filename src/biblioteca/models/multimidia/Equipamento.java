package biblioteca.models.multimidia;

public class Equipamento {
	public enum CategoriaEquipamento {
		INFORMATICA, AUDIOVISUAL, IMPRESSAO
	}
	
	public class Informatica {
		private final CategoriaEquipamento categoria;
		// TODO Detalhes de computadores, tablets, projetores, etc.

		public Informatica(CategoriaEquipamento categoria) {
			this.categoria = CategoriaEquipamento.INFORMATICA;
		}
	}
	
	public class Audiovisual {
		private final CategoriaEquipamento categoria;
		// TODO Equipamentos como câmeras, microfones, caixas de som, etc.
		public Audiovisual(){
			this.categoria = CategoriaEquipamento.AUDIOVISUAL;
		}
	}
	
	public class Impressao {
		private final CategoriaEquipamento categoria;
		// TODO Impressoras, scanners, copiadoras, etc.
		public Impressao(){
			this.categoria = CategoriaEquipamento.IMPRESSAO;
		}
	}

}
