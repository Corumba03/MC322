package biblioteca.models;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import biblioteca.models.membros.Membro;

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
		public List<Membro> participantes; // Lista de participantes do evento
		public Palestra(TipoDeEvento tipo, String palestrante, String topico, LocalDateTime data, LocalTime horario,
				Duration duracao, String local, List<Membro> participantes) {
			super();
			this.tipo = tipo;
			this.palestrante = palestrante;
			this.topico = topico;
			this.data = data;
			this.horario = horario;
			this.duracao = duracao;
			this.local = local;
			this.participantes = participantes;
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
		public List<Membro> getParticipantes() {
			return participantes;
		}
		public void setParticipantes(List<Membro> participantes) {
			this.participantes = participantes;
		}
		public void addParticipante(Membro participante){
			this.participantes.add(participante);
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
		public List<Membro> participantes; // Lista de participantes do evento	
		public Workshop(TipoDeEvento tipo, String infoInstrutor, List<String> materiaisNecessarios, String topico,
				LocalDateTime data, LocalTime horario, Duration duracao, String local, List<Membro> participantes) {
			super();
			this.tipo = tipo;
			this.infoInstrutor = infoInstrutor;
			this.materiaisNecessarios = materiaisNecessarios;
			this.topico = topico;
			this.data = data;
			this.horario = horario;
			this.duracao = duracao;
			this.local = local;
			this.participantes = participantes;
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
		public List<Membro> getParticipantes() {
			return participantes;
		}
		public void setParticipantes(List<Membro> participantes) {
			this.participantes = participantes;
		}
		public void addParticipante(Membro participante){
			this.participantes.add(participante);
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
		public List<Membro> participantes; // Lista de participantes do evento
		public Exposicao(TipoDeEvento tipo, String topico, List<String> expositores, LocalDateTime data,
				LocalTime horario, Duration duracao, String local, List<Membro> participantes) {
			super();
			this.tipo = tipo;
			this.topico = topico;
			this.expositores = expositores;
			this.data = data;
			this.horario = horario;
			this.duracao = duracao;
			this.local = local;
			this.participantes = participantes;
			
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
		public List<Membro> getParticipantes() {
			return participantes;
		}
		public void setParticipantes(List<Membro> participantes) {
			this.participantes = participantes;
		}
		public void addParticipante(Membro participante){
			this.participantes.add(participante);
		}
	}

}
