import java.sql.*;
public class select3
{
public static void main(String []args)throws Exception
{
Connection sum=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","845594");
Statement st=sum.createStatement();
String sql="update ranjan set roll=14 where Name='Naman'";
int i=st.executeUpdate(sql);
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