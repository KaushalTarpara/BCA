import java.sql.*;
public class Prog_15 {

	public static void main(String[] args) 
	{
		Connection conn=null;
		Statement st;
		 try
		 {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
                                    //System.out.println("Class Loaded !!");
		 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","jay");		 
		 st=conn.createStatement();
		 String sql="alter table Student Add(Address varchar(50))";
		 st.executeQuery(sql);
		 System.out.println("Table Alter !!!!!");
		 }
		 catch(Exception e)
		 {
			System.out.println(e);
		 }
	}
}
