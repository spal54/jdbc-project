package com.jsp.jdbc_project_arch.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class StudentConnection {
	
	static Connection con = null;

	public static Connection getStudentConnection() {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/jdbc-PreparedStatement";
			String user = "root";
			String pw = "#SP-0540@mysql;";
			con = DriverManager.getConnection(url, user, pw);
			
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
