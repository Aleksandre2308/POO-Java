import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao{
	private static Connection con;
	
	static public Connection getConnection() {
		if(con == null) {
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost/oficina","root","");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		}
		else return con;
	}

}
