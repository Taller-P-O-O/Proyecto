package menusLectores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import biblioteca.ConexionObjetosMenus;
import biblioteca.Lector;
import biblioteca.Profesor;
import menus.MenuPrincipal;
import menusLibros.RegistroObras;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class ConsultaLectores extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ConexionObjetosMenus datos;
	private JTable table;
	private DefaultTableModel model;

	@SuppressWarnings("serial")
	public ConsultaLectores(ConexionObjetosMenus dato) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		datos = dato;
		setBounds(100, 100, 1110, 651);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 14, 1000, 20);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(1007, 14, 75, 20);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnNombre = new JRadioButton("Nombre");
		buttonGroup.add(rdbtnNombre);
		rdbtnNombre.setSelected(true);
		rdbtnNombre.setBounds(88, 39, 70, 24);
		contentPane.add(rdbtnNombre);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Apellido");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(273, 39, 70, 24);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Alumno");
		buttonGroup_1.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setBounds(600, 39, 68, 24);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Profesor");
		buttonGroup_1.add(rdbtnNewRadioButton_1_2);
		rdbtnNewRadioButton_1_2.setBounds(755, 39, 75, 24);
		contentPane.add(rdbtnNewRadioButton_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_3 = new JRadioButton("Publ. General");
		buttonGroup_1.add(rdbtnNewRadioButton_1_3);
		rdbtnNewRadioButton_1_3.setBounds(936, 39, 100, 24);
		contentPane.add(rdbtnNewRadioButton_1_3);
		
		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("DNI");
		buttonGroup.add(rdbtnNewRadioButton_1_4);
		rdbtnNewRadioButton_1_4.setBounds(445, 39, 44, 24);
		contentPane.add(rdbtnNewRadioButton_1_4);
		
		JButton btnNewButton_2 = new JButton("Atras");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal MP = new MenuPrincipal(datos);
		        MP.setVisible(true);
		        ConsultaLectores.this.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(270, 576, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 71, 1072, 491);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		model = new DefaultTableModel(){ @Override public boolean isCellEditable(int row, int column) { return false; } };

	    table.setModel(model);
	    
	    JButton btnNewButton_1 = new JButton("Multas");
	    btnNewButton_1.setBounds(481, 574, 98, 26);
	    contentPane.add(btnNewButton_1);
	    
	    JButton btnNewButton_3 = new JButton("Prestamos");
	    btnNewButton_3.setBounds(702, 574, 98, 26);
	    contentPane.add(btnNewButton_3);
		
		model.addColumn("Tipo");
		model.addColumn("Nombre");
		model.addColumn("Apellido");
		model.addColumn("Tipo de documento");
		model.addColumn("Numero de documento");
		model.addColumn("Sexo");
		model.addColumn("Correo");
		model.addColumn("Fecha de nacimiento");
        model.addColumn("Numero de celular");
        model.addColumn("Nacionalidad");
        model.addColumn("Codigo postal");
        model.addColumn("Domicilio");
        model.addColumn("Departamento");
        model.addColumn("Localidad");	
        model.addColumn("Carreras");
        table.getTableHeader().setReorderingAllowed(false); 
        
        llenarTabla();
	}
	
	public void llenarTabla() {
		List<Lector> listaLectores = datos.getLectores();
		
		for(Lector lector : listaLectores) {
			Object[] fila = new Object[15];
			
			fila[0] = lector.getClass().getSimpleName();
			fila[1] = lector.getNombre();
			fila[2] = lector.getApellido();
			fila[3] = lector.getTipo();
			fila[4] = lector.getDni();
			fila[5] = lector.getSexo();
			fila[6] = lector.getCorreo();
			fila[7] = lector.getFechaNac();
			fila[8] = lector.getNumCel();
			fila[9] = lector.getNacionalidad();
			fila[10] = lector.getCodigoPostal();
			fila[11] = lector.getDomicilio();	
			fila[12] = lector.getDepartamento();
			fila[13] = lector.getLocalidad();
			if (lector instanceof Profesor) {
				fila[14] = ((Profesor) lector).getCarreras();
           } else {
	            fila[14] = "";
              }
			model.addRow(fila);
		  }
	 }
 }
