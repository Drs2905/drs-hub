import java.sql.*;
public class readonly2 {
   public static void main(String[] args) throws Exception {
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      String mysqlUrl = "jdbc:mysql://localhost:3306/mca";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "845594");
      System.out.println("Connection established......");
      Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
      ResultSet rs = stmt.executeQuery("select * from employees where id=1");
      System.out.println("Contents of the table: ");
      rs.beforeFirst();
      while(rs.next()) {
  System.out.print("ID: " + rs.getInt("id"));
         System.out.print(", Salary: " + rs.getInt("Salary"));
         System.out.print(", Name: " + rs.getString("Name"));
         System.out.println(", Location: " + rs.getString("Location"));
      }
      System.out.println();
  rs.beforeFirst();
      while(rs.next()) {
         
      }
      
   }
}