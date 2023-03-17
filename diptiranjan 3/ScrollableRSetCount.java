import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ScrollableRSetCount {
 public static void main(String[] args) {
 String url = "jdbc:mysql://localhost:3306/mca";
 String username = "root";
 String password = "845594";
 try (Connection conn = DriverManager.getConnection(url, username, password)) {
 String sql = "SELECT * FROM student";
 Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
 ResultSet results = statement.executeQuery(sql);
 System.out.println("Cursor position " + results.getRow() + ", is before first ? " +results.isBeforeFirst());
 results.next();
 System.out.println("Cursor position " + results.getRow() + ", is first ? " + results.isFirst());
 results.last();
 System.out.println("Cursor position " + results.getRow() + ", is last ? " + results.isLast());
 results.afterLast();
 System.out.println("Cursor position " + results.getRow() + ", is after last ? " + results.isAfterLast());
 results.absolute(3);
 System.out.println("Cursor position " + results.getRow());
results.absolute(-1);
 System.out.println("Cursor position " + results.getRow() + ", is last ? " + results.isLast());
 results.absolute(-4);
 System.out.println("Cursor position " + results.getRow());
 results.relative(5);
 System.out.println("Cursor position " + results.getRow() + ", is after last ? " +results.isAfterLast());
 results.relative(-13);
 System.out.println("Cursor position " + results.getRow() + ", is before first ? " +results.isBeforeFirst());
} catch (SQLException e) {
 System.out.println("Could not retrieve data from the database " + e.getMessage());
}
}
}