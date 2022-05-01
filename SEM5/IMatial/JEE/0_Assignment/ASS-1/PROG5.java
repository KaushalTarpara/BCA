import java .sql.*;
public class Stud {

	public static void main(String[] args)
	{
		Connection conn=null;	 
		try
		 {
		    	Class.forName("oracle.jdbc.driver.OracleDriver");
			    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "jay");
			    Statement st=conn.createStatement();
			  //Ascending Order
			    String query = "SELECT Sid, Sname, SGender, SBdate,SPerc,SCity FROM Student" +
                 				" ORDER BY SBdate ASC";
			    ResultSet rs=st.executeQuery(query);
			    System.out.println("Record Ascending Order");
			    System.out.println("-----------------------------------------------------------------------------------------");
			    while(rs.next())
			    {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6));
			    }

			  //Descending Order by city whose gender=male
			    String query1 = "select * from Student where SGender='Male' ORDER  BY SCity DESC ";
			    ResultSet rs1=st.executeQuery(query1);
			    System.out.println("Record Descending Order");
			    System.out.println("-----------------------------------------------------------------------------------------");
			    while(rs1.next())
			    {
				System.out.println(rs1.getInt(1)+"  "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getString(4)+" "+rs1.getInt(5)+" "+rs1.getString(6));
		   	    }
	
	                            	    //Ascending Order by name (only 2 cities (jamnagar,rajkot))

			    String query2 = "select * from Student where SCity IN ('Jamnagar', 'Rajkot') ORDER  BY Sname ASC ";
			    ResultSet rs2=st.executeQuery(query2);
			    System.out.println("Record Ascending Order");
			    System.out.println("-----------------------------------------------------------------------------------------");
				while(rs2.next())
			{
				System.out.println(rs2.getInt(1)+"  "+rs2.getString(2)+" "+rs2.getString(3)+" "+rs2.getString(4)+" "+rs2.getInt(5)+" "+rs2.getString(6));
			}
			conn.close();

		} catch (Exception e) {
			
			System.out.println(e);
		}	
	}



}
	
