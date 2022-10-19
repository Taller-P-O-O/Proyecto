package menusLibros;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class ConsultaObras extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaObras frame = new ConsultaObras();
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
	public ConsultaObras() {
		setTitle("Buscador obras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 681, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("B");
		btnNewButton.setBounds(687, 10, 39, 21);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Titulo");
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(20, 38, 51, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Autor");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(129, 38, 53, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("ISBN");
		buttonGroup.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setBounds(364, 38, 49, 23);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Indice");
		buttonGroup.add(rdbtnNewRadioButton_1_2);
		rdbtnNewRadioButton_1_2.setBounds(490, 38, 55, 23);
		contentPane.add(rdbtnNewRadioButton_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_3 = new JRadioButton("Tematica");
		buttonGroup.add(rdbtnNewRadioButton_1_3);
		rdbtnNewRadioButton_1_3.setBounds(628, 38, 69, 23);
		contentPane.add(rdbtnNewRadioButton_1_3);
		
		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("Genero");
		buttonGroup.add(rdbtnNewRadioButton_1_4);
		rdbtnNewRadioButton_1_4.setBounds(232, 38, 61, 23);
		contentPane.add(rdbtnNewRadioButton_1_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 68, 706, 343);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("Registrar edicion");
		btnNewButton_1.setBounds(375, 422, 113, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("Listado de ediciones");
		btnNewButton_1_2.setBounds(209, 422, 138, 23);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Ver indice");
		btnNewButton_1_3.setBounds(533, 422, 113, 23);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_2 = new JButton("Atras");
		btnNewButton_2.setBounds(93, 422, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
