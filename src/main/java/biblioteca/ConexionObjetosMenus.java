package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import menus.MenuLoggin;
import menus.MenuPrincipal;

public class ConexionObjetosMenus {

	private List<Lector> Lectores = new ArrayList();
	private List<Usuario> Usuarios = new ArrayList();
	private List<Obra> Obras = new ArrayList(); 
	private  Usuario usuarioActivo;
	
	public void CrearUsuario(String NomYApe, String NomU, String Cont) {
		Usuarios.add(new Usuario(NomYApe, NomU, Cont));

	}
	
	public void CrearObra(String tip, String tema, String tit, String subt, String au1, String au2, String au3, String gen, String iSBN, String indi) {
		Obras.add(new Obra(tip, tema, tit, subt, au1, au2, au3, gen,  iSBN, indi));
	}
	
	public void CrearAlumno(String nombre, String apellido, String tipo, int dni, String sexo, String correo, LocalDate fechaNac, int numCel, String nacionalidad, int codigoPostal, String domicilio, String departamento, String localidad) {
		Lectores.add(new Alumno(nombre, apellido, tipo, dni, sexo, correo, fechaNac, numCel, nacionalidad, codigoPostal, domicilio, departamento, localidad));
	}	
	
	public List<Obra> getObras() {
		return Obras;
	}

	
	public List<Lector> getLectores() {
		return Lectores;
	}

	public void CrearProfesor(String nombre, String apellido, String tipo, int dni, String sexo, String correo, LocalDate fechaNac, int numCel, String nacionalidad, int codigoPostal, String domicilio, String departamento, String localidad, String carreras) {
		Lectores.add(new Profesor(nombre, apellido, tipo, dni, sexo, correo, fechaNac, numCel, nacionalidad, codigoPostal, domicilio, departamento, localidad, carreras));
	}
	
	public void CrearPublicoGeneral(String nombre, String apellido, String tipo, int dni, String sexo, String correo, LocalDate fechaNac, int numCel, String nacionalidad, int codigoPostal, String domicilio, String departamento, String localidad) {
		Lectores.add(new PublicoGeneral(nombre, apellido, tipo, dni, sexo, correo, fechaNac, numCel, nacionalidad, codigoPostal, domicilio, departamento, localidad));
	}
	
	public void CrearColeccion(String tipo, String tematica, String titulo, String subtitulo, String autor1, String autor2, String autor3, String genero, String iSBN, String indice,String Ncolec, String ISBNColec) {
		Obras.add(new Coleccion(tipo, tematica, titulo, subtitulo, autor1, autor2, autor3, genero, iSBN, indice,Ncolec, ISBNColec));		
	}
	
	
	public boolean ComprobarUsuario(String Nom) {
		boolean a = false;
		for(int indice = 0; indice < Usuarios.size() ;indice++)
		{
	     if (Usuarios.get(indice).getNombreUsuario().equals(Nom)) {
	        	  a = true;
	     } 
		}
	    return a;
	}
	
	public boolean ComprobarEdicion(Obra obra, String editorial, String paisEdicion, int numEdicion, int anio, int volumen, String idioma, String formato) {
		boolean a = false;
		for(int indice = 0; indice < obra.getEdiciones().size() ;indice++)
		{
	     if (obra.getEdiciones().get(indice).getEditorial().equals(editorial) && obra.getEdiciones().get(indice).getPaisEdicion().equals(paisEdicion) && (obra.getEdiciones().get(indice).getNumEdicion() == numEdicion) && (obra.getEdiciones().get(indice).getAnio() == anio) && (obra.getEdiciones().get(indice).getVolumen() == volumen) && obra.getEdiciones().get(indice).getIdioma().equals(idioma) && obra.getEdiciones().get(indice).getFormato().equals(formato)) {
	        	  a = true;
	     } 
		}
	    return a;
	}
	
	public boolean comprobarEjemplar(Obra obra, int Id) {
		boolean a = false;
		for(int indice = 0; indice < obra.getEjemplares().size() ;indice++)
		{
	     if ((obra.getEjemplares().get(indice).getIDUnica() == Id)) {
	        	  a = true;
	     } 
		}
	    return a;
	}
	
	public boolean ComprobarObra(String ISBn) {
		boolean s = false;
		for(int indice = 0; indice < Obras.size() ;indice++)
		{
	     if (Obras.get(indice).getISBN().equals(ISBn)) {
	        	  s = true;
	     } 
		}
	    return s;
	}
	
	public boolean ComprobarLector(String tipoD, int numD){
		boolean w = false;
		for(int indice = 0; indice < Lectores.size() ;indice++)
		{
	     if (Lectores.get(indice).getTipo().equals(tipoD) && Lectores.get(indice).getDni() == numD) {
	        	  w = true;
	     } 
		}
	    return w;
	}
	
	public boolean BuscarUsuario(String Nom, String Con) {
		boolean b = false;
		for(int indice = 0; indice < Usuarios.size() ;indice++)
		{
	     if (Usuarios.get(indice).getNombreUsuario().equals(Nom) && Usuarios.get(indice).getContraseña().equals(Con)) {
	        	  b = true;
	        	  usuarioActivo = Usuarios.get(indice);
	     } 
		}
	    return b;
	}

	
	public Obra BuscarObra(String isbn) {
		 Obra obr = null;
		for(int indice = 0; indice < Obras.size() ;indice++)
		{
	     if (Obras.get(indice).getISBN().equals(isbn)) {
	        	  obr = Obras.get(indice);
	     } 
		}
	    return obr;
	}

	
	public Edicion BuscarEdicion(String obra, String editorial, String paisEdicion, int numEdicion, int anio, int volumen, String idioma, String formato) {
		Edicion edi = null;
		for(int indice = 0; indice < BuscarObra(obra).getEdiciones().size() ;indice++) {
			if (BuscarObra(obra).getEdiciones().get(indice).getEditorial().equals(editorial) && BuscarObra(obra).getEdiciones().get(indice).getPaisEdicion().equals(paisEdicion) && (BuscarObra(obra).getEdiciones().get(indice).getNumEdicion() == numEdicion) && (BuscarObra(obra).getEdiciones().get(indice).getAnio() == anio) && (BuscarObra(obra).getEdiciones().get(indice).getVolumen() == volumen) && BuscarObra(obra).getEdiciones().get(indice).getIdioma().equals(idioma) && BuscarObra(obra).getEdiciones().get(indice).getFormato().equals(formato)) {
				edi = BuscarObra(obra).getEdiciones().get(indice);
			}
		}
		return edi;
	}
	
}
