package menusPrestamos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biblioteca.ConexionObjetosMenus;
import biblioteca.Prestamo;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;

public class Multa extends JFrame {

	private JPanel contentPane;
	private final ConexionObjetosMenus datos;
	

	public Multa(ConexionObjetosMenus dato, Prestamo prestamo) {
		setTitle("Multa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		datos = dato;
		setBounds(100, 100, 316, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad dias multa");
		lblNewLabel.setBounds(40, 73, 112, 16);
		contentPane.add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner.setBounds(175, 71, 71, 20);
		contentPane.add(spinner);
		
		JButton btnNewButton = new JButton("Atras");
		btnNewButton.setBounds(40, 132, 65, 26);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Aplicar multa");
		btnNewButton_1.setBounds(156, 132, 109, 26);
		contentPane.add(btnNewButton_1);
	}
}
