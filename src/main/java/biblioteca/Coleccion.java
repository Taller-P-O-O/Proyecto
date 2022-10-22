package biblioteca;

public class Coleccion extends Obra {
	

	private String nombreColec;
	private String ISBNColec;
	
		public Coleccion(String tipo, String tematica, String titulo, String subtitulo, String autor1, String autor2,
			String autor3, String genero, String iSBN, String indice,String Ncolec, String ISBNColec) {
		super(tipo, tematica, titulo, subtitulo, autor1, autor2, autor3, genero, iSBN, indice);
		this.nombreColec = Ncolec;
		this.ISBNColec = ISBNColec;
	}

	public String getNombreColec() {
		return nombreColec;
	}
	
	public void setNombreColec(String nombreColec) {
		this.nombreColec = nombreColec;
	}
	
	public String getISBNColec() {
		return ISBNColec;
	}
	
	public void setISBNColec(String iSBNColec) {
		ISBNColec = iSBNColec;
	}
	
	
	

}
