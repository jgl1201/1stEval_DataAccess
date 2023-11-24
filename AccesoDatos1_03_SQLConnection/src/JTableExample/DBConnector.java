package JTableExample;

import java.sql.*;

import javax.swing.JOptionPane;

public class DBConnector {
	
	private Connection connector;
	
	public DBConnector(String host, String port, String user, String password) {
		this.connector = connect(host, port, user, password);
	}
	
	public Connection connect(String host, String port, String user, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://" + host + ":" + port + "/";
			Connection con = DriverManager.getConnection(url, user, password);
			JOptionPane.showMessageDialog(null, "Conexión establecida");
			return con;
		} catch (ClassNotFoundException | SQLException e1) {
			JOptionPane.showMessageDialog(null, "Conexión fallida");
			e1.printStackTrace();
			System.out.println(e1.getMessage());
			return null;
		}
	}
	
	public Connection getConnector() {
		return this.connector;
	}

}
