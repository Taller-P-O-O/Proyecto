package menusLectores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;

import biblioteca.ConexionObjetosMenus;
import menus.MenuPrincipal;
import menusLibros.RegistroObras;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.time.ZoneId;
import java.awt.event.ActionEvent;

public class RegistroAlumnos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private final ConexionObjetosMenus datos;
	private JTextField textField_11;

	public RegistroAlumnos(ConexionObjetosMenus dato) {
		setTitle("Registro de alumnos");
		datos = dato;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(156, 22, 140, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 58, 140, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(156, 95, 140, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(100, 27, 48, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setBounds(100, 63, 48, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo de Documento:");
		lblNewLabel_2.setBounds(40, 98, 112, 16);
		contentPane.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(156, 132, 140, 25);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Sexo:");
		lblNewLabel_3.setBounds(118, 171, 32, 16);
		contentPane.add(lblNewLabel_3);
		
		final JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(156, 234, 140, 25);
		dateChooser.getDateEditor().setEnabled(false);
		contentPane.add(dateChooser);
		
		
		textField_4 = new JTextField();
		textField_4.setBounds(156, 167, 140, 25);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nro. de documento:");
		lblNewLabel_4.setBounds(40, 134, 110, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_5.setBounds(35, 243, 120, 16);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(156, 270, 140, 25);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_3_1 = new JLabel("Num. Celular:");
		lblNewLabel_3_1.setBounds(72, 274, 75, 16);
		contentPane.add(lblNewLabel_3_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(156, 306, 140, 25);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_3_2 = new JLabel("Nacionalidad:");
		lblNewLabel_3_2.setBounds(72, 310, 76, 16);
		contentPane.add(lblNewLabel_3_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(156, 342, 140, 25);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_3_3 = new JLabel("Codigo Postal:");
		lblNewLabel_3_3.setBounds(67, 346, 81, 16);
		contentPane.add(lblNewLabel_3_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(156, 378, 140, 25);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_3_4 = new JLabel("Domicilio:");
		lblNewLabel_3_4.setBounds(93, 382, 55, 16);
		contentPane.add(lblNewLabel_3_4);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(156, 414, 140, 25);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel_3_5 = new JLabel("Departamento:");
		lblNewLabel_3_5.setBounds(67, 418, 84, 16);
		contentPane.add(lblNewLabel_3_5);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(156, 450, 140, 25);
		contentPane.add(textField_10);
		
		JLabel lblNewLabel_3_6 = new JLabel("Localidad:");
		lblNewLabel_3_6.setBounds(93, 454, 58, 16);
		contentPane.add(lblNewLabel_3_6);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(textField.getText().trim().isEmpty()) && !(textField_1.getText().trim().isEmpty()) && !(textField_2.getText().trim().isEmpty()) && !(textField_3.getText().trim().isEmpty()) && !(textField_4.getText().trim().isEmpty()) &&  !(dateChooser.getDate() == null) &&  !(textField_5.getText().trim().isEmpty()) && !(textField_6.getText().trim().isEmpty()) && !(textField_7.getText().trim().isEmpty()) && !(textField_8.getText().trim().isEmpty()) && !(textField_9.getText().trim().isEmpty()) && !(textField_10.getText().trim().isEmpty()) && !(textField_11.getText().trim().isEmpty()) 
						&& validarTex(textField.getText().trim()) && validarTex(textField_1.getText().trim()) && validarNum(textField_3.getText().trim()) && validarTex(textField_4.getText().trim()) && validarNum(textField_5.getText().trim()) && validarTex(textField_6.getText().trim()) && validarNum(textField_7.getText().trim()) && validarTex(textField_9.getText().trim()) && validarTex(textField_10.getText().trim())) {
					if (!(datos.ComprobarLector(textField_2.getText().trim(), Integer.parseInt(textField_3.getText().trim())))) {
					try {
						datos.CrearAlumno(textField.getText().trim(), textField_1.getText().trim(), textField_2.getText().trim(), Integer.parseInt(textField_3.getText().trim()),  textField_4.getText().trim(), textField_11.getText().trim(), dateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), Integer.parseInt(textField_5.getText().trim()), textField_6.getText().trim(), Integer.parseInt(textField_7.getText().trim()), textField_8.getText().trim(), textField_9.getText().trim(), textField_10.getText().trim());
						JOptionPane.showMessageDialog(null, "El Lector se a registrado correctamente", "Registro completo", JOptionPane.INFORMATION_MESSAGE);
					}
					catch (IllegalArgumentException a) {
							JOptionPane.showMessageDialog(null, "Error en el ingreso de datos", "Error", JOptionPane.ERROR_MESSAGE);
						}
				} else {
					JOptionPane.showMessageDialog(null, "Este lector ya se encuentra registrado", "Error", JOptionPane.ERROR_MESSAGE);	
				}
				} else {
					JOptionPane.showMessageDialog(null, "Error en el ingreso de datos", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(207, 503, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atras");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal MP = new MenuPrincipal(datos);
		        MP.setVisible(true);
		        RegistroAlumnos.this.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(100, 501, 65, 26);
		contentPane.add(btnNewButton_1);
		
		textField_11 = new JTextField();
		textField_11.setBounds(156, 204, 140, 25);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Correo electronico:");
		lblNewLabel_6.setBounds(39, 206, 109, 16);
		contentPane.add(lblNewLabel_6);
	}

	public static boolean validarTex(String nom) {
		return nom.matches("[a-zA-Z]*");
	}

	public static boolean validarNum(String nom) {
		return nom.matches("[0-9]*");
	}
}
