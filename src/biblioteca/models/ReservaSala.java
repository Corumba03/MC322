package biblioteca.models;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class ReservaSala {
    private LocalDateTime dataReserva;
    private LocalTime horaInicio;
    private LocalTime horaFim;
	enum StatusReserva {
		PENDENTE, CONFIRMADA, CANCELADA
	}
	public ReservaSala(LocalDateTime dataReserva, LocalTime horaInicio, LocalTime horaFim) {
		super();
		this.dataReserva = dataReserva;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
	}
	public LocalDateTime getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(LocalDateTime dataReserva) {
		this.dataReserva = dataReserva;
	}
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}
	public LocalTime getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(LocalTime horaFim) {
		this.horaFim = horaFim;
	}
    
	public class SalaIndividual {
		private boolean disponivel;
		private int numeroSala;
		public SalaIndividual(boolean disponivel, int numeroSala) {
			super();
			this.disponivel = disponivel;
			this.numeroSala = numeroSala;
		}
		public boolean isDisponivel() {
			return disponivel;
		}
		public void setDisponivel(boolean disponivel) {
			this.disponivel = disponivel;
		}
		public int getNumeroSala() {
			return numeroSala;
		}
		public void setNumeroSala(int numeroSala) {
			this.numeroSala = numeroSala;
		}
	}
	
	public class SalaGrupo {
		private int capacidadeMax;
		private boolean equipApresentacao; //Se possui equipamento para apresentações (como um projetor)
		public SalaGrupo(int capacidadeMax, boolean equipApresentacao) {
			super();
			this.capacidadeMax = capacidadeMax;
			this.equipApresentacao = equipApresentacao;
		}
		public int getCapacidadeMax() {
			return capacidadeMax;
		}
		public void setCapacidadeMax(int capacidadeMax) {
			this.capacidadeMax = capacidadeMax;
		}
		public boolean isEquipApresentacao() {
			return equipApresentacao;
		}
		public void setEquipApresentacao(boolean equipApresentacao) {
			this.equipApresentacao = equipApresentacao;
		}
	}
	
	public class SalaSilenciosa {
		private int qtdAssentos;
		private boolean cabinesIndividuais;
		public SalaSilenciosa(int qtdAssentos, boolean cabinesIndividuais) {
			super();
			this.qtdAssentos = qtdAssentos;
			this.cabinesIndividuais = cabinesIndividuais;
		}
		public int getQtdAssentos() {
			return qtdAssentos;
		}
		public void setQtdAssentos(int qtdAssentos) {
			this.qtdAssentos = qtdAssentos;
		}
		public boolean isCabinesIndividuais() {
			return cabinesIndividuais;
		}
		public void setCabinesIndividuais(boolean cabinesIndividuais) {
			this.cabinesIndividuais = cabinesIndividuais;
		}
	}
	
	public class SalaMultimidia {
		public enum RecursoMultimidia {
			DESKTOP, TABLET , MICROFONE, PROJETOR, PICKUP, CAMERA
		}

		private List<RecursoMultimidia> recursoMultimidia;

		public SalaMultimidia(List<RecursoMultimidia> recursoMultimidia) {
			this.recursoMultimidia = recursoMultimidia;
		}

		public List<RecursoMultimidia> getRecursoMultimidia() {
			return recursoMultimidia;
		}

		public void setRecursoMultimidia(List<RecursoMultimidia> recursoMultimidia) {
			this.recursoMultimidia = recursoMultimidia;
		}

		// TODO implementar boolean disponivel para cada item
	}
}
