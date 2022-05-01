import java.sql.*;
public class Prog_14
{
	static Connection cnn;
	static PreparedStatement pstmt;
	static Statement stmt;
		public static void main(String arg[])
		{
			 String un="root";
			 String ps="";
			 String url="jdbc:mysql://localhost:3306/cre_tbl";
			 try
			 {
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Class Loaded !!");
			 cnn=DriverManager.getConnection(url,un,ps);
			 System.out.println("Cnnnnnn Loaded !!");
			 ////////////create Table 
			 
			 stmt=cnn.createStatement();
			String sql="CREATE TABLE  demo1 " +
						" (sno INTEGER  NOT NULL , "+
					"sname VARCHAR( 15 ) ,"+
						"sgender VARCHAR( 15 ) ,"+
					"scity VARCHAR( 15 ) )";
			
			stmt.executeUpdate(sql);
			System.out.println("Table Created !!!!!");
			
			 ////////////Drop Table
			
			stmt=cnn.createStatement();
			String dr_sql="DROP TABLE `abc`";
			stmt.executeUpdate(dr_sql);
			System.out.println("Table Drop !!!!!");
			
			 }
			 catch(Exception e)
			 {
				 e.toString();
			 }
		}
		

}
