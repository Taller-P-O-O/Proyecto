package menusLectores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import menus.MenuPrincipal;
import menusLibros.RegistroObras;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaLectores extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaLectores frame = new ConsultaLectores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConsultaLectores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 746, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 14, 646, 20);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(655, 14, 75, 20);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnNombre = new JRadioButton("Nombre");
		buttonGroup.add(rdbtnNombre);
		rdbtnNombre.setSelected(true);
		rdbtnNombre.setBounds(56, 39, 70, 24);
		contentPane.add(rdbtnNombre);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Apellido");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(164, 39, 70, 24);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Alumno");
		buttonGroup_1.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setBounds(400, 39, 68, 24);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Profesor");
		buttonGroup_1.add(rdbtnNewRadioButton_1_2);
		rdbtnNewRadioButton_1_2.setBounds(498, 39, 75, 24);
		contentPane.add(rdbtnNewRadioButton_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_3 = new JRadioButton("Publ. General");
		buttonGroup_1.add(rdbtnNewRadioButton_1_3);
		rdbtnNewRadioButton_1_3.setBounds(605, 39, 100, 24);
		contentPane.add(rdbtnNewRadioButton_1_3);
		
		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("DNI");
		buttonGroup.add(rdbtnNewRadioButton_1_4);
		rdbtnNewRadioButton_1_4.setBounds(273, 39, 44, 24);
		contentPane.add(rdbtnNewRadioButton_1_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 69, 706, 343);
		contentPane.add(scrollPane);
		
		JButton btnNewButton_1 = new JButton("Registrar edicion");
		btnNewButton_1.setBounds(400, 423, 131, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("Listado de ediciones");
		btnNewButton_1_2.setBounds(209, 423, 151, 26);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Ver indice");
		btnNewButton_1_3.setBounds(554, 423, 91, 26);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_2 = new JButton("Atras");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal MP = new MenuPrincipal();
		        MP.setVisible(true);
		        ConsultaLectores.this.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(93, 423, 89, 23);
		contentPane.add(btnNewButton_2);
	}

}
