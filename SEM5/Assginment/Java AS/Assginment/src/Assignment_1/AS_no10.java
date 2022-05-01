package Assignment_1;

import java.sql.*;;

public class AS_no10 {
	public static void main(String a[])
	{
	//	Develop code to demonstrate DatabaseMetaData.

		try
		{
		    	Class.forName("oracle.jdbc.driver.OracleDriver");
		    	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "System", "hjd");
			    DatabaseMetaData dbmeta=conn.getMetaData();
			    System.out.println("Connection Created Successfully\n\n");
			    System.out.println("-----FIVE METHOD OF DATABASE METADATA-----\n");
			    System.out.println("\n1)GET PRODUCT NAME :"+dbmeta.getDatabaseProductName());
			    System.out.println("\n2)GET PRODUCT VERSION :"+dbmeta.getDatabaseProductVersion());
			    System.out.println("\n3)GET PRODUCT DRIVER NAME :"+dbmeta.getDriverName());
			    System.out.println("\n4)GET USERNAME :"+dbmeta.getUserName());
			    System.out.println("\5)GET CATALOGS :"+dbmeta.getCatalogs());
		}
		catch(Exception e)
		{
			System.out.println("Connection Error :"+e);
		}
	}
}
