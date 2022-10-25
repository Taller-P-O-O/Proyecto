package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Lector {

	private String nombre;
	private String apellido;
	private String tipo;
	private int dni;
	private String sexo;
	private String correo;
	private LocalDate fechaNac;
	private int numCel;
	private String nacionalidad;
	private int codigoPostal;
	private String domicilio;
	private String departamento;
	private String localidad;
	private List<Prestamo> ejemplaresPrestado;
	private List<Reserva> ejemplaresReservado;
	private LocalDate fechaFinUltimaMulta;
	private int cantidadMultas;
	
	
	
	public Lector(String nombre, String apellido, String tipo, int dni, String sexo, String correo, LocalDate fechaNac,
			int numCel, String nacionalidad, int codigoPostal, String domicilio, String departamento, String localidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo = tipo;
		this.dni = dni;
		this.sexo = sexo;
		this.correo = correo;
		this.fechaNac = fechaNac;
		this.numCel = numCel;
		this.nacionalidad = nacionalidad;
		this.codigoPostal = codigoPostal;
		this.domicilio = domicilio;
		this.departamento = departamento;
		this.localidad = localidad;
		this.ejemplaresPrestado = new ArrayList();
		this.ejemplaresReservado = new ArrayList();
		this.fechaFinUltimaMulta = null;
		this.cantidadMultas = 0;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getDni() {
		return dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public int getNumCel() {
		return numCel;
	}
	
	public void setNumCel(int numCel) {
		this.numCel = numCel;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public int getCodigoPostal() {
		return codigoPostal;
	}
	
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getLocalidad() {
		return localidad;
	}
	
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	public List<Prestamo> getEjemplaresPrestado() {
		return ejemplaresPrestado;
	}
	
	public void setEjemplaresPrestado(List<Prestamo> ejemplaresPrestado) {
		this.ejemplaresPrestado = ejemplaresPrestado;
	}
	
	public List<Reserva> getEjemplaresReservado() {
			return ejemplaresReservado;
	}
	
	public void setEjemplaresReservado(List<Reserva> ejemplaresReservado) {
		this.ejemplaresReservado = ejemplaresReservado;
	}
	
    public void reservarLibro(Reserva reserva) {
    	this.ejemplaresReservado.add(reserva);
    }
    
    public void retirarLibro(Prestamo prestamo) {
    	this.ejemplaresPrestado.add(prestamo);
    }
    

	public LocalDate getFechaFinUltimaMulta() {
		return fechaFinUltimaMulta;
	}

	public void setFechaFinUltimaMulta(LocalDate finUltimaMulta) {
		this.fechaFinUltimaMulta = finUltimaMulta;
	}
	
	public void aumentarCantidadMultas() {
		this.cantidadMultas++;
	}

    
}
