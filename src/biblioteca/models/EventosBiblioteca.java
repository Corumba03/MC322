package biblioteca.models;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class EventosBiblioteca {
	public enum TipoDeEvento {
		PALESTRA, WORKSHOP, EXPOSICAO
	}
	
	public class Palestra {
		private final TipoDeEvento tipo;
		private String palestrante;
		private String topico;
		private LocalDateTime data;
		private LocalTime horario;
		private Duration duracao;
		private String local;
		public Palestra(String palestrante, String topico, LocalDateTime data, LocalTime horario, String local) {
			super();
			this.tipo = TipoDeEvento.PALESTRA;
			this.palestrante = palestrante;
			this.topico = topico;
			this.data = data;
			this.horario = horario;
			this.local = local;
		}
		public String getPalestrante() {
			return palestrante;
		}
		public void setPalestrante(String palestrante) {
			this.palestrante = palestrante;
		}
		public String getTopico() {
			return topico;
		}
		public void setTopico(String topico) {
			this.topico = topico;
		}
		public LocalDateTime getData() {
			return data;
		}
		public void setData(LocalDateTime data) {
			this.data = data;
		}
		public LocalTime getHorario() {
			return horario;
		}
		public void setHorario(LocalTime horario) {
			this.horario = horario;
		}
		public String getLocal() {
			return local;
		}
		public void setLocal(String local) {
			this.local = local;
		}
		public Duration getDuracao() {
			return duracao;
		}
		public void setDuracao(Duration duracao) {
			this.duracao = duracao;
		}
		public TipoDeEvento getTipo() {
			return tipo;
		}
	}
	
	public class Workshop {
		private final TipoDeEvento tipo;
		private String infoInstrutor;
		private List<String> materiaisNecessarios;
		private String topico;
		private LocalDateTime data;
		private LocalTime horario;
		private Duration duracao;
		private String local;
		public Workshop(String infoInstrutor, List<String> materiaisNecessarios, String topico, LocalDateTime data,
				LocalTime horario, String local) {
			super();
			this.tipo = TipoDeEvento.WORKSHOP;
			this.infoInstrutor = infoInstrutor;
			this.materiaisNecessarios = materiaisNecessarios;
			this.topico = topico;
			this.data = data;
			this.horario = horario;
			this.local = local;
		}
		public String getInfoInstrutor() {
			return infoInstrutor;
		}
		public void setInfoInstrutor(String infoInstrutor) {
			this.infoInstrutor = infoInstrutor;
		}
		public List<String> getMateriaisNecessarios() {
			return materiaisNecessarios;
		}
		public void setMateriaisNecessarios(List<String> materiaisNecessarios) {
			this.materiaisNecessarios = materiaisNecessarios;
		}
		public String getTopico() {
			return topico;
		}
		public void setTopico(String topico) {
			this.topico = topico;
		}
		public LocalDateTime getData() {
			return data;
		}
		public void setData(LocalDateTime data) {
			this.data = data;
		}
		public LocalTime getHorario() {
			return horario;
		}
		public void setHorario(LocalTime horario) {
			this.horario = horario;
		}
		public String getLocal() {
			return local;
		}
		public void setLocal(String local) {
			this.local = local;
		}
		public Duration getDuracao() {
			return duracao;
		}
		public void setDuracao(Duration duracao) {
			this.duracao = duracao;
		}
		public TipoDeEvento getTipo() {
			return tipo;
		}
	}
	
	public class Exposicao {
		private final TipoDeEvento tipo;
		private String topico; // tema
		private List<String> expositores;
		private LocalDateTime data;
		private LocalTime horario;
		private Duration duracao;
		private String local;
		public Exposicao(String topico, List<String> expositores, Duration duracao, String local) {
			super();
			this.tipo = TipoDeEvento.EXPOSICAO;
			this.topico = topico;
			this.expositores = expositores;
			this.duracao = duracao;
			this.local = local;
		}
		public String getTopico() {
			return topico;
		}
		public void setTopico(String topico) {
			this.topico = topico;
		}
		public List<String> getExpositores() {
			return expositores;
		}
		public void setExpositores(List<String> expositores) {
			this.expositores = expositores;
		}
		public Duration getDuracao() {
			return duracao;
		}
		public void setDuracao(Duration duracao) {
			this.duracao = duracao;
		}
		public String getLocal() {
			return local;
		}
		public void setLocal(String local) {
			this.local = local;
		}
		public LocalDateTime getData() {
			return data;
		}
		public void setData(LocalDateTime data) {
			this.data = data;
		}
		public LocalTime getHorario() {
			return horario;
		}
		public void setHorario(LocalTime horario) {
			this.horario = horario;
		}
		public TipoDeEvento getTipo() {
			return tipo;
		}
	}

}
