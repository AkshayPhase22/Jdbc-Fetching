package jdbc.demo.com;

import java.sql.*;

public class Test {
	
	static	String URL="jdbc:mysql://localhost/students";
	static	String UserName="root";
	static	String Password="8856873603";

	public static void main(String[] args) {

		System.out.println("hi");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(URL,UserName,Password);
			Statement st=con.createStatement();
			int res=st.executeUpdate("update students set name='ram123' where rollno=10");
			System.out.println("rows updated= "+res);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
