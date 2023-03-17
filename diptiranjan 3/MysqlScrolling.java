import java.sql.*;
class MsqlScrolling{
    public static void main(String args[]){

try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","845594")){
			if (conn !=null){
    		System.out.println("connected to the database !");
				}
					else{
					   System.out.println("Failed to make connection !");
				}
Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
ResultSet rs = st.executeQuery("select * from student");
System.out.println("records in the table......");
while(rs.next()){
System.out.println(rs.getInt(1)+" -> " + rs.getString(2)+"->"+rs.getInt(3)+"->"+rs.getString(4));
}
System.out.println(".......Scrolling started..........");
rs.first();
System.out.println("FIRST RECORD.....");
System.out.println(rs.getInt(1)+"->"+rs.getString(2));
System.out.println("Scrolling continues..........");
rs.absolute(3);
System.out.println("THIRD RECORD.....");
System.out.println(rs.getInt(1)+"->"+rs.getString(2));
System.out.println("Scrolling continues..........");
rs.last();
System.out.println("LAST RECORD.....");
System.out.println(rs.getInt(1)+"->"+rs.getString(2));
System.out.println("Scrolling continues..........");
rs.previous();
System.out.println("LAST TO FIRST RECORD UPWARD.....");
System.out.println(rs.getInt(1)+"->"+rs.getString(2));
rs.relative(-5);
System.out.println("LAST YO FIFTH RECORD UPWARD.....");
System.out.println(rs.getInt(1)+"->"+rs.getString(2));
rs.relative(-2);
System.out.println("LAST TO SECOND RECORD UPWARD.....");
System.out.println(rs.getInt(1)+"->"+rs.getString(2));
rs.relative(5);
System.out.println("LAST TO FIFTH RECORD DOWNWARD.....");
System.out.println(rs.getInt(1)+"->"+rs.getString(2));
System.out.println("........SCROLLING OVER NOW......");
conn.close();
}
catch(Exception e){
System.out.println(e);
}
}
}