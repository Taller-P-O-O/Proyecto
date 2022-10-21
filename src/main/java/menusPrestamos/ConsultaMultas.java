package menusPrestamos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import com.toedter.calendar.JDateChooser;

import menus.MenuPrincipal;
import menusLectores.ConsultaLectores;

import javax.swing.JLabel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class ConsultaMultas extends JFrame {

	private JPanel contentPane;
	private JTable table;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaMultas frame = new ConsultaMultas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConsultaMultas() {
		setTitle("Consulta de multas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);
		
		JButton btnNewButton_1_2 = new JButton("Atras");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal MP = new MenuPrincipal();
		        MP.setVisible(true);
		        ConsultaMultas.this.setVisible(false);
			}
		});
		btnNewButton_1_2.setBounds(294, 370, 65, 26);
		contentPane.add(btnNewButton_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 647, 309);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Busqueda por periodos");
		rdbtnNewRadioButton.setBounds(20, 330, 157, 24);
		contentPane.add(rdbtnNewRadioButton);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(250, 334, 89, 20);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(421, 334, 92, 20);
		contentPane.add(dateChooser_1);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(551, 331, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Inicio:");
		lblNewLabel.setBounds(205, 334, 33, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Final:");
		lblNewLabel_1.setBounds(385, 336, 29, 16);
		contentPane.add(lblNewLabel_1);
	}

}
