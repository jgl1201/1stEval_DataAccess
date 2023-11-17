package Prueba01_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	static Connection connection;
	static Statement statement;
	static ResultSet resultSet;
	static ResultSetMetaData rsmd;
	
	final static String url = "jdbc:mysql://localhost:3306/";
	final static String user = "root";
	final static String password = "";

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
			
			statement = connection.createStatement();
			statement.execute("use northwind");
			
			resultSet = statement.executeQuery("select * from shippers;");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) +
						" " + resultSet.getString(3));
			}
			
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
	
}
