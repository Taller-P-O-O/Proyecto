package menusLibros;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;

import biblioteca.ConexionObjetosMenus;
import menus.MenuPrincipal;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistroObras extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_10;
	private final ConexionObjetosMenus datos;

	public RegistroObras(ConexionObjetosMenus dato) {
		setTitle("Registro de Obras");
		datos = dato;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setResizable(false); 
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(156, 22, 140, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 58, 140, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(156, 95, 140, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Tipo:");
		lblNewLabel.setBounds(128, 26, 27, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tematica:");
		lblNewLabel_1.setBounds(99, 63, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Titulo:");
		lblNewLabel_2.setBounds(116, 99, 34, 16);
		contentPane.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(156, 132, 140, 25);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Subtitulo:");
		lblNewLabel_3.setBounds(99, 135, 53, 16);
		contentPane.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(156, 167, 140, 25);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Autor Nro. 1:");
		lblNewLabel_4.setBounds(81, 171, 70, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Autor Nro. 2:");
		lblNewLabel_5.setBounds(79, 206, 70, 16);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(156, 204, 140, 25);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_3_1 = new JLabel("Autor Nro. 3:");
		lblNewLabel_3_1.setBounds(81, 249, 70, 16);
		contentPane.add(lblNewLabel_3_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(156, 243, 140, 25);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_3_2 = new JLabel("Genero:");
		lblNewLabel_3_2.setBounds(107, 279, 44, 16);
		contentPane.add(lblNewLabel_3_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(156, 280, 140, 25);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_3_3 = new JLabel("Caracteristica:");
		lblNewLabel_3_3.setBounds(67, 314, 84, 16);
		contentPane.add(lblNewLabel_3_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(156, 310, 140, 25);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_3_4 = new JLabel("ISBN:");
		lblNewLabel_3_4.setBounds(116, 351, 30, 14);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Indice:");
		lblNewLabel_3_5.setBounds(107, 387, 39, 14);
		contentPane.add(lblNewLabel_3_5);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(156, 382, 140, 79);
		contentPane.add(scrollPane);
		
		final JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(textField.getText().isEmpty()) && !(textField_1.getText().isEmpty()) && !(textField_2.getText().isEmpty()) && !(textField_3.getText().isEmpty()) && !(textField_4.getText().isEmpty()) &&  !(textField_7.getText().isEmpty()) && !(textField_8.getText().isEmpty()) && !(textField_10.getText().isEmpty()) && !(textArea.getText().isEmpty())) {
				if(!(datos.ComprobarObra(textField_10.getText()))) {
                   try { 
                	   datos.CrearObra(textField.getText(), textField_1.getText(), textField_2.getText(), textField_3.getText(), textField_4.getText(), textField_5.getText(), textField_6.getText(), textField_7.getText(), textField_8.getText(), textField_10.getText(), textArea.getText());
                   	   JOptionPane.showMessageDialog(null, "La obra se a registrado correctamente", "Registro completo", JOptionPane.INFORMATION_MESSAGE);
                   } catch(IllegalArgumentException a) {
                		  JOptionPane.showMessageDialog(null, "Error en el ingreso de datos", "Error", JOptionPane.ERROR_MESSAGE);
                   }
				} else {
					JOptionPane.showMessageDialog(null, "Esta Obra ya se encuentra cargada", "Error", JOptionPane.ERROR_MESSAGE);
				}
				} else  {
					  JOptionPane.showMessageDialog(null, "Error en el ingreso de datos", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(207, 472, 89, 23);
		contentPane.add(btnNewButton);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(156, 346, 140, 25);
		contentPane.add(textField_10);
		

		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal MP = new MenuPrincipal(datos);
		        MP.setVisible(true);
		        RegistroObras.this.setVisible(false);
			}
		});
		btnAtras.setBounds(90, 472, 89, 23);
		contentPane.add(btnAtras);
	}
}
