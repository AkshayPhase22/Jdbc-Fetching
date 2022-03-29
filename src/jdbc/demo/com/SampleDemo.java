package jdbc.demo.com;
import java.sql.*;

public class SampleDemo {
	static String URl="jdbc:mysql://localhost/swiggy";
	static String ID="root";
	static String Password="8856873603";
	
	public static void main(String[] args) {
		
		Connection con=null;
		Statement st=null;
		 ResultSet res=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(URl,ID, Password);
			 st=con.createStatement();
			 res=st.executeQuery("select * from employee");
			 System.out.println("id      name    age    gender");
			while(res.next())
			{
				int id=res.getInt("id");
				String name=res.getString("name");
				int age=res.getInt("age");
				String gender=res.getString("gender");	
				System.out.println(id+"\t"+name+"\t"+age+"\t"+gender);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			
			try {
				res.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		

	}

}
