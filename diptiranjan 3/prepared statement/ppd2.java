

import java.sql.*;
public class ppd2
{
public static void main(String []args)throws Exception
{
Connection sum=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","845594");
PreparedStatement stmt=sum.prepareStatement("update ranjan set name=? where roll=?");  
stmt.setString(1,"Aman");  
stmt.setInt(2,13); 
int i=stmt.executeUpdate();

if(i>0)
{
System.out.println("update success");
}
else
{
System.out.println("Not done");
}
sum.close();
}
}