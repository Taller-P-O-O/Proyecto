package biblioteca;

import java.time.LocalDate;

public class Reserva {
	
	private LocalDate fecha;
	private Ejemplar ejemplarReservado;
	private Lector reservante;
	
	
	public Reserva(Ejemplar ejemplarReservado, Lector reservante, LocalDate fechaReserva) {
		this.ejemplarReservado = ejemplarReservado;
		this.reservante = reservante;
		this.fecha = fechaReserva;
		ejemplarReservado.setReservante(this);
		reservante.reservarLibro(this);
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public Ejemplar getEjemplarReservado() {
		return ejemplarReservado;
	}
	
	public void setEjemplarReservado(Ejemplar ejemplarReservado) {
		this.ejemplarReservado = ejemplarReservado;
	}
	
	public Lector getReservante() {
		return reservante;
	}
	
	public void setReservante(Lector reservante) {
		this.reservante = reservante;
	}


	
}
