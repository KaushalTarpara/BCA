import java.sql.*;
public class prog1 
{
	public static void main(String[] args) 
	{
		Connection conn=null; 
		 try 
		 {
		
		    	Class.forName("oracle.jdbc.driver.OracleDriver");
		    	conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","jay");
		        	Statement st=conn.createStatement();
			String query = "insert into tbl_student(SNO,SNAME) values(1,'kaju') ";
			ResultSet rs=st.executeQuery(query);
			System.out.println("Record insert");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			}
			conn.close();

		 }
		 catch (Exception e)
		 {
			
			System.out.println("ERROR : "+e);
		 } 

	}
}


