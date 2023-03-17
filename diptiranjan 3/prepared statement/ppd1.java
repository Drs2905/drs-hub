import java.sql.*;
public class ppd1
{
public static void main(String []args)throws Exception
{
Connection sum=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","845594");
PreparedStatement stmt=sum.prepareStatement("insert into ranjan values(?,?,?)");  
stmt.setInt(1,2);
stmt.setString(2,"Naman"); 
 stmt.setInt(3,13);
int i=stmt.executeUpdate();

if(i>0)
{
System.out.println("insert success");
}
else
{
System.out.println("Not done");
}
sum.close();
}
}