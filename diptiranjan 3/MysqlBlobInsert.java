import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

		public class MysqlBlobInsert{
			public static void main(String args[]){
			String url="jdbc:mysql://localhost:3306/mca?";
			String user="root";
			String password="845594";
			String filepath="C:/Users/LENOVO/Desktop/New folder/My Photo.jpg";

				try{
			Connection conn=DriverManager.getConnection(url,user,password);
String  sql="INSERT INTO person2 (first_name,last_name,image) values (?,?,?)";
	PreparedStatement statement=conn.prepareStatement(sql);
	statement.setString(1, "dipti");
	statement.setString(2, "ranjan");
	InputStream inputStream=new FileInputStream(new File(filepath));
		statement.setBlob(3,inputStream);
int row=statement.executeUpdate();
if (row>0){
		System.out.println("a contact was inserted with photo image.");
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