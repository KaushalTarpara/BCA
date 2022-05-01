package Assignment_1;

import java.sql.*;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class As_no4 {

	public static void main(String[] args) {

		System.out.println("DCT Demonstrate to CreateStatment interface to insert ,update and delete with Oracle Table");
		System.out.println(" *******************************************************");
		 
		try
		{ 
			
	    Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Oracle Driver loaded");
	//	String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="system";
	    String pass="9924384635";
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println(" Orcal Detabase Conncetion Doned");
		
		Statement stmt =conn.createStatement();
		System.out.println("Statement Created");
		
		class showdata
		{
		   void show() throws SQLException {
				 ResultSet rs =conn.createStatement().executeQuery("SELECT *FROM STUDENT");
				   System.out.println("\nSid\tSname\tSGender\tSBdate\t\tspers\tScity");
				    while(rs.next())
					{
				    	System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDate(4)+"\t"+rs.getFloat(5)+"\t"+rs.getString(6));
					}
			}
		}  
		   
		showdata sd =new showdata();
		
		Scanner input = new Scanner(System.in);
	
		int opchoice=0;
		
		while(opchoice != 05)
		{
			System.out.println("\n Enter Your opretion nmuber : ");
			System.out.println(" 01.Insert");
			System.out.println(" 02.Update");
			System.out.println(" 03.Delete");
			System.out.println(" 04.Show Deta");
			System.out.println(" 05.Exit");	
			 opchoice = input.nextInt();
		
		
			switch(opchoice) {
			case 01:
				
				System.out.println("Enter Sid : ");
				int sid = input.nextInt();
				
				System.out.println("Enter Sname : ");
	     	   	String sname = input.next();
						
				System.out.println("Enter Gender (Male OR Female) :");
			     String sgender=input.next();
			
		     	System.out.println("Enter BirthDate : ");
			    String sbdate = input.next();
							
				System.out.println("Enter Pertange  : ");
				float spers = input.nextFloat();
				
				System.out.println("Enter city : ");
				String scity = input.next();
							
			
				String SQLInsert="INSERT INTO student(sid,sname,sgender,sbdate,spers,scity) VALUES ("+sid+",'"+sname+ "','"+sgender.trim()+"',' "+sbdate+"',' "+spers+"','"+scity.trim()+"')";
	
				int n = stmt.executeUpdate(SQLInsert);
				System.out.println(n +" Record Inserted . ");	

			break;
			case 02 :
				sd.show();
				System.out.println("\n Enter Sid  where you update Recored: ");
				 int uid = input.nextInt();
				 System.out.println("\n OlD Values");

				
				System.out.println("Enter Sname : ");
	     	    String uname = input.next();
						
				System.out.println("Enter Gender (Male OR Female) :");
			    String ugender =input.next();
			
		     	System.out.println("Enter BirthDate : ");
			    String ubdate = input.next();
							
				System.out.println("Enter Pertange  : ");
				float upers = input.nextFloat();
				
				System.out.println("Enter city : ");
				String ucity = input.next().trim();
				 
				String SQLUpdate ="update student set sname='"+uname+"',sgender='"+ugender+"',sbdate='"+ubdate+"',spers="+upers+",scity='"+ucity+"' where sid="+uid;
				 n = stmt.executeUpdate(SQLUpdate);
					System.out.println(n +" Record Updated. ");	
			break;
		
			case 03 :
				System.out.println("Enter Sid  where you Delect Recored: ");
				 int did = input.nextInt();
				String SQLDelete ="Delete from student where sid="+did;
				 n = stmt.executeUpdate(SQLDelete);
					System.out.println(n +" Record delete. ");	
			break;
			case 04:
				   sd.show();
				
				break;
			case 05:
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
