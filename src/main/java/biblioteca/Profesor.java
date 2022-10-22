package biblioteca;

import java.time.LocalDate;

public class Profesor extends Lector {
	
	private String carreras;
	
	public Profesor(String nombre, String apellido, String tipo, int dni, String sexo, String correo, LocalDate fechaNac, int numCel, String nacionalidad, int codigoPostal, String domicilio,
			String departamento, String localidad, String carreras) {
		super(nombre, apellido, tipo, dni, sexo, correo, fechaNac, numCel, nacionalidad, codigoPostal, domicilio, departamento,
				localidad);
		this.carreras = carreras;
	}

	

	public String getCarreras() {
		return carreras;
	}

	public void setCarreras(String carreras) {
		this.carreras = carreras;
	}

	@Override
	public void reservarLibro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirarLibro() {
		// TODO Auto-generated method stub
		
	}


}
