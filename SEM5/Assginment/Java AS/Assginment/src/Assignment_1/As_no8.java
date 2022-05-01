package Assignment_1;

import java.sql.*;
import java.util.Scanner;

public class As_no8 {

//	Develop code to demonstrate CallableStatement for Insert, Update
//	 & Delete. (Create a procedures in oracle for above table).
	
	
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
				
				String SQLInsert ="{call insertStudent(?,?,?,?,?,?)}";
				CallableStatement cst=conn.prepareCall(SQLInsert);
				
		 		 
				System.out.println("Enter Sid : ");
				 cst.setInt(1, input.nextInt());
				
				System.out.println("Enter Sname : ");
				 cst.setString(2, input.next());
						
				System.out.println("Enter Gender (Male OR Female) :");
				 cst.setString(3, input.next());
			
		     	System.out.println("Enter BirthDate : ");
		     	 cst.setString(4, input.next());
							
				System.out.println("Enter Pertange  : ");
				 cst.setFloat(5, input.nextFloat());
				
				System.out.println("Enter city : ");
				 cst.setString(6, input.next());
			
		     	int n =	 cst.executeUpdate();
				System.out.println(n +" Record Inserted . ");	

			break;
			case 02 :
				sd.show();
								
				String SQLUpdate ="{call UpdateStudent(?,?,?,?,?,?)}";
				cst=conn.prepareCall(SQLUpdate);
				
		 		 
				System.out.println("Enter Sid Where You Update: ");
				 cst.setInt(1, input.nextInt());
				
				System.out.println("Enter Sname : ");
				 cst.setString(2, input.next());
						
				System.out.println("Enter Gender (Male OR Female) :");
				 cst.setString(3, input.next());
			
		     	System.out.println("Enter BirthDate : ");
		     	 cst.setString(4, input.next());
							
				System.out.println("Enter Pertange  : ");
				 cst.setFloat(5, input.nextFloat());
				
				System.out.println("Enter city : ");
				 cst.setString(6, input.next());
			
		     	 n =	 cst.executeUpdate();
				System.out.println(n +" Record Updated. . ");	
	
				break;
		
			case 03 :
				
				sd. show();   
				String SQLDelete ="{call DeleteStudent(?)}";
				cst=conn.prepareCall(SQLDelete);
				System.out.println("Enter Sid  where you Delect Recored: ");
				 cst.setInt(1, input.nextInt());
			
				 n = cst.executeUpdate();
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
