package my_construction;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class web extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					web frame = new web();
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
	public web() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 416);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenidosAMy = new JLabel("Bienvenidos a My Construction \"La Cadena Constructora Lider\" ");
		lblBienvenidosAMy.setForeground(new Color(255, 255, 255));
		lblBienvenidosAMy.setHorizontalAlignment(SwingConstants.LEFT);
		lblBienvenidosAMy.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblBienvenidosAMy.setBounds(10, 217, 287, 30);
		contentPane.add(lblBienvenidosAMy);
		
		JLabel lblportalWebEn = new JLabel("\u00A9 Todos los derechos reservados, Desarrollado por My Construction.");
		lblportalWebEn.setHorizontalAlignment(SwingConstants.CENTER);
		lblportalWebEn.setFont(new Font("Calibri Light", Font.BOLD, 9));
		lblportalWebEn.setBounds(0, 354, 576, 23);
		contentPane.add(lblportalWebEn);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Power Beat\\Desktop\\INGENIERIA\\ECLIPSE\\login\\Logo 300x40.png"));
		lblNewLabel_2.setBounds(10, 0, 458, 42);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Inicio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 53, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Empresa");
		btnNewButton_1.setBounds(99, 53, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Portafolio");
		btnNewButton_2.setBounds(188, 53, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Contacto");
		btnNewButton_3.setBounds(277, 53, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Registro");
		btnNewButton_4.setBounds(366, 53, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Power Beat\\Desktop\\INGENIERIA\\ECLIPSE\\login\\condominio.jpeg"));
		lblNewLabel_1.setBounds(0, 35, 576, 225);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblportalWebEn_1 = new JLabel("\"Portal Web en Desarrollo\"");
		lblportalWebEn_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblportalWebEn_1.setFont(new Font("Calibri Light", Font.BOLD, 12));
		lblportalWebEn_1.setBounds(-10, 280, 576, 23);
		contentPane.add(lblportalWebEn_1);
	}
}
