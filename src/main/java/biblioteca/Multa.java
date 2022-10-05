package biblioteca;

import java.time.LocalDate;

public class Multa {

	private int cantidadDiasMulta;
	private LocalDate fechaFinMulta;
	
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
	

	
}
