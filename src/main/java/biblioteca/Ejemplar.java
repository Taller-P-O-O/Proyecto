package biblioteca;

import java.time.*;

public class Ejemplar {

	private int codigoBarras;
	private String posicionBiblio;
	private int IDUnica;
	private LocalDate fechaAdqui;
	private String formaAdqui;
	private boolean dadoBaja;
	private LocalDate fechaBaja;
	private String motivoBaja;
	private String ubicacionBaja;
	private Obra obra;
	private Edicion edicion;
	private Reserva reservante;
	private Prestamo prestatario;
	
	
	
	public Ejemplar(int codigoBarras, String posicionBiblio, int iDUnica, LocalDate fechaAdqui, String formaAdqui,
			Obra obra, Edicion edicion) {
		super();
		this.codigoBarras = codigoBarras;
		this.posicionBiblio = posicionBiblio;
		this.IDUnica = iDUnica;
		this.fechaAdqui = fechaAdqui;
		this.formaAdqui = formaAdqui;
		this.obra = obra;
		this.edicion = edicion;
		this.reservante = null;
		this.prestatario = null;
	}

public void aumentarSolicitudPubGen() {
	this.edicion.getObra().aumentarSolicitudG();
}

public void aumentarSolicitudProfyAlum() {
	this.edicion.getObra().aumentarSolicitudAYP();
}
	
	
	public int getCodigoBarras() {
		return codigoBarras;
	}
	
	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	public String getPosicionBiblio() {
		return posicionBiblio;
	}
	
	public void setPosicionBiblio(String posicionBiblio) {
		this.posicionBiblio = posicionBiblio;
	}
	
	public int getIDUnica() {
		return IDUnica;
	}
	
	public void setIDUnica(int iDUnica) {
		IDUnica = iDUnica;
	}
	
	public LocalDate getFechaAdqui() {
		return fechaAdqui;
	}
	
	public void setFechaAdqui(LocalDate fechaAdqui) {
		this.fechaAdqui = fechaAdqui;
	}
	
	public String getFormaAdqui() {
		return formaAdqui;
	}
	
	public void setFormaAdqui(String formaAdqui) {
		this.formaAdqui = formaAdqui;
	}
	
	public boolean isDadoBaja() {
		return dadoBaja;
	}
	
	public void setDadoBaja(boolean dadoBaja) {
		this.dadoBaja = dadoBaja;
	}
	
	public LocalDate getFechaBaja() {
		return fechaBaja;
	}
	
	public void setFechaBaja(LocalDate fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	
	public String getMotivoBaja() {
		return motivoBaja;
	}
	
	public void setMotivoBaja(String motivoBaja) {
		this.motivoBaja = motivoBaja;
	}
	
	public String getUbicacionBaja() {
		return ubicacionBaja;
	}
	
	public void setUbicacionBaja(String ubicacionBaja) {
		this.ubicacionBaja = ubicacionBaja;
	}
	
	public Obra getObra() {
		return obra;
	}
	
	public void setObra(Obra obra) {
		this.obra = obra;
	}
	
	public Reserva getReservante() {
		return reservante;
	}
	
	public void setReservante(Reserva reservante) {
		this.reservante = reservante;
	}
	
	public Prestamo getPrestatario() {
		return prestatario;
	}
	
	public void setPrestatario(Prestamo prestatario) {
		this.prestatario = prestatario;
	}

	public Edicion getEdicion() {
		return edicion;
	}

	public void setEdicion(Edicion edicion) {
		this.edicion = edicion;
	}
	
	public void darDeBaja(LocalDate fechaBaja, String motivoBaja, String ubicacionBaja) {
		this.dadoBaja = true;
		this.fechaBaja = fechaBaja;
		this.motivoBaja = motivoBaja;
		this.ubicacionBaja = ubicacionBaja;
	}
	
	
}
