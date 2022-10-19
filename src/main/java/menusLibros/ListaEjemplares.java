package menusLibros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListaEjemplares extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaEjemplares frame = new ListaEjemplares();
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
	public ListaEjemplares() {
		setTitle("Buscador ejemplares");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 413);
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
		
		JButton btnNewButton_1 = new JButton("Dar de baja");
		btnNewButton_1.setBounds(230, 346, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Reservar");
		btnNewButton_1_1.setBounds(352, 346, 77, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Atras");
		btnNewButton_1_2.setBounds(145, 346, 59, 23);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_1 = new JButton("Prestamo");
		btnNewButton_1_1_1.setBounds(456, 346, 77, 23);
		contentPane.add(btnNewButton_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 646, 292);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
