package menusLibros;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JYearChooser;

import biblioteca.ConexionObjetosMenus;

public class RegistrarEdicion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private final ConexionObjetosMenus datos;


	public RegistrarEdicion(ConexionObjetosMenus dato) {
		setTitle("Registro edicion");
		datos = dato;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

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
		lblEditorial.setBounds(128, 16, 42, 14);
		contentPane.add(lblEditorial);
		
		JLabel lblNewLabel_1 = new JLabel("Pais Edicion:");
		lblNewLabel_1.setBounds(111, 52, 59, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Numero Edicion:");
		lblNewLabel_2.setBounds(93, 88, 77, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(180, 155, 140, 25);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_3 = new JLabel("Año:");
		lblNewLabel_3.setBounds(147, 124, 23, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(180, 83, 140, 25);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_4 = new JLabel("Volumen:");
		lblNewLabel_4.setBounds(123, 160, 47, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Paginas:");
		lblNewLabel_5.setBounds(129, 196, 41, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(180, 227, 140, 25);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_3_1 = new JLabel("Volumen:");
		lblNewLabel_3_1.setBounds(123, 232, 47, 14);
		contentPane.add(lblNewLabel_3_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(180, 263, 140, 25);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_3_2 = new JLabel("Paginas:");
		lblNewLabel_3_2.setBounds(129, 268, 41, 14);
		contentPane.add(lblNewLabel_3_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(180, 299, 140, 25);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_3_3 = new JLabel("Idioma:");
		lblNewLabel_3_3.setBounds(134, 304, 36, 14);
		contentPane.add(lblNewLabel_3_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(180, 335, 140, 25);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_3_4 = new JLabel("Formato:");
		lblNewLabel_3_4.setBounds(123, 340, 47, 14);
		contentPane.add(lblNewLabel_3_4);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(248, 463, 89, 23);
		contentPane.add(btnNewButton);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(180, 191, 140, 25);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Observaciones generales:");
		lblNewLabel_3_4_1.setBounds(45, 376, 125, 14);
		contentPane.add(lblNewLabel_3_4_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(180, 376, 140, 74);
		contentPane.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(128, 463, 89, 23);
		contentPane.add(btnAtras);
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(180, 124, 48, 20);
		contentPane.add(yearChooser);
	}
}
