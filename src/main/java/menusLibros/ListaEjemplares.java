package menusLibros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import biblioteca.ConexionObjetosMenus;
import biblioteca.Edicion;
import biblioteca.Obra;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaEjemplares extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private final ConexionObjetosMenus datos;
	private final Obra libro;
	private final Edicion edicion;
	private DefaultTableModel model;


	public ListaEjemplares(ConexionObjetosMenus dato, Obra lib, Edicion edic ) {
		setTitle("Buscador ejemplares");
		datos = dato;
		libro = lib;
		edicion = edic;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setColumns(10);
		textField.setBounds(10, 12, 706, 20);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(714, 11, 75, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Dar de baja");
		btnNewButton_1.setBounds(299, 493, 98, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Reservar");
		btnNewButton_1_1.setBounds(435, 493, 86, 26);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Atras");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarEdiciones ConEdi = new ConsultarEdiciones(datos, libro);
		        ConEdi.setVisible(true);
		        ListaEjemplares.this.setVisible(false);
			}
		});
		btnNewButton_1_2.setBounds(187, 493, 65, 26);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_1 = new JButton("Prestamo");
		btnNewButton_1_1_1.setBounds(554, 493, 90, 26);
		contentPane.add(btnNewButton_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 779, 437);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		model = new DefaultTableModel(){ @Override public boolean isCellEditable(int row, int column) { return false; } };
	    table.setModel(model);
	}
}
