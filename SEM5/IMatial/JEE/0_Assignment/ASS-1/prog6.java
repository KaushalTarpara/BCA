import java.sql.*;

public class PROG6 
{
	public static void main(String[] args) 
	{
		Connection conn=null;
		 try 
		 {
		    	   Class.forName("oracle.jdbc.driver.OracleDriver");
		    	    System.out.println("Insert Operation");
			    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "jay");
			    String query = "insert into Student (Sid,Sname,SGender, SBdate,Sperc,SCity) values (12,'Raj','Male','20/FEB/1930',80,'Baroda') ";
			    PreparedStatement psm= conn.prepareStatement(query);
			    ResultSet rs=psm.executeQuery(query);
			    System.out.println("Record insert");
			    while(rs.next())
			    {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5)+"  "+rs.getString(6));
			    }
			System.out.println("--------------------------------------------------------------");
			System.out.println("Update Operation");
		    	conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "1a2b3c4d9680");
		    	String query1 = "update Student set Sid=10 where Sid=4 ";
		    	PreparedStatement psm1= conn.prepareStatement(query1);
		    	ResultSet rs1=psm1.executeQuery(query1);
		    	System.out.println("Record Updated");
		    	while(rs1.next())
			{
				System.out.println(rs1.getInt(1)+"  "+rs1.getString(2)+"  "+rs1.getString(3)+"  "+rs1.getString(4)+"  "+rs1.getInt(5)+"  "+rs1.getString(6));
			}
		    	System.out.println("--------------------------------------------------------------");
			System.out.println("Delete Operation");
		    	conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "1a2b3c4d9680");
		    	String query2 = "delete from Student where Sid=6 ";
		    	PreparedStatement psm2= conn.prepareStatement(query2);
		    	ResultSet rs2=psm2.executeQuery(query2);
		    	System.out.println("Record Deleted");
		   	 while(rs2.next())
			{
				System.out.println(rs2.getInt(1)+"  "+rs2.getString(2)+"  "+rs2.getString(3)+"  "+rs2.getString(4)+"  "+rs2.getInt(5)+"  "+rs2.getString(6));
			}
			psm.close();
			psm1.close();
		    	psm2.close();
			conn.close();
		 }
		 catch (Exception e)
		 {
			
			System.out.println(e);
		}
	}
}
