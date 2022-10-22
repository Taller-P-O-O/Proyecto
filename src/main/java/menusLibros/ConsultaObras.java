package menusLibros;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import biblioteca.Coleccion;
import biblioteca.ConexionObjetosMenus;
import biblioteca.Lector;
import biblioteca.Obra;
import biblioteca.Profesor;
import menus.MenuPrincipal;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class ConsultaObras extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;
	private final ConexionObjetosMenus datos;
	private DefaultTableModel model;


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
		rdbtnNewRadioButton.setBounds(20, 36, 56, 24);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Autor");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(97, 36, 56, 24);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("ISBN");
		buttonGroup.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setBounds(251, 36, 52, 24);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Indice");
		buttonGroup.add(rdbtnNewRadioButton_1_2);
		rdbtnNewRadioButton_1_2.setBounds(317, 36, 59, 24);
		contentPane.add(rdbtnNewRadioButton_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_3 = new JRadioButton("Tematica");
		buttonGroup.add(rdbtnNewRadioButton_1_3);
		rdbtnNewRadioButton_1_3.setBounds(380, 36, 78, 24);
		contentPane.add(rdbtnNewRadioButton_1_3);
		
		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("Genero");
		buttonGroup.add(rdbtnNewRadioButton_1_4);
		rdbtnNewRadioButton_1_4.setBounds(170, 36, 66, 24);
		contentPane.add(rdbtnNewRadioButton_1_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 68, 706, 343);
		contentPane.add(scrollPane);
		

		
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
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Nombre coleccion");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(474, 36, 128, 24);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("ISBN coleccion");
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(606, 36, 110, 24);
		contentPane.add(rdbtnNewRadioButton_3);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		model = new DefaultTableModel();
	    table.setModel(model);
		
		model.addColumn("Clase");
		model.addColumn("Tipo");
		model.addColumn("Tematica");
		model.addColumn("Titulo");
		model.addColumn("Subtitulo");
		model.addColumn("Autor N1");
		model.addColumn("Autor N2");
		model.addColumn("Autor N3");
		model.addColumn("Genero");
		model.addColumn("ISBN");
		model.addColumn("Nombre coleccion");
        model.addColumn("ISBN coleccion");

        table.getTableHeader().setReorderingAllowed(false); 
        llenarTabla();
	}
	public void llenarTabla() {
		List<Obra> listaObras = datos.getObras();
		
		for(Obra obra : listaObras) {
			Object[] fila = new Object[12];
			
			fila[0] = obra.getClass().getSimpleName();
			fila[1] = obra.getTipo();
			fila[2] = obra.getTematica();
			fila[3] = obra.getTitulo();
			fila[4] = obra.getSubtitulo();
			fila[5] = obra.getAutor1();
			fila[6] = obra.getAutor2();
			fila[7] = obra.getAutor3();
			fila[8] = obra.getGenero();
			fila[9] = obra.getISBN();
			
			if (obra instanceof Coleccion) {
	        fila[10] = ((Coleccion) obra).getNombreColec();
	        fila[11] = ((Coleccion) obra).getISBNColec();
           } else {
   	         fila[10] = "";
   	         fila[11] = "";
              }
			model.addRow(fila);
		  }
	 }
}
