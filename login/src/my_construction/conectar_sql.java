package my_construction;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conectar_sql {
	Connection conectar=null;
	
			public Connection conexion() {
			
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");		
					conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
					
					
				}catch(Exception e) {
					JOptionPane.showInternalMessageDialog(null,"Error"+ e.getMessage());

				}
				
				
				return conectar;
				
			}
	
}