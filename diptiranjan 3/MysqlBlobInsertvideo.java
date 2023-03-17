import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

        public class MysqlBlobInsertvideo{
            public static void main(String args[]){
            String url="jdbc:mysql://localhost:3306/mca?";
            String user="root";
            String password="845594";
            
            String filepath1="C:/Users/LENOVO/Desktop/my video.mp4";
                

    try{
    Connection conn=DriverManager.getConnection(url,user,password);
    String  sql="INSERT INTO person (first_name,last_name,video) values (?,?,?)";
    PreparedStatement statement=conn.prepareStatement(sql);
    statement.setString(1, "DIPTI");
    statement.setString(2, "RANJAN");
    InputStream inputStream1=new FileInputStream(new File(filepath1));
    statement.setBlob(3,inputStream1);
int row=statement.executeUpdate();
if (row>0){
        System.out.println("a contact was inserted with video.");
}
conn.close();
}
catch(SQLException ex){
ex.printStackTrace();
}
catch(IOException ex){
ex.printStackTrace();
}
}}