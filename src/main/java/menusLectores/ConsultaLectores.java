package menusLectores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;

public class ConsultaLectores extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 12, 681, 20);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("B");
		btnNewButton.setBounds(687, 11, 39, 21);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnNombre = new JRadioButton("Nombre");
		buttonGroup.add(rdbtnNombre);
		rdbtnNombre.setSelected(true);
		rdbtnNombre.setBounds(56, 39, 63, 23);
		contentPane.add(rdbtnNombre);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Apellido");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(162, 39, 63, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Alumno");
		rdbtnNewRadioButton_1_1.setBounds(364, 39, 61, 23);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Profesor");
		rdbtnNewRadioButton_1_2.setBounds(490, 39, 67, 23);
		contentPane.add(rdbtnNewRadioButton_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_3 = new JRadioButton("Publ. General");
		rdbtnNewRadioButton_1_3.setBounds(604, 39, 89, 23);
		contentPane.add(rdbtnNewRadioButton_1_3);
		
		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("DNI");
		buttonGroup.add(rdbtnNewRadioButton_1_4);
		rdbtnNewRadioButton_1_4.setBounds(264, 39, 43, 23);
		contentPane.add(rdbtnNewRadioButton_1_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 69, 706, 343);
		contentPane.add(scrollPane);
		
		JButton btnNewButton_1 = new JButton("Registrar edicion");
		btnNewButton_1.setBounds(375, 423, 113, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("Listado de ediciones");
		btnNewButton_1_2.setBounds(209, 423, 138, 23);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Ver indice");
		btnNewButton_1_3.setBounds(533, 423, 113, 23);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_2 = new JButton("Atras");
		btnNewButton_2.setBounds(93, 423, 89, 23);
		contentPane.add(btnNewButton_2);
	}

}
