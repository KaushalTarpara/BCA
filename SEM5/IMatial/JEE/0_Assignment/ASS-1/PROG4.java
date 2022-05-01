import java.sql.*;

public class Test {

	public static void main(String[] args)
	 {
		Connection conn=null;
		 
			 try 
			 {
			    	Class.forName("oracle.jdbc.driver.OracleDriver");
				    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "System", "hjd");
				    Statement st=conn.createStatement();
				    //Delete Operation
				    String query = "delete from tbl_stud where SNO=1 ";
				    ResultSet rs=st.executeQuery(query);
				    System.out.println("Record Deleted");
				    //Update Operation
				    String query1 = "update tbl_stud set SNO=4 where SNO=2 ";
				    ResultSet rs1=st.executeQuery(query1);
				    System.out.println("Record Updated");
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"  "+rs.getString(2));
				}
				conn.close();

			} 
			catch (Exception e)
			{
				
				System.out.println(e);
			}

		

	}

}
