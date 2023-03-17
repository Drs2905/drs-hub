import java.sql.*;
import javax.sql.rowset.*;
import javax.sql.rowset.spi.*;
import java.io.*;
public class JdbcRowset {  
        public static void main(String[] args) throws Exception {  
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
        rowSet.setUrl("jdbc:mysql://localhost:3306/mca");  
        rowSet.setUsername("root");  
        rowSet.setPassword("845594");  
                   
        rowSet.setCommand("select * from employees");  
        rowSet.execute();  
                   
    while (rowSet.next()) {  
                        // Generating cursor Moved event  
                        System.out.println("Id: " + rowSet.getString(1));  
                        System.out.println("Name: " + rowSet.getString(2));  
                        System.out.println("Salary: " + rowSet.getString(3));  
                }  
                 
        }  
}  