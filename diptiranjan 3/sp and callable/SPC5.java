import java.sql.*;


public class SPC5{

		public static void main(String args[]){
    String dbURL="jdbc:mysql://localhost:3306/mca";
		String user="root";
		String password="845594";

		try(Connection conn=DriverManager.getConnection(dbURL,user,password);
CallableStatement statement=conn.prepareCall("{call insert_student(?)}");
){
statement.setInt(1,4);


		statement.execute();
 		statement.close();

		System.out.println("Stored procedure called successfully");
}
catch(SQLException ex){
  ex.printStackTrace();
}
}
}