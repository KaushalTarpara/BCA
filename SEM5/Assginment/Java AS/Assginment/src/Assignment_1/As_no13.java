package Assignment_1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;
import java.util.Scanner;

public class As_no13 {
	//Develop code to demonstrate CallableStatement for two Input and Three outPuts
  
	public static void main(String[] args) {
  
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
			System.out.println(" 01.Search Student Info ");
			System.out.println(" 02.Show Deta");
			System.out.println(" 03.Exit");	
			 opchoice = input.nextInt();
			switch(opchoice){
			
			case 01 :
			
				
				String SQLSearch ="{call SearchStudent(?,?,?,?,?)}";
				CallableStatement cst=conn.prepareCall(SQLSearch);
				
				try {
			 System.out.println("Enter Sid : ");
			 cst.setInt(1,input.nextInt());
				
			System.out.println("Enter Sname : ");
			cst.setString(2,input.next());
			
			
				
       	    cst.registerOutParameter(3,Types.CHAR);
	        cst.registerOutParameter(4,Types.DATE);
		    cst.registerOutParameter(5,Types.FLOAT);
		    cst.executeQuery();   
		      
		      String pgender = cst.getString(3);
		      Date pbdate = cst.getDate(4);
		   	Float ppers =cst.getFloat(5);
		    
			 System.out.println("Sgender  SBDate         SCity");
		     			
			 System.out.println (pgender +"\t "+pbdate +"\t"+ ppers );
				}
				catch(Exception e)
				{
					
					System.out.println("Please Enter Right Deta");
				}
			 break;
			case 02:
				   sd.show();
			break;
			
			case 03:
				System.exit(0);
		}
		}
		 conn.close();
		
	}
	catch(Exception e)
	{
		System.out.println("Error : "+e.toString());
		System.out.println("Please Enter Right Deta");
	}	


	}

}
