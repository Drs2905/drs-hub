import java.sql.*;
public class JdbcExample
{
public static void main(String args[])
{
try{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","845594");
System.out.println("connected");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("Select * from dipti");
while(rs.next()){
System.out.println(rs.getInt(1)+" " +rs.getString(2)+" " + rs.getInt(3)+" " + rs.getString(4)+" " + rs.getString(5));
}
con.close();
}
catch(Exception e){System.out.println(e);}
}
}