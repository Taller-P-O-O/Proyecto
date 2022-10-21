package menusLibros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biblioteca.ConexionObjetosMenus;

import javax.swing.JTextField;
import javax.swing.JLabel;

public class BajaEjemplar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final ConexionObjetosMenus datos;


	public BajaEjemplar(ConexionObjetosMenus dato) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		datos = dato;
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(201, 35, 140, 25);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(201, 71, 140, 25);
		contentPane.add(textField_1);
		
		JLabel lblFechaDeBaja = new JLabel("Fecha de baja:");
		lblFechaDeBaja.setBounds(119, 40, 72, 14);
		contentPane.add(lblFechaDeBaja);
		
		JLabel lblNewLabel_1 = new JLabel("Motivo baja:");
		lblNewLabel_1.setBounds(131, 76, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ubicacion baja:");
		lblNewLabel_2.setBounds(118, 112, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(201, 107, 140, 25);
		contentPane.add(textField_2);
	}

}
