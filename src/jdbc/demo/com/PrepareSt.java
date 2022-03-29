package jdbc.demo.com;
import java.sql.*;

public class PrepareSt {
	static final String URL="jdbc:mysql://localhost/swiggy";
	static final String id="root";
	static final String pass="8856873603";
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(URL,id,pass);
			PreparedStatement ps =con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			ps.setInt(1,6);
			ps.setString(2,"anu");
			ps.setInt(3,44);
			ps.setString(4,"f");
			ps.setInt(5,2);
			ps.setInt(6,90000);
		    int i=ps.executeUpdate();
		    System.out.println(i);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
