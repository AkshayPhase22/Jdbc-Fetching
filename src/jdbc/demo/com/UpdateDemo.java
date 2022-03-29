package jdbc.demo.com;

import java.sql.*;

public class UpdateDemo {
	
	static String URl="jdbc:mysql://localhost/swiggy";
	static String id="root";
	static String pass="8856873603";

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(URl, id, pass);
			Statement st=con.createStatement();
			int res=st.executeUpdate("update employee set name='alia' where id=4");
			System.out.println("Row updated= "+res);
			
			ResultSet rs=st.executeQuery("select * from employee");
			
			 System.out.println("id      name    age    gender");
			while(rs.next())
			{
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int age=rs.getInt("age");
				String gender=rs.getString("gender");	
				System.out.println(id+"\t"+name+"\t"+age+"\t"+gender);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
