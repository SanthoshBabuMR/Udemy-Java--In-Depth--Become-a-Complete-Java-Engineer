package com.semanticsquare.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySqlConnect2 {
	final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	final static String DB_URL = "jdbc:mysql://localhost:3306/EMP";
	final static String USER = "root";
	final static String PASSWORD = "admin";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			stmt = conn.createStatement();
			String sql = "INSERT INTO Employees VALUES (104, 45, 'Krishna', 'Chaitanya');";
			boolean result = stmt.execute(sql);
			System.out.println("result: " + result);
			
			sql = "select * from employees";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getInt("id") + " - ");
				System.out.print(rs.getInt("age") + " - ");
				System.out.print(rs.getString("first") + " - ");
				System.out.print(rs.getString("last") + " - ");
				System.out.println("");
			}
			
			
			stmt.close();
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) stmt.close();
			} catch(SQLException se2) {
				se2.printStackTrace();
			}
			try {
				if (conn != null) conn.close();
			} catch(SQLException se3) {
				se3.printStackTrace();
			}
		}
		
		
	}	
}
