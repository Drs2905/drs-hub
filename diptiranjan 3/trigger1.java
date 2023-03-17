import java.sql.*;
public class trigger1{
public static void main(String[] args)
{
String url="jdbc:mysql://localhost:3306/mca";
String user="root";
String pass="845594";
try{
Connection conn = DriverManager.getConnection(url,user,pass);
if(conn != null)
System.out.println("Connected !");
else System.out.println("Connection Error!");

Statement stmt = conn.createStatement();

stmt.execute("CREATE TRIGGER after_insert_detail AFTER INSERT ON dipti"
+" FOR EACH ROW "
+"BEGIN "
+"INSERT INTO student values(new.stud,new.name,new.roll,new.city,new.state,new.phone ,CURTIME());"
+"END;");

conn.close();

System.out.println("TRIGGER CREATED !");
}catch(Exception e){e.printStackTrace();}
}
}
