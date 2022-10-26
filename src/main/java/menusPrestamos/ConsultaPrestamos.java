package menusPrestamos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import biblioteca.ConexionObjetosMenus;
import biblioteca.Ejemplar;
import biblioteca.Prestamo;
import menus.MenuPrincipal;
import menusLectores.ConsultaLectores;
import menusLibros.ConsultaObras;
import menusLibros.RegistrarEdicion;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;
import java.awt.event.ActionEvent;

public class ConsultaPrestamos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();
    private final ConexionObjetosMenus datos;
	private DefaultTableModel model;

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
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		JButton btnNewButton_1 = new JButton("Registrar devolucion");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int fila;
				 try {
					 fila = table.getSelectedRow();
				     if (fila == -1){JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
				         }else{
				        	 String obra = (String) table.getValueAt(fila, 1);
				        	 Integer IdEjemplar = (Integer) table.getValueAt(fila, 2);
				        	 String tipoDoc = (String) table.getValueAt(fila, 6);
				        	 Integer numDni = (Integer) table.getValueAt(fila, 5);
				        	 datos.buscarPrestamo(tipoDoc, numDni, obra, IdEjemplar).registrarDevolucion(datos.getUsuarioActivo().getNombreYApellido());
				        	 if(datos.buscarPrestamo(tipoDoc, numDni, obra, IdEjemplar).getFechaEstimadaDevol().isBefore(LocalDate.now())) {
				        			Multa Mul = new Multa(datos, datos.buscarPrestamo(tipoDoc, numDni, obra, IdEjemplar));
				    		        Mul.setVisible(true);
				    		        ConsultaPrestamos.this.setVisible(false);
				        	 } else {
				        		ConsultaPrestamos ConPre = new ConsultaPrestamos(datos);
				 				ConPre.setVisible(true);
				 				ConsultaPrestamos.this.setVisible(false);
				        	 }
				         } }catch(HeadlessException a){
					 JOptionPane.showMessageDialog(null,"Error", "Inténtelo nuevamente", JOptionPane.ERROR_MESSAGE);
				 }
			} 
		});
		
		btnNewButton_1.setBounds(364, 363, 151, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("Atras");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal MP = new MenuPrincipal(datos);
		        MP.setVisible(true);
		        ConsultaPrestamos.this.setVisible(false);
			}
		});
		btnNewButton_1_2.setBounds(203, 363, 65, 26);
		contentPane.add(btnNewButton_1_2);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 64, 642, 288);
		contentPane.add(scrollPane);
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
		
		model = new DefaultTableModel(){ @Override public boolean isCellEditable(int row, int column) { return false; } };
	    table.setModel(model);
	    
		model.addColumn("Obra");
		model.addColumn("ISBN");
		model.addColumn("ID ejemplar");
		model.addColumn("Area de referencia");
		model.addColumn("Lector");
		model.addColumn("DNI");
		model.addColumn("Tipo doc.");
		model.addColumn("dias de prestamo");
		model.addColumn("Fecha de devolucion");
		
	    table.getTableHeader().setReorderingAllowed(false);
	    llenarTabla();
	}
	
	public void llenarTabla() {
		List<Prestamo> listaPrestamos = datos.getPrestamos();
		

		for(Prestamo prestamo : listaPrestamos) {
			if(prestamo.getFechaDevol() == null) {
			Object[] fila = new Object[9];
				
			fila[0] = prestamo.getEjemplarPrestado().getEdicion().getObra().getTitulo();
			fila[1] = prestamo.getEjemplarPrestado().getEdicion().getObra().getISBN();
			fila[2] = prestamo.getEjemplarPrestado().getIDUnica();
			fila[3] = prestamo.getEjemplarPrestado().getEdicion().getObra().getTematica();
			fila[4] = (prestamo.getPrestatario().getNombre() + " " + prestamo.getPrestatario().getApellido());
			fila[5] = prestamo.getPrestatario().getDni();
			fila[6] = prestamo.getPrestatario().getTipo();
			fila[7] = prestamo.getDiasPrestamo();
			fila[8] = prestamo.getFechaEstimadaDevol();

			model.addRow(fila);
			}}
	}
	
}
	

