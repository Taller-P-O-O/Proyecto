package menusReservas;

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
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaReservas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ConexionObjetosMenus datos;


	public ConsultaReservas(ConexionObjetosMenus dato) {
		setTitle("Consulta Reservas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		datos = dato;
		setBounds(100, 100, 684, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setColumns(10);
		textField.setBounds(10, 12, 588, 20);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(593, 12, 75, 20);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrar prestamo");
		btnNewButton_1.setBounds(343, 363, 145, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("Atras");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal MP = new MenuPrincipal(datos);
		        MP.setVisible(true);
		        ConsultaReservas.this.setVisible(false);
			}
		});
		btnNewButton_1_2.setBounds(228, 363, 65, 26);
		contentPane.add(btnNewButton_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 66, 642, 288);
		contentPane.add(scrollPane);
		
		JRadioButton rdbtnNombreObra = new JRadioButton("Nombre obra");
		rdbtnNombreObra.setSelected(true);
		rdbtnNombreObra.setBounds(50, 36, 99, 24);
		contentPane.add(rdbtnNombreObra);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Nombre lector");
		rdbtnNewRadioButton_1.setBounds(186, 36, 106, 24);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("DNI");
		rdbtnNewRadioButton_1_1.setBounds(418, 36, 44, 24);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("ID");
		rdbtnNewRadioButton_1_4.setBounds(333, 36, 37, 23);
		contentPane.add(rdbtnNewRadioButton_1_4);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Fuera de termino");
		rdbtnNewRadioButton_1_2.setBounds(511, 36, 121, 24);
		contentPane.add(rdbtnNewRadioButton_1_2);
	}

}
