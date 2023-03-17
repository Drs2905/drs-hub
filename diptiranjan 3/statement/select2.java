import java.sql.*;
public class select2
{
public static void main(String []args)throws Exception
{
Connection sum=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","845594");
Statement st=sum.createStatement();
String sql="insert into ranjan values(2,'Naman',13)";
int i=st.executeUpdate(sql);
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