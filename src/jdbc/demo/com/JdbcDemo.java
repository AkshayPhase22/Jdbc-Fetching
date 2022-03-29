package jdbc.demo.com;
import java.sql.*;

public class JdbcDemo {
	static final String URL="jdbc:mysql://localhost/swiggy";
	static final String id="root";
	static final String pass="8856873603";
	static final String query="select *from ( select * from employee order by salary desc limit 2) as employee order by salary limit 1";
	
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet res=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con=DriverManager.getConnection(URL, id, pass);
		    st=con.createStatement();
		    res=st.executeQuery(query);
		   
		    while(res.next())
		    {
		    	int id=res.getInt(1);
		    	String name=res.getString(2);
		    	int salary=res.getInt(6);
		    	System.out.println("Second highest salary= "+"id "+id+" name "+name+" salary "+salary);
		    }
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
				st.close();
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
