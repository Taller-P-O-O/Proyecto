package menus;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biblioteca.ConexionObjetosMenus;
import menusLectores.ConsultaLectores;
import menusLectores.RegistroAlumnos;
import menusLectores.RegistroProfesores;
import menusLectores.RegistroPublicoGeneral;
import menusLibros.ConsultaObras;
import menusLibros.RegistrarColeccion;
import menusLibros.RegistroObras;
import menusPrestamos.ConsultaMultas;
import menusPrestamos.ConsultaPrestamos;
import menusReservas.ConsultaReservas;
import rankings.LectoresConMasMultas;
import rankings.ObrasMasSolicitadas;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private final ConexionObjetosMenus datos;

	public MenuPrincipal(ConexionObjetosMenus dato) {
		setTitle("Menu Principal");
		datos = dato;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 782, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Libros");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Registrar nueva obra");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroObras RegO = new RegistroObras(datos);
				RegO.setVisible(true);
				MenuPrincipal.this.setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Registrar coleccion");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarColeccion RegC = new RegistrarColeccion(datos);
				RegC.setVisible(true);
				MenuPrincipal.this.setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Consultar obras");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaObras ConsultaO = new ConsultaObras(datos);
				ConsultaO.setVisible(true);
				MenuPrincipal.this.setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_8);
		
		JMenu mnNewMenu_1 = new JMenu("Lectores");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Registrar publico general");
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroPublicoGeneral RegPG = new RegistroPublicoGeneral(datos);
				RegPG.setVisible(true);
				MenuPrincipal.this.setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Registar alumnos");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroAlumnos RegA = new RegistroAlumnos(datos);
				RegA.setVisible(true);
				MenuPrincipal.this.setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Registrar profesores");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroProfesores RegP = new RegistroProfesores(datos);
				RegP.setVisible(true);
				MenuPrincipal.this.setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Consultar Lectores");
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaLectores ConL = new ConsultaLectores(datos);
				ConL.setVisible(true);
				MenuPrincipal.this.setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_12);
		
		JMenu mnNewMenu_2 = new JMenu("Prestamos");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Consultar Prestamos");
		mntmNewMenuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaPrestamos ConP = new ConsultaPrestamos(datos);
				ConP.setVisible(true);
				MenuPrincipal.this.setVisible(false);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_13);
		
		JMenu mnNewMenu_3 = new JMenu("Reservas");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Consultar reservas");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaReservas ConR = new ConsultaReservas(datos);
				ConR.setVisible(true);
				MenuPrincipal.this.setVisible(false);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_5 = new JMenu("Multas");
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Consultar multas");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaMultas ConM = new ConsultaMultas(datos);
				ConM.setVisible(true);
				MenuPrincipal.this.setVisible(false);
			}
		});
		mnNewMenu_5.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_4 = new JMenu("Rankings");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Obras mas solicitadas");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ObrasMasSolicitadas ObrMS = new ObrasMasSolicitadas(datos);
				ObrMS.setVisible(true);
				MenuPrincipal.this.setVisible(false);
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Lectores con mas multas");
		mntmNewMenuItem_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LectoresConMasMultas LecCMM = new LectoresConMasMultas(datos);
				LecCMM.setVisible(true);
				MenuPrincipal.this.setVisible(false);
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_14);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 47, 625, 349);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Devoluciones del dia");
		lblNewLabel.setBounds(255, 28, 116, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Registrar devolucion");
		btnNewButton.setBounds(254, 408, 151, 26);
		contentPane.add(btnNewButton);
	}
}
