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
import biblioteca.Obra;
import menus.MenuPrincipal;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class ConsultarEdiciones extends JFrame {

	private JPanel contentPane;
	private JTextField txtIngreseNombreDe;
	private JTable table;
	private final ConexionObjetosMenus datos;
	private final Obra libro;
	private DefaultTableModel model;


	public ConsultarEdiciones(ConexionObjetosMenus dato, Obra lib) {
		setTitle("Buscador de ediciones");
		datos = dato;
		libro = lib;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 876, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIngreseNombreDe = new JTextField();
		txtIngreseNombreDe.setToolTipText("");
		txtIngreseNombreDe.setColumns(10);
		txtIngreseNombreDe.setBounds(22, 11, 764, 20);
		contentPane.add(txtIngreseNombreDe);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(783, 10, 75, 20);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 39, 826, 464);
		contentPane.add(scrollPane);
		
		JButton btnNewButton_1 = new JButton("Listado ejemplares");
		btnNewButton_1.setBounds(261, 515, 143, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Registrar ejemplar");
		btnNewButton_1_1.setBounds(457, 515, 140, 26);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Atras");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaObras ConOb = new ConsultaObras(datos);
		        ConOb.setVisible(true);
		        ConsultarEdiciones.this.setVisible(false);
			}
		});
		btnNewButton_1_2.setBounds(130, 515, 65, 26);
		contentPane.add(btnNewButton_1_2);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		scrollPane.setViewportView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		model = new DefaultTableModel(){ @Override public boolean isCellEditable(int row, int column) { return false; } };
	    table.setModel(model);
	    
	    JButton btnNewButton_2 = new JButton("Observaciones generales");
	    btnNewButton_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
				 int fila;
				 try {
					 fila = table.getSelectedRow();
				     if (fila == -1){JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
				         }else{
				        	 String isbn = libro.getISBN();
				        	 String edit = (String) table.getValueAt(fila, 1);
				        	 String PaEd = (String) table.getValueAt(fila, 2);
				        	 String NumEd = (String) table.getValueAt(fila, 3);
				        	 String ani = (String) table.getValueAt(fila, 4);
				        	 String Vol = (String) table.getValueAt(fila, 5);
				        	 String idi = (String) table.getValueAt(fila, 7);
				        	 String form = (String) table.getValueAt(fila, 8);
				        	 
				        	 JOptionPane.showMessageDialog(null, datos.BuscarEdicion(isbn, edit, PaEd, Integer.parseInt(NumEd), Integer.parseInt(ani), Integer.parseInt(Vol), idi, form).getObservacionesGen());
				         }
				 }catch(HeadlessException a){
					 JOptionPane.showMessageDialog(null,"Error", "Inténtelo nuevamente", JOptionPane.ERROR_MESSAGE);
				 }
				}
	    });
	    
	    btnNewButton_2.setBounds(633, 515, 180, 26);
	    contentPane.add(btnNewButton_2);
	    
		model.addColumn("Obra");
		model.addColumn("Editorial");
		model.addColumn("Pais de edicion");
		model.addColumn("Num.de Edicion");
		model.addColumn("anio");
		model.addColumn("Volumen");
		model.addColumn("Cant. de paginas");
		model.addColumn("Idioma");
		model.addColumn("Formato");


        table.getTableHeader().setReorderingAllowed(false); 
        llenarTabla();
	}
	
	public void llenarTabla() {
		List<Edicion> listaEdiciones = libro.getEdiciones();
		
		for(Edicion edicion : listaEdiciones) {
			Object[] fila = new Object[9];
			
			fila[0] = libro.getTitulo();
			fila[1] = edicion.getEditorial();
			fila[2] = edicion.getPaisEdicion();
			fila[3] = edicion.getNumEdicion();
			fila[4] = edicion.getAnio();
			fila[5] = edicion.getVolumen();
			fila[6] = edicion.getCantidadPaginas();
			fila[7] = edicion.getIdioma();
			fila[8] = edicion.getFormato();

			model.addRow(fila);
		}
	}
}
