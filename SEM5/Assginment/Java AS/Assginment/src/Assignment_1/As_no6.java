package Assignment_1;

import java.sql.*;
import java.util.Scanner;

public class As_no6 {
	
//	Develop code to demonstrate PreparedStatement for Insert, Update
//	& Delete record for the above table.

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
		
		Scanner input = new Scanner(System.in);
		int opchoice=0;
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
		}  		showdata sd =new showdata();
		
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
				
				String SQLInsert="insert into student values(?,?,?,?,?,?)";
				  pst1=conn.prepareStatement(SQLInsert);
				 
				
		 		 
				System.out.println("Enter Sid : ");
				 pst1.setInt(1, input.nextInt());
				
				System.out.println("Enter Sname : ");
				 pst1.setString(2, input.next());
						
				System.out.println("Enter Gender (Male OR Female) :");
				 pst1.setString(3, input.next());
			
		     	System.out.println("Enter BirthDate : ");
		     	 pst1.setString(4, input.next());
							
				System.out.println("Enter Pertange  : ");
				 pst1.setFloat(5, input.nextFloat());
				
				System.out.println("Enter city : ");
				 pst1.setString(6, input.next());
			
			int n =	 pst1.executeUpdate();
				System.out.println(n +" Record Inserted . ");	

			break;
			case 02 :
				sd.show();
				String SQLUpdate="update student set sname=?,sgender=?,sbdate=?,spers=?,scity=? where sid=?";
				 pst1=conn.prepareStatement(SQLUpdate);
				
				 System.out.println("Enter Sid where you update: ");
				 pst1.setInt(6, input.nextInt());
									
					System.out.println("Enter Sname : ");
					 pst1.setString(1, input.next());
							
					System.out.println("Enter Gender (Male OR Female) :");
					 pst1.setString(2, input.next());
				
			     	System.out.println("Enter BirthDate : ");
			     	 pst1.setString(3, input.next());
								
					System.out.println("Enter Pertange  : ");
					 pst1.setFloat(4, input.nextFloat());
					
					System.out.println("Enter city : ");
					 pst1.setString(5, input.next());
				
				    n = pst1.executeUpdate();
			 		System.out.println(n +" Record updated . ");	

		
			break;
		
			case 03 :
				sd.show();
				     String SQLDelete="delete from student where sid=?";
					 pst1=conn.prepareStatement(SQLDelete);
					 System.out.println("\n Enter Sid  where you Delect Recored: ");
					 pst1.setInt(1,input.nextInt());
				
					 n = pst1.executeUpdate();
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
