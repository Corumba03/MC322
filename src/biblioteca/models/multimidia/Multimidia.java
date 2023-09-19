package biblioteca.models.multimidia;

import java.time.Duration;

public class Multimidia {

	public enum Formato {
		AUDIO, VIDEO, SOFTWARE
	}

	// Detalhes de CDs, podcasts, gravações de palestras, etc.
	public class Audio {
		private final Formato formato;
		private Duration duracao;
		public Audio(Duration duracao) {
			this.formato = Formato.AUDIO;
			this.duracao = duracao;
		}
		
		public Formato getFormato() {
			return formato;
		}

		public Duration getDuracao() {
			return duracao;
		}

		public void setDuracao(Duration duracao) {
			this.duracao = duracao;
		}
	}
	
	// DVDs, gravações de aulas, documentários, etc.
	public class Video {
		private final Formato formato;
		private Duration duracao;
		public Video(Duration duracao){
			this.formato = Formato.VIDEO;
			this.duracao = duracao;
		}
		
		public Formato getFormato() {
			return formato;
		}

		public Duration getDuracao() {
			return duracao;
		}

		public void setDuracao(Duration duracao) {
			this.duracao = duracao;
		}
	}
	
	// Softwares educacionais, programas de simulação, etc.
	public class Software {
		private final Formato formato;
		public Software(){
			this.formato = Formato.SOFTWARE;
		}
		
		public Formato getFormato() {
			return formato;
		}
	}
}
