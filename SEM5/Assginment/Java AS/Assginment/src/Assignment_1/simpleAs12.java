package Assignment_1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class simpleAs12 {
	
//	 Develop code that selects records from an Oracle table and insert them in MySq] Table.

	public static void main(String[] args) {
		
		try
		{ 
			
	    Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Oracle Driver loaded");
		//String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="system";
	    String pass="9924384635";
	    
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
		
		
	
		   

				int sid = 0;
				String sname = null,sgender= null,scity=null;
				Date sbdate = null;
				float spers = 0;
		//		 sd.showOrcal();
				
				
				  ResultSet rsmo =connor.createStatement().executeQuery("SELECT *FROM STUDENT");
                String SQLInsert=null;
				while(rsmo.next())
			    {	
			   sid = rsmo.getInt("sid");
			   sname = rsmo.getString("sname");
			   sgender =rsmo.getString("sgender");
			   sbdate = rsmo.getDate("sbdate");
			   spers = rsmo.getFloat("spers");
			   scity = rsmo.getString("scity");	
				 
			 
			    
				
			
				 SQLInsert="INSERT INTO studentmy(sid,sname,sgender,sbdate,spers,scity) VALUES ("+ sid  +",'"+ sname + "',' "+ sgender +"',' "+ sbdate +"',' "+ spers +"',' "+ scity +"')";
				 int n = stmy.executeUpdate(SQLInsert);
			
			    }
							System.out.println( "Records Inserted in mysql. ");	
			
		
			
			
		
		connor.close();
		connmy.close();
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.toString());
		}
	}

}

