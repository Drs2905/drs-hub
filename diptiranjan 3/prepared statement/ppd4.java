import java.sql.*;
public class ppd4
{
public static void main(String []args)throws Exception
{
Connection sum=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","845594");
PreparedStatement stmt=sum.prepareStatement("delete from ranjan where roll=?");  
stmt.setInt(1,13);  

int i=stmt.executeUpdate(); 
if(i>0)
{ 
System.out.println("records deleted");
}
else
System.out.println("records not deleted");

sum.close();
}
}