package menus;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biblioteca.ConexionObjetosMenus;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private final ConexionObjetosMenus datos;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Registro(ConexionObjetosMenus dato) {
		setTitle("Registro");
		datos = dato;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 342, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);
		
		 JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (!(textField.getText().isEmpty()) && !(textField_1.getText().isEmpty()) && !(passwordField.getText().isEmpty())) {
              try {
            	  datos.CrearUsuario(textField.getText(), textField_1.getText(), passwordField.getText());
            	  JOptionPane.showMessageDialog(null, "Usted se a registrado correctamente", "Registro completo", JOptionPane.INFORMATION_MESSAGE);
  				 MenuLoggin logg = new MenuLoggin(datos);
  				 logg.setVisible(true);
  				 Registro.this.setVisible(false);
              } catch(IllegalArgumentException a){
            	  JOptionPane.showMessageDialog(null, "Error en el ingreso de datos", "Error", JOptionPane.ERROR_MESSAGE);
              }         	  
              } else {
            	  JOptionPane.showMessageDialog(null, "Error en el ingreso de datos", "Error", JOptionPane.ERROR_MESSAGE);
              }
			}
		});
		
		btnNewButton_1.setBounds(185, 147, 101, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Atras");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuLoggin log = new MenuLoggin(datos);
				log.setVisible(true);
				Registro.this.setVisible(false);
			}});
		
		btnNewButton_2.setBounds(62, 147, 89, 23);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(118, 27, 140, 25);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(118, 63, 140, 25);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Nombre y apellido:");
		lblNewLabel.setBounds(12, 31, 104, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setBounds(68, 67, 48, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña:");
		lblNewLabel_2.setBounds(48, 104, 69, 16);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(118, 100, 140, 23);
		contentPane.add(passwordField);
	}
}
