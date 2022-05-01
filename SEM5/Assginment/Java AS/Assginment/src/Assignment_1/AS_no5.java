package Assignment_1;

import java.sql.*;
import java.util.Scanner;

public class AS_no5 {

	
//  Develop code to demonstrate the ResultSet interface to retrive table data, consider the following schema.

//	 Table Name : Student (Sid, Sname,SGender, SBdate, SPerc, SCity)
//	 Display the student details report in following manner:

//	 ‘a. Ascending order of "SBdate”
//	 ». Descending order of the "Scity” whose gender is “Male”
//	 <. Descending order city where Scity="Jamnagar” & "Rajkot"


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
			
			Statement stmt =conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			System.out.println("Statement Created");
			
			
			
			Scanner input = new Scanner(System.in);
			int opchoice=0;
			
			while(opchoice != 05)
			{
				System.out.println("\n Enter Your opretion nmuber : ");
				System.out.println(" 01.Ascending order of SBdate");
				System.out.println(" 02. Descending order of the Scity whose gender is Male");
				System.out.println(" 03.Descending order city where Scity=Jamnagar & Rajkot");
				System.out.println(" 04.Exit");	
				 opchoice = input.nextInt();
			
			
				switch(opchoice) {
				case 01:
					
					 ResultSet rs=stmt.executeQuery("SELECT *FROM student ORDER BY sbdate ASC" );
					   System.out.println("\nSid\tSname\tSGender\tSBdate\t\tspers\tScity");
						while(rs.next())
						{
							System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3).trim()+"\t"+rs.getDate(4)+"\t"+rs.getFloat(5)+"\t"+rs.getString(6));
						}
					
					
				break;
				case 02 :                                       //     SGender='Male' ORDER  BY SCity DESC 
					rs=stmt.executeQuery("SELECT *FROM student where sgender=' male' ORDER BY scity DESC" );
					   System.out.println("\nSid\tSname\tSGender\tSBdate\t\tspers\tScity");
						while(rs.next())
						{
							System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3).trim()+"\t"+rs.getDate(4)+"\t"+rs.getFloat(5)+"\t"+rs.getString(6));
						}
	
				break;
			
				case 03 :
				rs=stmt.executeQuery("SELECT *FROM student where scity=' jamnager' or scity=' rajkot' ORDER BY scity DESC" );
					   System.out.println("\nSid\tSname\tSGender\tSBdate\t\tspers\tScity");
						while(rs.next())
						{
							System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDate(4)+"\t"+rs.getFloat(5)+"\t"+rs.getString(6));
						}
				break;
				case 04:
					System.exit(0);
					  
					
					break;
				default:
					System.out.println("Please Enter right Choice :)");
				}
			
		
			}
			conn.close();
			}
			catch(Exception e)
			{
				System.out.println("Error : "+e.toString());
			}
     

	}

}
