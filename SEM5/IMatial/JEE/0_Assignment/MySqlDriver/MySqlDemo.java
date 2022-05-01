import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDemo{
  public static void main(String[] argv) throws Exception {
    String driver = "com.mysql.jdbc.Driver";
    String connection = "jdbc:mysql://localhost:3306/YourDBName";
    String user = "root";
    String password = "root";
    Class.forName(driver);
    Connection con = DriverManager.getConnection(connection, user, password);
    if (!con.isClosed()) {
      con.close();
    }
  }
}