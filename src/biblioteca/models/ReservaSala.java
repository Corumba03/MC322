package biblioteca.models;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class ReservaSala {
	private StatusReserva status;
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
	public StatusReserva getStatus() {
		return status;
	}
	public void setStatus(StatusReserva status) {
		this.status = status;
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
		private RecursoMultimidia recurso;
		private boolean recursoDisponivel;

		public enum RecursoMultimidia {
			DESKTOP, TABLET , MICROFONE, PROJETOR, PICKUP, CAMERA
		}
		public SalaMultimidia(RecursoMultimidia recurso, List<RecursoMultimidia> recursoMultimidia,
				boolean desktopDisponivel, boolean tabletDisponivel, boolean microfoneDisponivel,
				boolean projetorDisponivel, boolean pickupDisponivel, boolean cameraDisponivel) {
			super();
			this.recurso = recurso;
			this.recursoDisponivel = desktopDisponivel;
		}
		
		public RecursoMultimidia getRecurso() {
			return recurso;
		}
		public void setRecurso(RecursoMultimidia recurso) {
			this.recurso = recurso;
		}
		public boolean isRecursoDisponivel() {
			return recursoDisponivel;
		}
		public void setCameraDisponivel(boolean cameraDisponivel) {
			this.recursoDisponivel = cameraDisponivel;
		}
		
	}
}
