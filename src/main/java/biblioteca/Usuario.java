package biblioteca;

public class Usuario {
	
	private String NombreYApellido;
	private String NombreUsuario;
	private String Contraseña;
	public Usuario(String nombreYApellido, String nombreUsuario, String contraseña) {
		super();
		NombreYApellido = nombreYApellido;
		NombreUsuario = nombreUsuario;
		Contraseña = contraseña;
	}
	
	public String getNombreYApellido() {
		return NombreYApellido;
	}
	public void setNombreYApellido(String nombreYApellido) {
		NombreYApellido = nombreYApellido;
	}
	public String getNombreUsuario() {
		return NombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}
	public String getContraseña() {
		return Contraseña;
	}
	
	

}
