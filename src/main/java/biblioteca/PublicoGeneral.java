package biblioteca;

import java.time.LocalDate;

public class PublicoGeneral extends Lector {

	public PublicoGeneral(String nombre, String apellido, String tipo, int dni, String sexo, String correo,
			LocalDate fechaNac, int numCel, String nacionalidad, int codigoPostal, String domicilio,
			String departamento, String localidad) {
		super(nombre, apellido, tipo, dni, sexo, correo, fechaNac, numCel, nacionalidad, codigoPostal, domicilio, departamento,
				localidad);
	}

}
