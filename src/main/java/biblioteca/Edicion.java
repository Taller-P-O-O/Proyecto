package biblioteca;

public class Edicion {

	private String editorial;
	private String paisEdicion;
	private int numEdicion;
	private int anio;
	private int volumen;
	private int cantidadPaginas;
	private String idioma;
	private String formato;
	private String ObservacionesGen;
	private Obra obra;
	
	public Edicion(String editorial, String paisEdicion, int numEdicion, int anio, int volumen, int cantidadPaginas, String idioma,
			String formato, String observacionesGen, Obra obra) {
		super();
		this.editorial = editorial;
		this.paisEdicion = paisEdicion;
		this.numEdicion = numEdicion;
		this.anio = anio;
		this.volumen = volumen;
		this.cantidadPaginas = cantidadPaginas;
		this.idioma = idioma;
		this.formato = formato;
		ObservacionesGen = observacionesGen;
		this.obra = obra;
	}

	public String getEditorial() {
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public String getPaisEdicion() {
		return paisEdicion;
	}
	
	public void setPaisEdicion(String paisEdicion) {
		this.paisEdicion = paisEdicion;
	}
	
	public int getNumEdicion() {
		return numEdicion;
	}
	
	public void setNumEdicion(int numEdicion) {
		this.numEdicion = numEdicion;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public String getFormato() {
		return formato;
	}
	
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	public String getObservacionesGen() {
		return ObservacionesGen;
	}
	
	public void setObservacionesGen(String observacionesGen) {
		ObservacionesGen = observacionesGen;
	}
	
	public Obra getObra() {
		return obra;
	}
	
	public void setObra(Obra obra) {
		this.obra = obra;
	}

    
	
	
}
