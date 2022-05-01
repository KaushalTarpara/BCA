import java.sql.*;

public class PROG7
 {

	public static void main(String[] args) 
	{
		Connection conn=null;
		 
		 try
		 {
		    	    Class.forName("oracle.jdbc.driver.OracleDriver");
			    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "nirav");
			    Statement st=conn.createStatement();
			    String query = "SELECT Sid, Sname, SGender, SBdate,SPerc,SCity FROM Student Where SCity='Baroda'";
			    ResultSet rs=st.executeQuery(query);
			    while(rs.next())
				{
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6));
				}
		 } 
		 catch (Exception e)
		 {
				
			System.out.println(e);
		}

	}

}
