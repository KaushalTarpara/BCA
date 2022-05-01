import java.sql.*;
public class Prog_11 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:MYSQL://localhost:3306/test","root","");
			System.out.print("Connction MySql"+"\n\n");
			Class.forName("oracle.jdbc.driver.OracleDriver");				
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","jay");
			System.out.print("Connction Oracle"+"\n\n");
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			//conn=DriverManager.getConnection("jdbc:Ucanaccess://E:\\Data_acc.accdb");
			System.out.print("Connction Access"+"\n\n");
		}
		catch(Exception  e)
		{
			System.out.println(e);
		}
	}

}
