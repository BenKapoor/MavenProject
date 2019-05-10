package eu.ensup.projetwebv2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	private static Connection connect = null;

	private static Statement statement = null;

	public static Connection getConnection() throws SQLException{ //making a static connection,shares to all classes
		Connection con=null; // creating connection
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/utilisateurs?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");

		} catch (Exception e) {
			con.close();
			//throws an error if at all its unable to create an connection
			System.out.println(e);
		}	
		return con; // we return the connection and we can get the connection wherever needed.
	}

	public static void closeConnection() {
		try {
			connect.close();
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

