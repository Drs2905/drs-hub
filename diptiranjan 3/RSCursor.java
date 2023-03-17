import java.sql.*;
public class RSCursor {
   public static void main(String args[]) throws SQLException {
      String mysqlUrl = "jdbc:mysql://localhost:3306/mca";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "845594");
      System.out.println("Connection established......");
      Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
      String query = "Select * from employees";
      ResultSet rs = stmt.executeQuery(query);
rs.beforeFirst();
 rs.first();
      System.out.println("Contents of the first record: ");
      System.out.print("ID:" +rs.getInt("id"));
      System.out.print("Name: "+rs.getString("Name"));
      System.out.print("Salary: "+rs.getInt("Salary"));
      System.out.print("Location: "+rs.getString("Location"));
   }
}