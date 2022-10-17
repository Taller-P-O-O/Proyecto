package menus;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JList;

public class RegistroObras extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroObras frame = new RegistroObras();
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
	public RegistroObras() {
		setTitle("Registro de Obras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(156, 22, 140, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 58, 140, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(156, 130, 140, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Tipo:");
		lblNewLabel.setBounds(122, 27, 24, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tematica:");
		lblNewLabel_1.setBounds(99, 63, 47, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Titulo:");
		lblNewLabel_2.setBounds(116, 99, 30, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(156, 166, 140, 25);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Subtitulo:");
		lblNewLabel_3.setBounds(99, 135, 47, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(156, 94, 140, 25);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Autor Nro. 1:");
		lblNewLabel_4.setBounds(81, 171, 65, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Autor Nro. 2:");
		lblNewLabel_5.setBounds(77, 207, 69, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(156, 238, 140, 25);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_3_1 = new JLabel("Autor Nro. 3:");
		lblNewLabel_3_1.setBounds(81, 249, 65, 14);
		contentPane.add(lblNewLabel_3_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(156, 274, 140, 25);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_3_2 = new JLabel("Genero:");
		lblNewLabel_3_2.setBounds(107, 279, 39, 14);
		contentPane.add(lblNewLabel_3_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(156, 310, 140, 25);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_3_3 = new JLabel("Caracteristica:");
		lblNewLabel_3_3.setBounds(73, 315, 73, 14);
		contentPane.add(lblNewLabel_3_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(156, 346, 140, 25);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_3_4 = new JLabel("ISBN:");
		lblNewLabel_3_4.setBounds(116, 351, 30, 14);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Indice:");
		lblNewLabel_3_5.setBounds(107, 387, 39, 14);
		contentPane.add(lblNewLabel_3_5);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setBounds(143, 472, 89, 23);
		contentPane.add(btnNewButton);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(156, 202, 140, 25);
		contentPane.add(textField_10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(156, 382, 140, 79);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
