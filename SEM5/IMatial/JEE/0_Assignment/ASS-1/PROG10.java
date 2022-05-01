import java.sql.*;
public class PROG10
{
	
	public static void main(String a[])
	{
		Connection conn=null;
		try
		{
		    	Class.forName("oracle.jdbc.driver.OracleDriver");
			    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "jay");
			    DatabaseMetaData dbmeta=conn.getMetaData();
			    System.out.println("Connection Created Successfully\n\n");
			    System.out.println("-----FIVE METHOD OF DATABASE METADATA-----\n");
			    System.out.println("GET PRODUCT NAME :"+dbmeta.getDatabaseProductName());
			    System.out.println("GET PRODUCT VERSION :"+dbmeta.getDatabaseProductVersion());
			    System.out.println("GET PRODUCT DRIVER NAME :"+dbmeta.getDriverName());
			    System.out.println("GET USERNAME :"+dbmeta.getUserName());
			    System.out.println("GET CATALOGS :"+dbmeta.getCatalogs());
		}
		catch(Exception e)
		{
			System.out.println("Connection Error :"+e);
		}
	}
		 
	
}
