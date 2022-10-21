package menusLectores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
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
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ConexionObjetosMenus datos;

	public RegistroAlumnos(ConexionObjetosMenus dato) {
		setTitle("Registro de Lectores");
		datos = dato;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 546);
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
		textField_2.setBounds(156, 130, 140, 25);
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
		textField_3.setBounds(156, 166, 140, 25);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Sexo:");
		lblNewLabel_3.setBounds(118, 171, 32, 16);
		contentPane.add(lblNewLabel_3);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(156, 202, 140, 25);
		contentPane.add(dateChooser);
		
		textField_4 = new JTextField();
		textField_4.setBounds(156, 94, 140, 25);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nro. de documento:");
		lblNewLabel_4.setBounds(40, 134, 110, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_5.setBounds(35, 211, 120, 16);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(156, 238, 140, 25);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_3_1 = new JLabel("Num. Celular:");
		lblNewLabel_3_1.setBounds(81, 243, 75, 16);
		contentPane.add(lblNewLabel_3_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(156, 274, 140, 25);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_3_2 = new JLabel("Nacionalidad:");
		lblNewLabel_3_2.setBounds(81, 279, 76, 16);
		contentPane.add(lblNewLabel_3_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(156, 310, 140, 25);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_3_3 = new JLabel("Codigo Postal:");
		lblNewLabel_3_3.setBounds(77, 315, 81, 16);
		contentPane.add(lblNewLabel_3_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(156, 346, 140, 25);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_3_4 = new JLabel("Domicilio:");
		lblNewLabel_3_4.setBounds(100, 351, 55, 16);
		contentPane.add(lblNewLabel_3_4);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(156, 382, 140, 25);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel_3_5 = new JLabel("Departamento:");
		lblNewLabel_3_5.setBounds(73, 387, 84, 16);
		contentPane.add(lblNewLabel_3_5);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(156, 418, 140, 25);
		contentPane.add(textField_10);
		
		JLabel lblNewLabel_3_6 = new JLabel("Localidad:");
		lblNewLabel_3_6.setBounds(98, 423, 58, 16);
		contentPane.add(lblNewLabel_3_6);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setBounds(207, 471, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atras");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal MP = new MenuPrincipal(datos);
		        MP.setVisible(true);
		        RegistroAlumnos.this.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(100, 469, 65, 26);
		contentPane.add(btnNewButton_1);
	}
}
