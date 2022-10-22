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
	
	public void CrearObra(String tip, String tema, String tit, String subt, String au1, String au2, String au3, String gen, String carac, String iSBN, String indi) {
		Obras.add(new Obra(tip, tema, tit, subt, au1, au2, au3, gen, carac, iSBN, indi));
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
	
	public boolean ComprobarObra(String ISBn) {
		boolean s = false;
		for(int indice = 0; indice < Obras.size() ;indice++)
		{
	     if (Usuarios.get(indice).getNombreUsuario().equals(ISBn)) {
	        	  s = true;
	     } 
		}
	    return s;
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
