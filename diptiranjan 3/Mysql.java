import java.sql.*;
class Mysql{
	public static void main(String args[]){
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","845594");
			
			if(con != null) 
			{
					System.out.println("Connected to the database");
			}
			else
			{
				System.out.println("Failed to make connection!");
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}