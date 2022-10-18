package menus;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 782, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Libros");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Registrar nueva obra");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Registrar coleccion");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Consultar obras");
		mnNewMenu.add(mntmNewMenuItem_8);
		
		JMenu mnNewMenu_1 = new JMenu("Lectores");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Registrar publico general");
		mnNewMenu_1.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Registar alumnos");
		mnNewMenu_1.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Registrar profesores");
		mnNewMenu_1.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Consultar Lectores");
		mnNewMenu_1.add(mntmNewMenuItem_12);
		
		JMenu mnNewMenu_2 = new JMenu("Prestamos");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Registrar prestamo");
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Consultar Prestamos");
		mnNewMenu_2.add(mntmNewMenuItem_13);
		
		JMenu mnNewMenu_3 = new JMenu("Reservas");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Reservar libro");
		mnNewMenu_3.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Consultar reservas");
		mnNewMenu_3.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_4 = new JMenu("Rankings");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Obras mas solicitadas por alum. y prof.");
		mnNewMenu_4.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Obras mas solicitadas por publico gen.");
		mnNewMenu_4.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Lectores con mas multas");
		mnNewMenu_4.add(mntmNewMenuItem_14);
		
		JMenu mnNewMenu_5 = new JMenu("Multas");
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Consultar Multas");
		mnNewMenu_5.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Consultar multas por periodo");
		mnNewMenu_5.add(mntmNewMenuItem_15);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 47, 625, 349);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Devoluciones del dia");
		lblNewLabel.setBounds(250, 33, 102, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Registrar devolucion");
		btnNewButton.setBounds(243, 407, 146, 23);
		contentPane.add(btnNewButton);
	}
}
