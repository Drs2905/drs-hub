import java.sql.*;
public class SPC4{

		public static void main(String args[]){
		String dbURL="jdbc:mysql://localhost:3306/mca";
		String user="root";
		String password="845594";
	
		try(Connection conn=DriverManager.getConnection(dbURL,user,password);
			Statement statement=conn.createStatement();){	
			String queryDrop="DROP PROCEDURE IF EXISTS insert_student";
			String queryCreate="CREATE PROCEDURE insert_student(IN rollno INT)";
				queryCreate +="BEGIN ";
				queryCreate +="insert into student  values (4,'sthita',22,'m','puri');";
				queryCreate +="END";
			
				statement.execute(queryDrop);
				statement.execute(queryCreate);
				statement.close();

		System.out.println("Stored procedure created successfully");
				conn.close();
			}
				catch(SQLException ex){
				ex.printStackTrace();
				}
			}
		}