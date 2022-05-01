package Assignment_1;
import java.sql.*;
public class As_no9 {

	
//	Develop code to demonstrate ResultSetMetaData for the above table.


	public static void main(String[] args) {
		
		try
		{
		    	    Class.forName("oracle.jdbc.driver.OracleDriver");
			   Connection  conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "System", "hjd");

			    PreparedStatement ps=conn.prepareStatement("select *from student");
			    ResultSet rs=ps.executeQuery();
			    ResultSetMetaData rsd=rs.getMetaData();

			    System.out.println("Connection Created Successfully\n\n");
			    
			    System.out.println("-----FIVE METHOD OF RESULT SET METADATA-----\n");
			    
			    System.out.println("\n1)GET COLUMN COUNT : "+rsd.getColumnCount());
			    System.out.println("\n2)GET TABLE NAME : "+rsd.getTableName(2));
			    System.out.println("\n3)GET COLUMN TYPE : "+rsd.getColumnType(1));
			    System.out.println("\n4)GET COLUMN DISPLAY SIZE : "+rsd.getColumnDisplaySize(2));
			    System.out.println("\n5)GET COLUMN LABEL : "+rsd.getColumnLabel(2));
		}
		catch(Exception e)
		{
			System.out.println("Connection Error :"+e);
		}

	}

}
