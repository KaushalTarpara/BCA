package Assignment_1;
import java.sql.*;
import java.util.Scanner; 
public class As_no3 {

	public static void main(String[] args) {
		System.out.println(" DCT Define JDBC Connection to Oracle and MySQL database");
		System.out.println(" *******************************************************");
		try
		{ 
		 String url = null,user =null,pass=null;
		 int choice =0;
		 
		while(choice != 3)
		{
			 
		System.out.println("\n Enter DataBase Number : ");
		System.out.println(" 01. MY SQL");
		System.out.println(" 02. Ocacle");
		System.out.println(" 03. Exit");
	
		Scanner input = new Scanner(System.in);
		 choice = input.nextInt();
		
		
			switch(choice) {
			case 01:
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println(" My SQL Class/Driver Loaded");
				 url="jdbc:mysql://localhost:3306/hjd";
				 user="root";
				 pass="";


			break;
			case 02 :
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Oracle Driver loaded");
			 //  url="jdbc:oracle:thin:@localhost:1521:orcl";
				 url="jdbc:oracle:thin:@localhost:1521:XE";
				user="system";
				pass="9924384635";
			break;
			case 03 :
				System.exit(0);
			 break;
			default:
				System.out.println("\nPlease Enter right choice (1 Or 2)  :)");
			
		}
		
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println("Conncetion Doned");
		
		conn.close();
		}
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.toString());
		}
	}
		

}


