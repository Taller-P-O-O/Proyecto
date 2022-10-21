package menusPrestamos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biblioteca.ConexionObjetosMenus;
import menus.MenuPrincipal;
import menusLectores.ConsultaLectores;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaPrestamos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();
    private final ConexionObjetosMenus datos;

	public ConsultaPrestamos(ConexionObjetosMenus dato) {
		setTitle("Consulta prestamos");
		datos = dato;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setColumns(10);
		textField.setBounds(10, 12, 584, 20);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(587, 12, 75, 20);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrar devolucion");
		btnNewButton_1.setBounds(279, 363, 151, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Multar");
		btnNewButton_1_1.setBounds(462, 363, 70, 26);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Atras");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal MP = new MenuPrincipal(datos);
		        MP.setVisible(true);
		        ConsultaPrestamos.this.setVisible(false);
			}
		});
		btnNewButton_1_2.setBounds(192, 363, 65, 26);
		contentPane.add(btnNewButton_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 64, 642, 288);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JRadioButton rdbtnNombreObra = new JRadioButton("Nombre obra");
		buttonGroup.add(rdbtnNombreObra);
		rdbtnNombreObra.setSelected(true);
		rdbtnNombreObra.setBounds(50, 36, 99, 24);
		contentPane.add(rdbtnNombreObra);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Nombre lector");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(186, 36, 106, 24);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("DNI");
		buttonGroup.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setBounds(418, 36, 44, 24);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Fuera de termino");
		buttonGroup.add(rdbtnNewRadioButton_1_2);
		rdbtnNewRadioButton_1_2.setBounds(511, 36, 121, 24);
		contentPane.add(rdbtnNewRadioButton_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("ID");
		buttonGroup.add(rdbtnNewRadioButton_1_4);
		rdbtnNewRadioButton_1_4.setBounds(333, 36, 37, 23);
		contentPane.add(rdbtnNewRadioButton_1_4);
	}
}
