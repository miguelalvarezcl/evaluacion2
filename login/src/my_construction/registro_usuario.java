package my_construction;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

	
public class registro_usuario extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;


	
	conectar_sql cc=new conectar_sql();
	Connection con=cc.conexion();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	public void AgregarUsuario() {

		String SQL="insert into usuarios(user_name,user_pass) values (?,?)";		
		String pass=String.valueOf(txtPassword.getPassword());
		
		try {

			PreparedStatement pst=con.prepareStatement(SQL);
			pst.setString(1, txtUsuario.getText());
			pst.setString(2, pass);
			
			pst.executeUpdate();
			
			JOptionPane.showMessageDialog(null,"Usuario agregado con ?xito");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error al intentar registrar al usuario"+e.getMessage());
		}

		
		
		
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registro_usuario frame = new registro_usuario();
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
	public registro_usuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Usuario");
		lblLogin.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblLogin.setBounds(73, 113, 55, 24);
		contentPane.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Contrase\u00F1a");
		lblPassword.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblPassword.setBounds(73, 161, 87, 24);
		contentPane.add(lblPassword);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(161, 113, 118, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(161, 161, 118, 20);
		contentPane.add(txtPassword);
		
		JButton btnAgregar = new JButton("Nuevo Usuario");
		btnAgregar.setBackground(SystemColor.activeCaption);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AgregarUsuario();
				
			}
		});
		btnAgregar.setBounds(143, 206, 158, 23);
		contentPane.add(btnAgregar);
		
		lblNewLabel = new JLabel("Registro de Nuevo Usuario");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel.setBounds(0, 55, 434, 34);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Power Beat\\Desktop\\INGENIERIA\\ECLIPSE\\login\\Logo 300x40.png"));
		lblNewLabel_1.setBounds(0, 11, 434, 45);
		contentPane.add(lblNewLabel_1);
	}
}
