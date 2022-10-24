package menusLibros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import biblioteca.ConexionObjetosMenus;
import biblioteca.Edicion;
import biblioteca.Ejemplar;
import biblioteca.Obra;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.ZoneId;
import java.awt.event.ActionEvent;

public class BajaEjemplar extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private final Obra libro;
	private final Edicion edicion;
	private final Ejemplar ejemplar;
	private final ConexionObjetosMenus datos;


	public BajaEjemplar(ConexionObjetosMenus dato, Obra lib, Edicion edic, Ejemplar ejem) {
		setTitle("Baja de ejemplar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		datos = dato;
		libro = lib;
		edicion = edic;
		ejemplar = ejem;
		setBounds(100, 100, 354, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 61, 140, 25);
		contentPane.add(textField_1);
		
		JLabel lblFechaDeBaja = new JLabel("Fecha de baja:");
		lblFechaDeBaja.setBounds(53, 29, 81, 16);
		contentPane.add(lblFechaDeBaja);
		
		JLabel lblNewLabel_1 = new JLabel("Motivo baja:");
		lblNewLabel_1.setBounds(65, 65, 67, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ubicacion baja:");
		lblNewLabel_2.setBounds(52, 101, 86, 16);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(145, 96, 140, 25);
		contentPane.add(textField_2);
		
		final JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(145, 20, 140, 25);
		dateChooser.getDateEditor().setEnabled(false);
		contentPane.add(dateChooser);
		
		JButton btnNewButton = new JButton("Atras");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaEjemplares ListEjem = new ListaEjemplares(datos, libro, edicion);
				ListEjem.setVisible(true);
		        BajaEjemplar.this.setVisible(false);
			}
		});
		btnNewButton.setBounds(69, 156, 65, 26);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Confirmar baja");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(textField_1.getText().trim().isEmpty()) && !(textField_2.getText().trim().isEmpty()) && !(dateChooser.getDate() == null)) {
					if (!(ejemplar.isDadoBaja())) {
					try {
						ejemplar.darDeBaja(dateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), textField_1.getText(), textField_2.getText());
						JOptionPane.showMessageDialog(null, "El ejemplar se a dado de baja correctamente", "Registro completo", JOptionPane.INFORMATION_MESSAGE);
						ListaEjemplares ListEjem = new ListaEjemplares(datos, libro, edicion);
						ListEjem.setVisible(true);
				        BajaEjemplar.this.setVisible(false);
					} catch(IllegalArgumentException a){
						JOptionPane.showMessageDialog(null, "Error en el ingreso de datos", "Error", JOptionPane.ERROR_MESSAGE);
					}
		} else {
						JOptionPane.showMessageDialog(null, "Este ejemplar ya se encuentra dado de baja", "Error", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Error en el ingreso de datos", "Error", JOptionPane.ERROR_MESSAGE);
				}				
			}
		});
		btnNewButton_1.setBounds(175, 156, 118, 26);
		contentPane.add(btnNewButton_1);
	}	
}
