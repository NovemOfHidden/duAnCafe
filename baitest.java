package duAnCafe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class baitest {

	public static Connection main () throws SQLException {
		// TODO Auto-generated method stub
           Connection connection = null;
           try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionURL= "jdbc:sqlserver://PC\\SQLEXPRESS:1433;databaseName=DuAnKhachSan;integratedSecurity=true";
			connection = DriverManager.getConnection(connectionURL);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
		 System.err.println(e.getMessage()+"/n"+e.getClass()+"/n"+e.getCause());
		}
		return connection;
	}
}
