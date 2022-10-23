package menusLibros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.toedter.calendar.JDateChooser;

import biblioteca.ConexionObjetosMenus;
import biblioteca.Edicion;
import biblioteca.Obra;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.ZoneId;
import java.awt.event.ActionEvent;

public class RegistroEjemplar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private final ConexionObjetosMenus datos;
	private final Obra libro;
	private final Edicion edicion;


	public RegistroEjemplar(ConexionObjetosMenus dato, Obra lib, Edicion edi) {
		setTitle("Registro ejemplar");
		datos = dato;
		libro = lib;
		edicion = edi;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(174, 27, 140, 25);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 63, 140, 25);
		contentPane.add(textField_1);
		
		JLabel lblCodigoDeBarras = new JLabel("Codigo de barras:");
		lblCodigoDeBarras.setBounds(73, 31, 100, 16);
		contentPane.add(lblCodigoDeBarras);
		
		JLabel lblNewLabel_1 = new JLabel("Posicion biblioteca:");
		lblNewLabel_1.setBounds(63, 67, 110, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID:");
		lblNewLabel_2.setBounds(153, 104, 15, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(174, 100, 140, 25);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha adquisicion:");
		lblNewLabel_3.setBounds(63, 146, 105, 16);
		contentPane.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(174, 171, 140, 25);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel = new JLabel("Forma de adquisicion:");
		lblNewLabel.setBounds(47, 175, 124, 16);
		contentPane.add(lblNewLabel);
		
		final JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(174, 140, 140, 20);
		dateChooser.getDateEditor().setEnabled(false);
		contentPane.add(dateChooser);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(textField.getText().trim().isEmpty()) && !(textField_1.getText().trim().isEmpty()) && !(textField_3.getText().trim().isEmpty()) && !(textField_4.getText().trim().isEmpty()) && !(dateChooser.getDate() == null)
					&& validarNum(textField.getText().trim()) && validarNum(textField_3.getText().trim())) {
				if(!(datos.comprobarEjemplar(libro, Integer.parseInt(textField_3.getText().trim())))) {
					try {
						libro.agregarEjemplar(Integer.parseInt(textField.getText().trim()), textField_1.getText().trim(), Integer.parseInt(textField_3.getText().trim()), dateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), textField_4.getText().trim(), edicion);
						JOptionPane.showMessageDialog(null, "El ejemplar se a registrado correctamente", "Registro completo", JOptionPane.INFORMATION_MESSAGE);
					} catch(IllegalArgumentException a) {
						JOptionPane.showMessageDialog(null, "Error en el ingreso de datos", "Error", JOptionPane.ERROR_MESSAGE);
					}
					} else {
						JOptionPane.showMessageDialog(null, "Este Ejemplar ya se encuentra cargado", "Error", JOptionPane.ERROR_MESSAGE);
					}	
				}else {
					JOptionPane.showMessageDialog(null, "Error en el ingreso de datos", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(237, 227, 87, 26);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atras");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarEdiciones ConEdi = new ConsultarEdiciones(datos, libro);
		        ConEdi.setVisible(true);
		        RegistroEjemplar.this.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(142, 227, 65, 26);
		contentPane.add(btnNewButton_1);
	}
	
	public static boolean validarTex(String nom) {
		return nom.matches("[a-zA-Z]*");
	}

	public static boolean validarNum(String nom) {
		return nom.matches("[0-9]*");
	}
}
