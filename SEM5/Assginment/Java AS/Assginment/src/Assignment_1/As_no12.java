package Assignment_1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class As_no12 {
	
//	 Develop code that selects records from an Oracle table and insert them in MySq] Table.

	public static void main(String[] args) {
		
		try
		{ 
			
	    Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Oracle Driver loaded");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
	//	String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="system";
	    String pass="hjd";
	    
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Class/Driver Loaded");
	
		String myurl="jdbc:mysql://localhost:3306/hjd";
		String myuser="root";
		String mypass="";
	    
		Connection connor = DriverManager.getConnection(url,user,pass);
		System.out.println(" Orcal Detabase Conncetion Doned");
		
		Connection connmy = DriverManager.getConnection(myurl,myuser,mypass);
		System.out.println(" MySql Detabase Conncetion Doned");
		

//		Statement stor =connor.createStatement();
//		System.out.println("Statement Created");
//	
		Statement stmy =connmy.createStatement();
		System.out.println("Statement Created");
		
		
		class showdata
		{
		   void showOrcal() throws SQLException  {
			   ResultSet rsor =connor.createStatement().executeQuery("SELECT *FROM STUDENT");
				   System.out.println("\nSid\tSname\tSGender\tSBdate\t\tspersor\tScity");
				    while(rsor.next())
					{
				    	System.out.println(rsor.getInt(1)+"\t"+rsor.getString(2)+"\t"+rsor.getString(3)+"\t"+rsor.getDate(4)+"\t"+rsor.getFloat(5)+"\t"+rsor.getString(6));
					}
			}

		public void showMySQL() throws SQLException {
			ResultSet rsormy =connmy.createStatement().executeQuery("SELECT *FROM STUDENTMY");
			   System.out.println("\nSid\tSname\tSGender\tSBdate\t\tspersor\tScity");
			    while(rsormy.next())
				{
			    	System.out.println(rsormy.getInt(1)+"\t"+rsormy.getString(2)+"\t"+rsormy.getString(3)+"\t"+rsormy.getDate(4)+"\t"+rsormy.getFloat(5)+"\t"+rsormy.getString(6));
				}
			
		}
		}  
		   
		showdata sd =new showdata();
		Scanner input = new Scanner(System.in);
		int opchoice=0;
		
		while(opchoice != 05)
		{
			System.out.println("\n Enter Your opretion nmuber : ");
			System.out.println(" 01.Insert orcal to mySQl");
			System.out.println(" 02.Show mySql Database");
			System.out.println(" 03.Show orcal Database");
			System.out.println(" 04.Exit");	
			 opchoice = input.nextInt();
		
		
			switch(opchoice) {
			
			case 01 :
				int sid = 0;
				String sname = null,sgender= null,scity=null;
				Date sbdate = null;
				float spers = 0;
				 sd.showOrcal();
				System.out.println("\n Enter Sid for insert Orcal to MySQl :");	
				int sidchoice= input.nextInt();
				
				  ResultSet rsmo =connor.createStatement().executeQuery("SELECT *FROM STUDENT where sid="+sidchoice);

				while(rsmo.next())
			    {	
							   
			//	System.out.println("Enter Sid : ");
			    sid = rsmo.getInt("sid");
				
	     	    sname = rsmo.getString("sname");
				
			    sgender =rsmo.getString("sgender");
			
			     sbdate = rsmo.getDate("sbdate");
				
				 spers = rsmo.getFloat("spers");
				
				 scity = rsmo.getString("scity");	
				 
				System.out.println("Enter 1 Record : ");
			    }
			
				String SQLInsert="INSERT INTO studentmy(sid,sname,sgender,sbdate,spers,scity) VALUES ("+ sid  +",'"+ sname + "',' "+ sgender +"',' "+ sbdate +"',' "+ spers +"',' "+ scity +"')";
	
			int n = stmy.executeUpdate(SQLInsert);
			System.out.println(n +" Record Inserted in mysql. ");	
			break;
			case 02:
				   sd.showMySQL();
			break;
			
			case 03:
				   sd.showOrcal();
			break;
			
			case 04:
				System.exit(0);
			break;
			
			default:
				System.out.println("Please Enter right Choice :)");
			}
			
		}
		connor.close();
		connmy.close();
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.toString());
		}
	}

}
