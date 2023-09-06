package biblioteca.models;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class EventosBiblioteca {
	
	public class Palestra {
		private String palestrante;
		private String topico;
		private LocalDate data;
		private LocalTime horario;
		private Duration duracao;
		private String local;
		public Palestra(String palestrante, String topico, LocalDate data, LocalTime horario, String local) {
			super();
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
		public LocalDate getData() {
			return data;
		}
		public void setData(LocalDate data) {
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
	}
	
	public class Workshop {
		private String infoInstrutor;
		private List<String> materiaisNecessarios;
		private String topico;
		private LocalDate data;
		private LocalTime horario;
		private Duration duracao;
		private String local;
		public Workshop(String infoInstrutor, List<String> materiaisNecessarios, String topico, LocalDate data,
				LocalTime horario, String local) {
			super();
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
		public LocalDate getData() {
			return data;
		}
		public void setData(LocalDate data) {
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
	}
	
	public class Exposicao {
		private String topico; // tema
		private List<String> expositores;
		private LocalDate data;
		private LocalTime horario;
		private Duration duracao;
		private String local;
		public Exposicao(String topico, List<String> expositores, Duration duracao, String local) {
			super();
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
		public LocalDate getData() {
			return data;
		}
		public void setData(LocalDate data) {
			this.data = data;
		}
		public LocalTime getHorario() {
			return horario;
		}
		public void setHorario(LocalTime horario) {
			this.horario = horario;
		}
	}
	
	enum TipoDeEvento {
		PALESTRA, WORKSHOP, EXPOSICAO
	}
}
