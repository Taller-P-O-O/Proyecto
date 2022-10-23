package menusLibros;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JYearChooser;

import biblioteca.ConexionObjetosMenus;
import biblioteca.Obra;
import menus.MenuPrincipal;

public class RegistrarEdicion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private final ConexionObjetosMenus datos;
	private final Obra libro;


	public RegistrarEdicion(ConexionObjetosMenus dato, Obra lib) {
		setTitle("Registro edicion");
		datos = dato;
		libro = lib;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    this.setResizable(false); 
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(180, 11, 140, 25);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(180, 47, 140, 25);
		contentPane.add(textField_1);
		

		
		JLabel lblEditorial = new JLabel("Editorial:");
		lblEditorial.setBounds(128, 16, 49, 16);
		contentPane.add(lblEditorial);
		
		JLabel lblNewLabel_1 = new JLabel("Pais Edicion:");
		lblNewLabel_1.setBounds(105, 51, 72, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Numero Edicion:");
		lblNewLabel_2.setBounds(80, 87, 92, 16);
		contentPane.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(180, 83, 140, 25);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_3 = new JLabel("Año:");
		lblNewLabel_3.setBounds(147, 124, 25, 16);
		contentPane.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(180, 155, 140, 25);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_4 = new JLabel("Volumen:");
		lblNewLabel_4.setBounds(123, 160, 53, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Paginas:");
		lblNewLabel_5.setBounds(129, 196, 49, 16);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(180, 191, 140, 25);
		contentPane.add(textField_5);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(177, 227, 140, 25);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_3_3 = new JLabel("Idioma:");
		lblNewLabel_3_3.setBounds(131, 232, 41, 16);
		contentPane.add(lblNewLabel_3_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(177, 263, 140, 25);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_3_4 = new JLabel("Formato:");
		lblNewLabel_3_4.setBounds(120, 268, 50, 16);
		contentPane.add(lblNewLabel_3_4);
		
		final JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(180, 124, 48, 20);
		contentPane.add(yearChooser);
		JButton btnNewButton = new JButton("Registrar");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(175, 299, 140, 74);
		contentPane.add(scrollPane);
		
		final JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(textField.getText().trim().isEmpty()) && !(textField_1.getText().trim().isEmpty()) && !(textField_3.getText().trim().isEmpty()) && !(textField_4.getText().trim().isEmpty()) && !(textField_5.getText().trim().isEmpty()) && !(textField_7.getText().trim().isEmpty()) && !(textField_8.getText().trim().isEmpty()) && !(textPane.getText().trim().isEmpty())
					&& validarTex(textField.getText().trim()) && validarTex(textField_1.getText().trim()) && validarNum(textField_3.getText().trim()) && validarNum(Integer.toString(yearChooser.getYear())) && validarNum(textField_4.getText().trim()) && validarNum(textField_5.getText().trim()) &&  validarTex(textField_7.getText().trim()) && validarTex(textField_8.getText().trim())) {
					if(!(datos.ComprobarEdicion(libro, textField.getText().trim(), textField_1.getText().trim(), Integer.parseInt(textField_3.getText().trim()), yearChooser.getYear(), Integer.parseInt(textField_4.getText().trim()), textField_7.getText().trim(), textField_8.getText().trim()))) {
						try {
							libro.agregarEdicion(textField.getText().trim(), textField_1.getText().trim(), Integer.parseInt(textField_3.getText().trim()), yearChooser.getYear(), Integer.parseInt(textField_4.getText().trim()), Integer.parseInt(textField_5.getText().trim()), textField_7.getText().trim(), textField_8.getText().trim(), textPane.getText().trim());
		                   	   JOptionPane.showMessageDialog(null, "La edicion se a registrado correctamente", "Registro completo", JOptionPane.INFORMATION_MESSAGE);
						} catch(IllegalArgumentException a) {
							JOptionPane.showMessageDialog(null, "Error en el ingreso de datos", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}else {
						JOptionPane.showMessageDialog(null, "Esta Edicion ya se encuentra cargada", "Error", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Error en el ingreso de datos", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(243, 386, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Observaciones generales:");
		lblNewLabel_3_4_1.setBounds(23, 302, 149, 16);
		contentPane.add(lblNewLabel_3_4_1);

		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaObras ConOb = new ConsultaObras(datos);
		        ConOb.setVisible(true);
		        RegistrarEdicion.this.setVisible(false);
			}
		});
		btnAtras.setBounds(123, 386, 89, 23);
		contentPane.add(btnAtras);
	}
	
	public static boolean validarTex(String nom) {
		return nom.matches("[a-zA-Z]*");
	}

	public static boolean validarNum(String nom) {
		return nom.matches("[0-9]*");
	}
}
