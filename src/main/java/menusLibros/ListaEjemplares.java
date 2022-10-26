package menusLibros;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import biblioteca.ConexionObjetosMenus;
import biblioteca.Edicion;
import biblioteca.Ejemplar;
import biblioteca.Obra;
import menusPrestamos.Prestamos;
import menusReservas.Reservas;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class ListaEjemplares extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private final ConexionObjetosMenus datos;
	private final Obra libro;
	private final Edicion edicion;
	private DefaultTableModel model;


	public ListaEjemplares(ConexionObjetosMenus dato, Obra lib, Edicion edic) {
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
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int fila;
				 try {
					 fila = table.getSelectedRow();
				     if (fila == -1){JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
				         }else{
                             Integer id = (Integer) table.getValueAt(fila, 4); 
                             if(datos.BuscarEjemplar(libro.getISBN(), id).isDadoBaja() == false) {
                             BajaEjemplar bajEjam = new BajaEjemplar(datos, libro, edicion, datos.BuscarEjemplar(libro.getISBN(), id));
                             bajEjam.setVisible(true);
                             ListaEjemplares.this.setVisible(false);} else {
                            	 JOptionPane.showMessageDialog(null, "Este ejemplar ya se encuentra dado de baja", "Baja ejemplar", JOptionPane.INFORMATION_MESSAGE); 
                             }
				         }
				 }catch(HeadlessException a){
					 JOptionPane.showMessageDialog(null,"Error", "Inténtelo nuevamente", JOptionPane.ERROR_MESSAGE);
				 }
			}
		});
		btnNewButton_1.setBounds(299, 493, 98, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Prestamo");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int fila;
				 try {
					 fila = table.getSelectedRow();
				     if (fila == -1){JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
				         }else{
                             Integer id = (Integer) table.getValueAt(fila, 4);
                             if(datos.BuscarEjemplar(libro.getISBN(), id).isDadoBaja() == false) {
                            if(datos.BuscarEjemplar(libro.getISBN(), id).getPrestatario() == null) { 
                             Prestamos prest = new Prestamos(datos, libro, edicion, datos.BuscarEjemplar(libro.getISBN(), id));
                             prest.setVisible(true);
                             ListaEjemplares.this.setVisible(false);
                            }else{
                               	JOptionPane.showMessageDialog(null, "Este ejemplar ya se encuentra prestado, reservelo para el " + datos.buscarPrestamo(datos.BuscarEjemplar(libro.getISBN(), id).getPrestatario().getPrestatario().getTipo(), datos.BuscarEjemplar(libro.getISBN(), id).getPrestatario().getPrestatario().getDni(), datos.BuscarEjemplar(libro.getISBN(), id).getPrestatario().getEjemplarPrestado().getEdicion().getObra().getISBN(),  datos.BuscarEjemplar(libro.getISBN(), id).getPrestatario().getEjemplarPrestado().getIDUnica()).getFechaEstimadaDevol()+ " o solicite el pretamos de otro ejemplar", "Prestamo", JOptionPane.INFORMATION_MESSAGE);
                            	}}else {
                            		JOptionPane.showMessageDialog(null,"Este ejemplar fue dado de baja", "Error", JOptionPane.ERROR_MESSAGE);
                            	}
                            }
				 }catch(HeadlessException a){
					 JOptionPane.showMessageDialog(null,"Error", "Inténtelo nuevamente", JOptionPane.ERROR_MESSAGE);
				 }
			}
		});
		btnNewButton_1_1.setBounds(435, 493, 90, 26);
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
		
		JButton btnNewButton_1_1_1 = new JButton("Reserva");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int fila;
				 try {
					 fila = table.getSelectedRow();
				     if (fila == -1){JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
				         }else{
                             Integer id = (Integer) table.getValueAt(fila, 4);
                             if(datos.BuscarEjemplar(libro.getISBN(), id).isDadoBaja() == false) {
                            if(datos.BuscarEjemplar(libro.getISBN(), id).getPrestatario() != null) { 
                            	if(datos.BuscarEjemplar(libro.getISBN(), id).getReservante() == null) {
                             Reservas prest = new Reservas(datos, libro, edicion, datos.BuscarEjemplar(libro.getISBN(), id), datos.buscarPrestamo(datos.BuscarEjemplar(libro.getISBN(), id).getPrestatario().getPrestatario().getTipo(), datos.BuscarEjemplar(libro.getISBN(), id).getPrestatario().getPrestatario().getDni(), datos.BuscarEjemplar(libro.getISBN(), id).getPrestatario().getEjemplarPrestado().getEdicion().getObra().getISBN(),  datos.BuscarEjemplar(libro.getISBN(), id).getPrestatario().getEjemplarPrestado().getIDUnica()).getFechaEstimadaDevol());
                             prest.setVisible(true);
                             ListaEjemplares.this.setVisible(false);
                             }else{
                            	 JOptionPane.showMessageDialog(null, "Este ejemplar ya se encuentra reservado", "Reserva", JOptionPane.INFORMATION_MESSAGE);
                             }
                            }else{
                               	JOptionPane.showMessageDialog(null, "Este ejemplar se encuentra disponible para ser prestado", "Reserva", JOptionPane.INFORMATION_MESSAGE);
                            	}
                            }else {
                            		JOptionPane.showMessageDialog(null,"Este ejemplar fue dado de baja", "Error", JOptionPane.ERROR_MESSAGE);
                            	}
                            }
				 }catch(HeadlessException a){
					 JOptionPane.showMessageDialog(null,"Error", "Inténtelo nuevamente", JOptionPane.ERROR_MESSAGE);
				 }
			}
		});
		
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
		
		model.addColumn("Obra");
		model.addColumn("Editoria");
		model.addColumn("Codigo de barras");
		model.addColumn("Posicion en la biblioteca");
		model.addColumn("Id");
		model.addColumn("Forma de adquisicion");
		
		llenarTabla();

	}
	public void llenarTabla() {
		List<Ejemplar> listaEjemplares = libro.getEjemplares();
		

		for( Ejemplar ejemplar : listaEjemplares) {
			Object[] fila = new Object[7];
			
			if(ejemplar.getEdicion().equals(edicion)) { 
				
			fila[0] = libro.getTitulo();
			fila[1] = edicion.getEditorial();
			fila[2] = ejemplar.getCodigoBarras();
			fila[3] = ejemplar.getPosicionBiblio();
			fila[4] = ejemplar.getIDUnica();
			fila[5] = ejemplar.getFormaAdqui();
			fila[6] = ejemplar.getFormaAdqui();

			model.addRow(fila);
		}
			}
	}
}

