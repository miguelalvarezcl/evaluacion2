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
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.ImageIcon;


public class inicio_sesion extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;


	conectar_sql cc=new conectar_sql();
	Connection con=cc.conexion();	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	
	
	public void ValidarUsuario() {
		
		int resultado=0;
		
		String pass=String.valueOf(txtPassword.getPassword());
		String usuario=txtUsuario.getText();
		String SQL="select * from usuarios where user_name='"+usuario+"' and user_pass='"+pass+"'";		
		
		
		try {

			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(SQL);
			
			if (rs.next()) {
				resultado=1;
				
				if (resultado==1) {
				
					web form = new web();
					form.setVisible(true);
					this.dispose();
				}
				
				
			}else {
				JOptionPane.showMessageDialog(null,"Error de acceso, Usuario no existe");
			}
			
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
		}
	
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio_sesion frame = new inicio_sesion();
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
	public inicio_sesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Usuario");
		lblLogin.setFont(new Font("Calibri Light", Font.PLAIN, 14));
		lblLogin.setBounds(56, 115, 55, 17);
		contentPane.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Contrase\u00F1a");
		lblPassword.setFont(new Font("Calibri Light", Font.PLAIN, 14));
		lblPassword.setBounds(56, 165, 89, 17);
		contentPane.add(lblPassword);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(152, 112, 141, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(152, 162, 141, 20);
		contentPane.add(txtPassword);
		
		JButton btnIngresar = new JButton("Entrar");
		btnIngresar.setBackground(SystemColor.activeCaption);
		btnIngresar.setVerticalAlignment(SwingConstants.TOP);
		
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ValidarUsuario();
				
			}
		});
		
		
		btnIngresar.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnIngresar.setBounds(178, 210, 89, 23);
		contentPane.add(btnIngresar);
		
		lblNewLabel = new JLabel("Inicio de Sesi\u00F3n ::: Bienvenido");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel.setBounds(0, 60, 434, 28);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Power Beat\\Desktop\\INGENIERIA\\ECLIPSE\\login\\Logo 300x40.png"));
		lblNewLabel_1.setBounds(0, 11, 434, 40);
		contentPane.add(lblNewLabel_1);
	}

}
