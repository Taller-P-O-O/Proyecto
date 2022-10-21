package biblioteca;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import menus.MenuLoggin;
import menus.MenuPrincipal;

public class ConexionObjetosMenus {

	private List<Lector> Lectores = new ArrayList();
	private List<Usuario> Usuarios = new ArrayList();
	private List<Obra> Obras = new ArrayList(); 
	
	public void CrearUsuario(String NomYApe, String NomU, String Cont) {
		Usuarios.add(new Usuario(NomYApe, NomU, Cont));

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
	
	public boolean BuscarUsuario(String Nom, String Con) {
		boolean b = false;
		for(int indice = 0; indice < Usuarios.size() ;indice++)
		{
	     if (Usuarios.get(indice).getNombreUsuario().equals(Nom) && Usuarios.get(indice).getContraseña().equals(Con)) {
	        	  b = true;
	     } 
		}
	    return b;
	}


	
	
	
}
