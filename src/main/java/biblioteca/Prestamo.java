package biblioteca;

import java.time.*;
import java.util.List;

public class Prestamo {
	
	private LocalDate fecha;
	private LocalTime hora;
	private Lector prestatario;
	private String areaReferenciaLibro;
	private LocalDate fechaDevol;
	private LocalTime horaDevol;
	private String nombreFuncionario;
	private int diasPrestamo;
	private Ejemplar ejemplarPrestado;
	private List<Multa> Multas;
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public LocalTime getHora() {
		return hora;
	}
	
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	public Lector getPrestatario() {
		return prestatario;
	}
	
	public void setPrestatario(Lector prestatario) {
		this.prestatario = prestatario;
	}
	
	public String getAreaReferenciaLibro() {
		return areaReferenciaLibro;
	}
	
	public void setAreaReferenciaLibro(String areaReferenciaLibro) {
		this.areaReferenciaLibro = areaReferenciaLibro;
	}
	
	public LocalDate getFechaDevol() {
		return fechaDevol;
	}
	
	public void setFechaDevol(LocalDate fechaDevol) {
		this.fechaDevol = fechaDevol;
	}
	
	public LocalTime getHoraDevol() {
		return horaDevol;
	}
	
	public void setHoraDevol(LocalTime horaDevol) {
		this.horaDevol = horaDevol;
	}
	
	public String getNombreFuncionario() {
		return nombreFuncionario;
	}
	
	public void setNombreFuncionario(String nombreFuncionario) {
		this.nombreFuncionario = nombreFuncionario;
	}
	
	public int getDiasPrestamo() {
		return diasPrestamo;
	}
	
	public void setDiasPrestamo(int diasPrestamo) {
		this.diasPrestamo = diasPrestamo;
	}
	
	public Ejemplar getEjemplarPrestado() {
		return ejemplarPrestado;
	}
	
	public void setEjemplarPrestado(Ejemplar ejemplarPrestado) {
		this.ejemplarPrestado = ejemplarPrestado;
	}
	

	
}
