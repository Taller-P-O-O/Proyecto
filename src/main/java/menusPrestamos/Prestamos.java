package menusPrestamos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biblioteca.ConexionObjetosMenus;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Prestamos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private final ConexionObjetosMenus datos;


	public Prestamos(ConexionObjetosMenus dato) {
		setTitle("Prestamos");
		datos = dato;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 12, 575, 20);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("B");
		btnNewButton.setBounds(584, 12, 39, 21);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 613, 150);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("Concretar prestamo");
		btnNewButton_1.setBounds(326, 270, 129, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Atras");
		btnNewButton_2.setBounds(207, 270, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Cantidad dias de prestamo:");
		lblNewLabel.setBounds(207, 231, 132, 14);
		contentPane.add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner.setBounds(359, 228, 78, 20);
		contentPane.add(spinner);
	}
}
