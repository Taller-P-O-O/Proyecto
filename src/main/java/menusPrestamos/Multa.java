package menusPrestamos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biblioteca.ConexionObjetosMenus;
import biblioteca.Prestamo;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Multa extends JFrame {

	private JPanel contentPane;
	private final ConexionObjetosMenus datos;
	private final Prestamo prestamo;
	

	public Multa(ConexionObjetosMenus dato, Prestamo prestam) {
		setTitle("Multa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		datos = dato;
		prestamo = prestam;
		setBounds(100, 100, 316, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad dias multa");
		lblNewLabel.setBounds(45, 26, 112, 16);
		contentPane.add(lblNewLabel);
		
		final JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
		spinner.setBounds(180, 24, 71, 20);
		contentPane.add(spinner);
		
		JButton btnNewButton = new JButton("Volver al menu de prestamos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaPrestamos ConPre = new ConsultaPrestamos(datos);
				ConPre.setVisible(true);
				Multa.this.setVisible(false);
			}
		});
		btnNewButton.setBounds(51, 147, 200, 26);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Aplicar multa");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prestamo.agregarMulta(new biblioteca.Multa(Integer.parseInt(spinner.getValue().toString()), prestamo));;
	          	JOptionPane.showMessageDialog(null, "La multa se a registrado correctamente", "Registro completo", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1.setBounds(95, 71, 109, 26);
		contentPane.add(btnNewButton_1);
	}
}
