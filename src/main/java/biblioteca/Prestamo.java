package biblioteca;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Prestamo {
	
	private LocalDate fecha;
	private LocalTime hora;
	private Lector prestatario;
	private String areaReferenciaLibro;
	private LocalDate fechaEstimadaDevol;
	private LocalDate fechaDevol;
	private LocalTime horaDevol;
	private String nombreFuncionarioEntrega;
	private String nombreFuncionarioDevolucion;
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
	
	public String getNombreFuncionarioEntrega() {
		return nombreFuncionarioEntrega;
	}

	public void setNombreFuncionarioEntrega(String nombreFuncionarioEntrega) {
		this.nombreFuncionarioEntrega = nombreFuncionarioEntrega;
	}

	public String getNombreFuncionarioDevolucion() {
		return nombreFuncionarioDevolucion;
	}

	public void setNombreFuncionarioDevolucion(String nombreFuncionarioDevolucion) {
		this.nombreFuncionarioDevolucion = nombreFuncionarioDevolucion;
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
	
	public Prestamo(Ejemplar ejemplarPrestado, int diasPrestamo, Lector prestatario, String bibliotecario, String areaRef) {
		this.fecha = LocalDate.now();
		this.hora = LocalTime.now();
		this.ejemplarPrestado = ejemplarPrestado;
		this.diasPrestamo = diasPrestamo;
		this.prestatario = prestatario;
		this.nombreFuncionarioEntrega = bibliotecario;
		this.areaReferenciaLibro = areaRef;
		ejemplarPrestado.setPrestatario(this);
		prestatario.retirarLibro(this);
		if(prestatario instanceof PublicoGeneral) {
			ejemplarPrestado.aumentarSolicitudPubGen();
		}else {
			ejemplarPrestado.aumentarSolicitudProfyAlum();;
		}
		this.ejemplarPrestado.setPrestatario(this);
		this.fechaEstimadaDevol = LocalDate.now().plusDays(diasPrestamo);
		this.Multas = new ArrayList();
	}
	
  public void registrarDevolucion(String bibliotecario) {
		ejemplarPrestado.setPrestatario(null);
		this.fechaDevol = LocalDate.now();
		this.horaDevol =  LocalTime.now();
		this.nombreFuncionarioDevolucion = bibliotecario;
		
  }

public List<Multa> getMultas() {
	return Multas;
}
public void agregarMulta(Multa multa) {
	this.Multas.add(multa);
}

public LocalDate getFechaEstimadaDevol() {
	return fechaEstimadaDevol;
}

public void setFechaEstimadaDevol(LocalDate fechaEstimadaDevol) {
	this.fechaEstimadaDevol = fechaEstimadaDevol;
}
	
}
