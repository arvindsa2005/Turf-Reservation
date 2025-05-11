package turf;
import java.sql.*;


public class DbConnection {
	private static String url = "jdbc:mysql://127.0.0.1:3306/Turf";
	private static String un = "root";
	private static String pw = "AVjune7-2022";
	
	public static Connection getConnection ()throws Exception{
		return DriverManager.getConnection(url,un,pw);
	}
	
}
