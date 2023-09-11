package biblioteca.models.multimidia;

public class Multimidia {

	public enum FormatoMultimidia {
		AUDIO, VIDEO, SOFTWARE
	}
	
	public class Audio {
		private final FormatoMultimidia formato;

		public Audio() {
			this.formato = FormatoMultimidia.AUDIO;
		}
	}
	
	public class Video {
		private final FormatoMultimidia formato;

		public Video(){
			this.formato = FormatoMultimidia.VIDEO;
		}
	}
	
	public class Software {
		private final FormatoMultimidia formato;
		public Software(){
			this.formato = FormatoMultimidia.SOFTWARE;
		}
	}
}
