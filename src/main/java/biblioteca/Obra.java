package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Obra {

	private String tipo;
	private String tematica;
	private String titulo;
	private String subtitulo;
	private String autor1;
	private String autor2;
	private String autor3;
	private String genero;
	private String ISBN;
	private int solicitudGeneral;
	private int solicitudProfYAlum;
	private String indice;
    private List<Edicion> ediciones;
    private List<Ejemplar> ejemplares;
    
    
	public Obra(String tipo, String tematica, String titulo, String subtitulo, String autor1, String autor2,
			String autor3, String genero, String iSBN, String indice) {
		super();
		this.tipo = tipo;
		this.tematica = tematica;
		this.titulo = titulo;
		this.subtitulo = subtitulo;
		this.autor1 = autor1;
		this.autor2 = autor2;
		this.autor3 = autor3;
		this.genero = genero;
		ISBN = iSBN;
		this.indice = indice;
		this.solicitudGeneral = 0;
		this.solicitudProfYAlum = 0;
		this.ediciones = new ArrayList();
		this.ejemplares = new ArrayList();
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTematica() {
		return tematica;
	}
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSubtitulo() {
		return subtitulo;
	}
	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}
	public String getAutor1() {
		return autor1;
	}
	public void setAutor1(String autor1) {
		this.autor1 = autor1;
	}
	public String getAutor2() {
		return autor2;
	}
	public void setAutor2(String autor2) {
		this.autor2 = autor2;
	}
	public String getAutor3() {
		return autor3;
	}
	public void setAutor3(String autor3) {
		this.autor3 = autor3;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getSolicitudGeneral() {
		return solicitudGeneral;
	}
	public void setSolicitudGeneral(int solicitudGeneral) {
		this.solicitudGeneral = solicitudGeneral;
	}
	public int getSolicitudProfYAlum() {
		return solicitudProfYAlum;
	}
	public void setSolicitudProfYAlum(int solicitudProfYAlum) {
		this.solicitudProfYAlum = solicitudProfYAlum;
	}
	public String getIndice() {
		return indice;
	}
	public void setIndice(String indice) {
		this.indice = indice;
	}
	public List<Edicion> getEdiciones() {
		return ediciones;
	}
	public void setEdiciones(List<Edicion> ediciones) {
		this.ediciones = ediciones;
	}
	public List<Ejemplar> getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(List<Ejemplar> ejemplares) {
		this.ejemplares = ejemplares;
	}
    
    public void aumentarSolicitudAYP() {
    	this.solicitudProfYAlum++;
    }
    
    public void aumentarSolicitudG() {
    	this.solicitudGeneral++;
    }
    
    public void agregarEdicion(String editorial, String paisEdicion, int numEdicion, int anio, int volumen, int cantidadPaginas, String idioma,
			String formato, String observacionesGen) {
    	ediciones.add(new Edicion(editorial, paisEdicion, numEdicion, anio, volumen, cantidadPaginas, idioma, formato, observacionesGen, this));
    }
    
    public void agregarEjemplar(int codigoBarras, String posicionBiblio, int iDUnica, LocalDate fechaAdqui, String formaAdqui, Edicion edicion) {
    	ejemplares.add(new Ejemplar(codigoBarras, posicionBiblio, iDUnica, fechaAdqui, formaAdqui, this,  edicion));
    }		
}
