package rankings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biblioteca.ConexionObjetosMenus;
import menus.MenuPrincipal;
import menusLibros.ConsultaObras;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrasMasSolicitadas extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ConexionObjetosMenus datos;


	public ObrasMasSolicitadas(ConexionObjetosMenus dato) {
		setTitle("Obras mas solicitadas");
		datos = dato;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Publico General");
		rdbtnNewRadioButton_1_2.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton_1_2);
		rdbtnNewRadioButton_1_2.setBounds(448, 401, 114, 24);
		contentPane.add(rdbtnNewRadioButton_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_3 = new JRadioButton("Alumnos y profesores");
		rdbtnNewRadioButton_1_3.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton_1_3);
		rdbtnNewRadioButton_1_3.setBounds(565, 401, 150, 24);
		contentPane.add(rdbtnNewRadioButton_1_3);
		
		JButton btnNewButton_2 = new JButton("Atras");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal MP = new MenuPrincipal(datos);
		        MP.setVisible(true);
		        ObrasMasSolicitadas.this.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(73, 401, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 709, 383);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
