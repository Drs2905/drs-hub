import java.sql.*;
public class ppd3
{
public static void main(String []args)throws Exception
{
Connection sum=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","845594");
PreparedStatement stmt=sum.prepareStatement("select * from ranjan");  
ResultSet rs=stmt.executeQuery();  
while(rs.next()){  
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));  
}    
sum.close();
}
}