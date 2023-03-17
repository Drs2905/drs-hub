import java.sql.*;
public class select{
public static void main(String []args)throws Exception{
Connection sum=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","845594");
Statement st=sum.createStatement();
ResultSet rs=st.executeQuery("select * from ranjan");
while(rs.next())
{
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
}
sum.close();
}
}