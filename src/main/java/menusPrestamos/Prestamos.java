package menusPrestamos;

import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import biblioteca.ConexionObjetosMenus;
import biblioteca.Edicion;
import biblioteca.Ejemplar;
import biblioteca.Lector;
import biblioteca.Obra;
import biblioteca.Profesor;
import menusLibros.BajaEjemplar;
import menusLibros.ListaEjemplares;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;
import java.awt.event.ActionEvent;

public class Prestamos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private final ConexionObjetosMenus datos;
	private final Obra libro;
	private final Edicion edicion;
	private final Ejemplar ejemplar;
	private DefaultTableModel model;

	public Prestamos(ConexionObjetosMenus dato, Obra lib, Edicion edic, Ejemplar ejem) {
		setTitle("Prestamos");
		datos = dato;
		libro = lib;
		edicion = edic;
		ejemplar = ejem;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 12, 703, 20);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnNewButton.setBounds(708, 12, 75, 21);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 773, 338);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		model = new DefaultTableModel(){ @Override public boolean isCellEditable(int row, int column) { return false; } };

	    table.setModel(model);
		
		
		final JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner.setBounds(420, 389, 78, 20);
		contentPane.add(spinner);
		
		JButton btnNewButton_1 = new JButton("Concretar prestamo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int fila;
				 try {
					 fila = table.getSelectedRow();
				     if (fila == -1){JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
				         }else{
                             String tipodni = (String) table.getValueAt(fila, 3); 
				        	 Integer dni = (Integer) table.getValueAt(fila, 4); 
				        	 if(datos.BuscarLector(tipodni, dni).getFechaFinUltimaMulta() != null) {
				        	 if(datos.BuscarLector(tipodni, dni).getFechaFinUltimaMulta().isBefore(LocalDate.now())) {
                            datos.crearPrestamo(ejemplar, Integer.parseInt(spinner.getValue().toString()), datos.BuscarLector(tipodni, dni), datos.getUsuarioActivo().getNombreYApellido(), libro.getTematica());
                        	JOptionPane.showMessageDialog(null, "El prestamo se a registrado correctamente", "Registro completo", JOptionPane.INFORMATION_MESSAGE);
                            ListaEjemplares ListEjem = new ListaEjemplares(datos, libro, edicion);
            				ListEjem.setVisible(true);
            		        Prestamos.this.setVisible(false);
				        	 }else {
				        		 JOptionPane.showMessageDialog(null,"Error", ("El lector se encuentra multado, su multa finaliza el dia: " + datos.BuscarLector(tipodni, dni).getFechaFinUltimaMulta()) , JOptionPane.ERROR_MESSAGE); 
				        	 }
				        	 } else {
				        		    datos.crearPrestamo(ejemplar, Integer.parseInt(spinner.getValue().toString()), datos.BuscarLector(tipodni, dni), datos.getUsuarioActivo().getNombreYApellido(), libro.getTematica());
		                        	JOptionPane.showMessageDialog(null, "El prestamo se a registrado correctamente", "Registro completo", JOptionPane.INFORMATION_MESSAGE);
		                            ListaEjemplares ListEjem = new ListaEjemplares(datos, libro, edicion);
		            				ListEjem.setVisible(true);
		            		        Prestamos.this.setVisible(false);
				        	 }
				        	 }
				 }catch(HeadlessException a){
					 JOptionPane.showMessageDialog(null,"Error", "Int??ntelo nuevamente", JOptionPane.ERROR_MESSAGE);
				 }
			}	
		});
		btnNewButton_1.setBounds(387, 431, 149, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Atras");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaEjemplares ListEjem = new ListaEjemplares(datos, libro, edicion);
				ListEjem.setVisible(true);
		        Prestamos.this.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(268, 431, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Cantidad dias de prestamo:");
		lblNewLabel.setBounds(260, 393, 155, 16);
		contentPane.add(lblNewLabel);
		
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
