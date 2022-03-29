package com.demo.sample;
import java.sql.*;

public class PreparedStatementDemo {

	public static String url="jdbc:mysql://localhost/Metadata";
	public static String usarName="root";
	public static String password="8856873603";
	public static String query="insert into employee1 value(?,?)";
	
	
	public static void main(String[] args) throws SQLException {
	
		Connection  con=null;
		PreparedStatement pst=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(url, usarName, password);
			pst=con.prepareStatement(query);
			pst.setInt(1,2);
			pst.setString(2,"AAA");
			int i=pst.executeUpdate();
			System.out.println(i);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
		pst.close();
		con.close();
		}
	}
}
