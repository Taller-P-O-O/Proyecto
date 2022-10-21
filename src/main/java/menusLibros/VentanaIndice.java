package menusLibros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biblioteca.ConexionObjetosMenus;

import java.awt.TextArea;

public class VentanaIndice extends JFrame {

	private JPanel contentPane;
	private final ConexionObjetosMenus datos;



	public VentanaIndice(ConexionObjetosMenus dato) {
		setTitle("Indice");
		datos = dato;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 10, 414, 241);
		contentPane.add(textArea);
	}
}
