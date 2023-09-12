package biblioteca.models.multimidia;

public class Multimidia {

	public enum FormatoMultimidia {
		AUDIO, VIDEO, SOFTWARE
	}
	
	// Detalhes de CDs, podcasts, gravações de palestras, etc.
	public class Audio {
		private final FormatoMultimidia formato;
		public Audio() {
			this.formato = FormatoMultimidia.AUDIO;
		}
		
		public FormatoMultimidia getFormato() {
			return formato;
		}
	}
	
	// DVDs, gravações de aulas, documentários, etc.
	public class Video {
		private final FormatoMultimidia formato;
		public Video(){
			this.formato = FormatoMultimidia.VIDEO;
		}
		
		public FormatoMultimidia getFormato() {
			return formato;
		}
	}
	
	// Softwares educacionais, programas de simulação, etc.
	public class Software {
		private final FormatoMultimidia formato;
		public Software(){
			this.formato = FormatoMultimidia.SOFTWARE;
		}
		
		public FormatoMultimidia getFormato() {
			return formato;
		}
	}
}
