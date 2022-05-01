import java.sql.*;
public class PROG9 
{
	
	public static void main(String a[])
	{
		Connection conn=null;
		try
		{
		    	    Class.forName("oracle.jdbc.driver.OracleDriver");
			    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "jay");

			    PreparedStatement ps=conn.prepareStatement("select *from student");
			    ResultSet rs=ps.executeQuery();
			    ResultSetMetaData rsd=rs.getMetaData();

			    System.out.println("Connection Created Successfully\n\n");
			    
			    System.out.println("-----FIVE METHOD OF RESULT SET METADATA-----\n");
			    
			    System.out.println("GET COLUMN COUNT : "+rsd.getColumnCount());
			    System.out.println("GET TABLE NAME : "+rsd.getTableName(2));
			    System.out.println("GET COLUMN TYPE : "+rsd.getColumnType(1));
			    System.out.println("GET COLUMN DISPLAY SIZE : "+rsd.getColumnDisplaySize(2));
			    System.out.println("GET COLUMN LABEL : "+rsd.getColumnLabel(2));
		}
		catch(Exception e)
		{
			System.out.println("Connection Error :"+e);
		}
	}
		 
	
}
