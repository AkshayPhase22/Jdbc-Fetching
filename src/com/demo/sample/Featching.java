package com.demo.sample;
import java.sql.*;

public class Featching {

	static final String URL="jdbc:mysql://localhost/swiggy";
	static final String id="root";
	static final String pass="8856873603";
	static final String query="select *from company";
	
	public static void main(String[] args) {
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    conn=DriverManager.getConnection(URL, id, pass);
		    st=conn.createStatement();
		    rs=st.executeQuery(query);
			
			while(rs.next())
			{
				
				int id=rs.getInt(1);
				String dept=rs.getString(2);
				String name=rs.getString(3);
				
				System.out.println("id= "+id+" dept= "+dept+" name= "+name);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		finally
		{
			if(null !=rs)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(null !=st)
			{
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	
			if(null !=conn)
			{
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
