package rankings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import biblioteca.Coleccion;
import biblioteca.ConexionObjetosMenus;
import biblioteca.Obra;
import menus.MenuPrincipal;
import menusLibros.ConsultaObras;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class ObrasMasSolicitadasPorAlumYProf extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ConexionObjetosMenus datos;
	private DefaultTableModel model;


	public ObrasMasSolicitadasPorAlumYProf(ConexionObjetosMenus dato) {
		setTitle("Obras mas solicitadas por alumnos y profesores");
		datos = dato;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Atras");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal MP = new MenuPrincipal(datos);
		        MP.setVisible(true);
		        ObrasMasSolicitadasPorAlumYProf.this.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(325, 408, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 709, 383);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		model = new DefaultTableModel(){ @Override public boolean isCellEditable(int row, int column) { return false; } };
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
