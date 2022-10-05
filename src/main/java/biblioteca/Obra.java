package biblioteca;

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
	private String caracteristica;
	private String ISBN;
	private int solicitudGeneral;
	private int solicitudProfYAlum;
	private String[] indice;
    private List<Edicion> ediciones;
    private List<Ejemplar> ejemplares;
    
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
	public String getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
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
	public String[] getIndice() {
		return indice;
	}
	public void setIndice(String[] indice) {
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
		
}
