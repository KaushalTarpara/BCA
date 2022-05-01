package Assignment_1;
import java.sql.*;
public class As_no11 {
	// Develop code to to define connection with MS Access database.


	public static void main(String[] args) 
	{
		try
		{
	    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		
		Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/PC/Documents/hjd.accdb");			
	
		String Insert= "Insert into student values (12,'ravi','www')";
		if(conn.createStatement().executeUpdate(Insert) > 0)
		{
			System.out.println("Recored added");
		}
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.toString());
		}

	}

}
