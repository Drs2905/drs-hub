import java.sql.*;
public class select4
{
public static void main(String []args)throws Exception
{
Connection sum=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","845594");
Statement st=sum.createStatement();
String sql="delete from ranjan where Name='Naman'";
int i=st.executeUpdate(sql);
if(i>0)
{
System.out.println("delete success");
}
else
{
System.out.println("Not done");
}
sum.close();
}
}