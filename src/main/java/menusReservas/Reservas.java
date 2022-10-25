package menusReservas;

import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import com.toedter.calendar.JDateChooser;

import biblioteca.ConexionObjetosMenus;
import biblioteca.Edicion;
import biblioteca.Ejemplar;
import biblioteca.Lector;
import biblioteca.Obra;
import biblioteca.Profesor;
import menusLibros.ListaEjemplares;
import menusPrestamos.Prestamos;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;

public class Reservas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private DefaultTableModel model;
	private ConexionObjetosMenus datos;
	private Obra libro;
	private Edicion edicion;
	private Ejemplar ejemplar;
	private LocalDate fechaReserva;



	public Reservas(ConexionObjetosMenus dato, Obra lib, Edicion edic, Ejemplar ejem, LocalDate fechaR) {
		setTitle("Reservas");
		datos = dato;
		libro = lib;
		edicion = edic;
		ejemplar = ejem;
		fechaReserva = fechaR;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 18, 628, 23);
		contentPane.add(textField);
		
		JButton btnNewButton_1 = new JButton("Concretar reserva");
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
                            datos.crearReserva(ejemplar, datos.BuscarLector(tipodni, dni), fechaReserva);
                        	JOptionPane.showMessageDialog(null, "La reserva se a registrado correctamente", "Registro completo", JOptionPane.INFORMATION_MESSAGE);
                            ListaEjemplares ListEjem = new ListaEjemplares(datos, libro, edicion);
            				ListEjem.setVisible(true);
            		        Reservas.this.setVisible(false);
				        	 }else {
				        		 JOptionPane.showMessageDialog(null,"Error", ("El lector se encuentra multado, su multa finaliza el dia: " + datos.BuscarLector(tipodni, dni).getFechaFinUltimaMulta()) , JOptionPane.ERROR_MESSAGE); 
				        	 }
				        	 } else {
				                 datos.crearReserva(ejemplar, datos.BuscarLector(tipodni, dni), fechaReserva);
		                        	JOptionPane.showMessageDialog(null, "La reserva se a registrado correctamente", "Registro completo", JOptionPane.INFORMATION_MESSAGE);
		                            ListaEjemplares ListEjem = new ListaEjemplares(datos, libro, edicion);
		            				ListEjem.setVisible(true);
		            		        Reservas.this.setVisible(false);
				        	 }
				        }
				 }catch(HeadlessException a){
					 JOptionPane.showMessageDialog(null,"Error", "Inténtelo nuevamente", JOptionPane.ERROR_MESSAGE);
				 }
			}	
		});
		btnNewButton_1.setBounds(423, 374, 138, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Atras");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaEjemplares ListEjem = new ListaEjemplares(datos, libro, edicion);
				ListEjem.setVisible(true);
		        Reservas.this.setVisible(false);
			}
		});
		
		btnNewButton_2.setBounds(167, 376, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(634, 19, 75, 21);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 52, 690, 311);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		model = new DefaultTableModel(){ @Override public boolean isCellEditable(int row, int column) { return false; } };
	    table.setModel(model);
		
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
