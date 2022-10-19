package menusLibros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class ConsultarEdiciones extends JFrame {

	private JPanel contentPane;
	private JTextField txtIngreseNombreDe;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarEdiciones frame = new ConsultarEdiciones();
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
	public ConsultarEdiciones() {
		setTitle("Buscador de ediciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIngreseNombreDe = new JTextField();
		txtIngreseNombreDe.setToolTipText("");
		txtIngreseNombreDe.setColumns(10);
		txtIngreseNombreDe.setBounds(22, 11, 608, 20);
		contentPane.add(txtIngreseNombreDe);
		
		JButton btnNewButton = new JButton("B");
		btnNewButton.setBounds(630, 10, 39, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 41, 647, 285);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("Listado ejemplares");
		btnNewButton_1.setBounds(275, 345, 121, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Registrar ejemplar");
		btnNewButton_1_1.setBounds(406, 345, 121, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Atras");
		btnNewButton_1_2.setBounds(194, 345, 59, 23);
		contentPane.add(btnNewButton_1_2);
	}
}
