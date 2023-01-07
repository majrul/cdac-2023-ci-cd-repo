package com.cdac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class App {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "sammy", "password");
		
		PreparedStatement stmt = conn.prepareStatement("insert into emp values(?, ?, ?)");
		stmt.setInt(1, 1001);
		stmt.setString(2, "Majrul");
		stmt.setDouble(3, 10000);
		stmt.executeUpdate();
		
		conn.close();
	}
}
