package menusLibros;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biblioteca.ConexionObjetosMenus;
import menus.MenuPrincipal;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaObras extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;
	private final ConexionObjetosMenus datos;


	public ConsultaObras(ConexionObjetosMenus dato) {
		setTitle("Buscador obras");
		datos = dato;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 645, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(651, 11, 75, 20);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Titulo");
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(20, 38, 56, 24);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Autor");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(129, 38, 56, 24);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("ISBN");
		buttonGroup.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setBounds(364, 38, 52, 24);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Indice");
		buttonGroup.add(rdbtnNewRadioButton_1_2);
		rdbtnNewRadioButton_1_2.setBounds(490, 38, 59, 24);
		contentPane.add(rdbtnNewRadioButton_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_3 = new JRadioButton("Tematica");
		buttonGroup.add(rdbtnNewRadioButton_1_3);
		rdbtnNewRadioButton_1_3.setBounds(628, 38, 78, 24);
		contentPane.add(rdbtnNewRadioButton_1_3);
		
		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("Genero");
		buttonGroup.add(rdbtnNewRadioButton_1_4);
		rdbtnNewRadioButton_1_4.setBounds(232, 38, 66, 24);
		contentPane.add(rdbtnNewRadioButton_1_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 68, 706, 343);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("Registrar edicion");
		btnNewButton_1.setBounds(384, 422, 131, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("Listado de ediciones");
		btnNewButton_1_2.setBounds(209, 422, 151, 26);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Ver indice");
		btnNewButton_1_3.setBounds(527, 424, 113, 23);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_2 = new JButton("Atras");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal MP = new MenuPrincipal(datos);
		        MP.setVisible(true);
		        ConsultaObras.this.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(93, 422, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
