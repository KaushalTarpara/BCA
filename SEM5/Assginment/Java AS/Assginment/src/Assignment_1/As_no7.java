package Assignment_1;

import java.sql.*;

public class As_no7 {
	
//	 Develop code to display the records of above table using Prepared-
//	 Statement and Resultset where City belongs to Baroda.
	public static void main(String[] args) {

		try
		{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle Driver loaded");
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
		//	String url="jdbc:oracle:thin:@localhost:1521:XE";
			String user="system";
		    String pass="hjd";
			Connection conn = DriverManager.getConnection(url,user,pass);
			System.out.println(" Orcal Detabase Conncetion Doned");
			
			String SQLSelect="Select *from student";
			 PreparedStatement pst1=conn.prepareStatement(SQLSelect);
			 
			 System.out.println("Records Which City belongs to Baroda.");
				
			 
			 
			ResultSet rs = pst1.executeQuery("SELECT *FROM STUDENT where scity='baroda' ");
			   System.out.println("\nSid\tSname\tSGender\tSBdate\t\tspers\tScity");
			    while(rs.next())
				{
			    	System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDate(4)+"\t"+rs.getFloat(5)+"\t"+rs.getString(6));
				}
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.toString());
		}
	}

}
