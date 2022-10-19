package menusLibros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;

public class RegistroEjemplar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroEjemplar frame = new RegistroEjemplar();
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
	public RegistroEjemplar() {
		setTitle("Registro ejemplar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(174, 27, 140, 25);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 63, 140, 25);
		contentPane.add(textField_1);
		
		JLabel lblCodigoDeBarras = new JLabel("Codigo de barras:");
		lblCodigoDeBarras.setBounds(82, 32, 86, 14);
		contentPane.add(lblCodigoDeBarras);
		
		JLabel lblNewLabel_1 = new JLabel("Posicion biblioteca:");
		lblNewLabel_1.setBounds(74, 68, 90, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID:");
		lblNewLabel_2.setBounds(153, 104, 15, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(174, 171, 140, 25);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha adquisicion:");
		lblNewLabel_3.setBounds(82, 140, 88, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(174, 99, 140, 25);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel = new JLabel("Forma de adquisicion");
		lblNewLabel.setBounds(68, 176, 100, 14);
		contentPane.add(lblNewLabel);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(174, 140, 140, 20);
		contentPane.add(dateChooser);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setBounds(237, 227, 77, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atras");
		btnNewButton_1.setBounds(142, 227, 59, 23);
		contentPane.add(btnNewButton_1);
	}
}
