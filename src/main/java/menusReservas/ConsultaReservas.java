package menusReservas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import biblioteca.ConexionObjetosMenus;
import biblioteca.Prestamo;
import biblioteca.Reserva;
import menus.MenuPrincipal;
import menusLectores.ConsultaLectores;
import menusPrestamos.ConsultaPrestamos;
import menusPrestamos.Multa;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class ConsultaReservas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ConexionObjetosMenus datos;
	private DefaultTableModel model;
	private JTable table;


	public ConsultaReservas(ConexionObjetosMenus dato) {
		setTitle("Consulta Reservas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		datos = dato;
		setBounds(100, 100, 684, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setColumns(10);
		textField.setBounds(10, 12, 588, 20);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(593, 12, 75, 20);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrar prestamo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int fila;
				 try {
					 fila = table.getSelectedRow();
				     if (fila == -1){JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
				         }else{
				        	 String obra = (String) table.getValueAt(fila, 1);
				        	 Integer IdEjemplar = (Integer) table.getValueAt(fila, 2);
				        	 String tipoDoc = (String) table.getValueAt(fila, 5);
				        	 Integer numDni = (Integer) table.getValueAt(fila, 6);
				        	 datos.buscarReserva(tipoDoc, numDni, obra, IdEjemplar).ConvertirPrestamo(datos.getUsuarioActivo().getNombreYApellido());
				        	 if(datos.buscarPrestamo(tipoDoc, numDni, obra, IdEjemplar).getFechaEstimadaDevol().isBefore(LocalDate.now())) {
				        			Multa Mul = new Multa(datos, datos.buscarPrestamo(tipoDoc, numDni, obra, IdEjemplar));
				    		        Mul.setVisible(true);
				    		        ConsultaPrestamos.this.setVisible(false);
				        	 } else {
				        		ConsultaPrestamos ConPre = new ConsultaPrestamos(datos);
				 				ConPre.setVisible(true);
				 				ConsultaReservas.this.setVisible(false);
				        	 }
				         } }catch(HeadlessException a){
					 JOptionPane.showMessageDialog(null,"Error", "Inténtelo nuevamente", JOptionPane.ERROR_MESSAGE);
				 }
			} 
			}
		});
		btnNewButton_1.setBounds(343, 363, 145, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("Atras");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal MP = new MenuPrincipal(datos);
		        MP.setVisible(true);
		        ConsultaReservas.this.setVisible(false);
			}
		});
		btnNewButton_1_2.setBounds(228, 363, 65, 26);
		contentPane.add(btnNewButton_1_2);
		
		JRadioButton rdbtnNombreObra = new JRadioButton("Nombre obra");
		rdbtnNombreObra.setSelected(true);
		rdbtnNombreObra.setBounds(83, 40, 99, 24);
		contentPane.add(rdbtnNombreObra);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Nombre lector");
		rdbtnNewRadioButton_1.setBounds(353, 40, 106, 24);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("DNI");
		rdbtnNewRadioButton_1_1.setBounds(503, 40, 44, 24);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("ID");
		rdbtnNewRadioButton_1_4.setBounds(212, 40, 37, 23);
		contentPane.add(rdbtnNewRadioButton_1_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 66, 646, 285);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(model);
		
	    table.getTableHeader().setReorderingAllowed(false);
		
		
		model = new DefaultTableModel(){ @Override public boolean isCellEditable(int row, int column) { return false; } };
	    
		model.addColumn("Obra");
		model.addColumn("ISBN");
		model.addColumn("ID ejemplar");
		model.addColumn("Lector");
		model.addColumn("Tipo doc.");
		model.addColumn("DNI");
		model.addColumn("Fecha reservada");

	    llenarTabla();
	}
	
	public void llenarTabla() {
		List<Reserva> listaReservas = datos.getReservas();
		

		for(Reserva reserva : listaReservas) {
			if(reserva.getEjemplarReservado().getReservante() != null) {
			Object[] fila = new Object[7];
				
			fila[0] = reserva.getEjemplarReservado().getEdicion().getObra().getTitulo();
			fila[1] = reserva.getEjemplarReservado().getEdicion().getObra().getISBN();
			fila[2] = reserva.getEjemplarReservado().getIDUnica();
			fila[3] = (reserva.getReservante().getNombre() + " " + reserva.getReservante().getApellido());
			fila[4] = reserva.getReservante().getTipo();
			fila[5] = reserva.getReservante().getDni();
			fila[6] = reserva.getFecha();

			model.addRow(fila);
			}}
	}
}
