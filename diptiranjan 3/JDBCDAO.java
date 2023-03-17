import java.sql.*;
public class JDBCDAO{
public static void main(String args[]){
StudentDAO dao=new StudentDAO();
Student s1=dao.getStudent(24);
System.out.println(s1.name);
}
}
class StudentDAO{
public Student getStudent(int roll){
try{
String query="select name from student2 where roll="+roll;
Student s=new Student();
s.roll=roll;
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","845594");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(query);
rs.next();
String name=rs.getString(1);
s.name=name;
return s;
}
catch(SQLException e){}
return null;
}
}
class Student{
int roll;
String name;
}