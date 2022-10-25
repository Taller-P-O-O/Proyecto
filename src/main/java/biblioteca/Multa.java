package biblioteca;

import java.time.LocalDate;

public class Multa {

	private int cantidadDiasMulta;
	private LocalDate fechaAplicacion;
	private LocalDate fechaFinMulta;
;
	
	public int getCantidadDiasMulta() {
		return cantidadDiasMulta;
	}
	
	public void setCantidadDiasMulta(int cantidadDiasMulta) {
		this.cantidadDiasMulta = cantidadDiasMulta;
	}
	
	public LocalDate getFechaFinMulta() {
		return fechaFinMulta;
	}
	
	public void setFechaFinMulta(LocalDate fechaFinMulta) {
		this.fechaFinMulta = fechaFinMulta;
	}
	
	public Multa(int cantiDias, Prestamo prestamo) {
		this.fechaAplicacion = LocalDate.now();
		this.cantidadDiasMulta = cantiDias;
		if(prestamo.getPrestatario().getFechaFinUltimaMulta() == null || prestamo.getPrestatario().getFechaFinUltimaMulta().isBefore(LocalDate.now())) {
		    this.fechaFinMulta = LocalDate.now().plusDays(cantiDias);
		} else {
			this.fechaFinMulta = prestamo.getPrestatario().getFechaFinUltimaMulta().plusDays(cantiDias);
		}
		prestamo.getPrestatario().setFechaFinUltimaMulta(fechaFinMulta);
		prestamo.agregarMulta(this);
	}

	
}
