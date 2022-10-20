package menusReservas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;

public class ConsultaReservas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaReservas frame = new ConsultaReservas();
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
	public ConsultaReservas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setColumns(10);
		textField.setBounds(10, 12, 608, 20);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("B");
		btnNewButton.setBounds(618, 11, 39, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrar prestamo");
		btnNewButton_1.setBounds(343, 363, 125, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("Atras");
		btnNewButton_1_2.setBounds(228, 363, 59, 23);
		contentPane.add(btnNewButton_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 66, 642, 288);
		contentPane.add(scrollPane);
		
		JRadioButton rdbtnNombreObra = new JRadioButton("Nombre obra");
		rdbtnNombreObra.setSelected(true);
		rdbtnNombreObra.setBounds(50, 36, 87, 23);
		contentPane.add(rdbtnNombreObra);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Nombre lector");
		rdbtnNewRadioButton_1.setBounds(186, 36, 93, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("DNI");
		rdbtnNewRadioButton_1_1.setBounds(418, 36, 43, 23);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("ID");
		rdbtnNewRadioButton_1_4.setBounds(333, 36, 37, 23);
		contentPane.add(rdbtnNewRadioButton_1_4);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Fuera de termino");
		rdbtnNewRadioButton_1_2.setBounds(511, 36, 107, 23);
		contentPane.add(rdbtnNewRadioButton_1_2);
	}

}
