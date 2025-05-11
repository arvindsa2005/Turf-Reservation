package turf;
import java.sql.*;
public class CusDAO {
	
	public static void insert(Cus_info c) throws Exception{
		
		Connection con = DbConnection.getConnection();
		String Q = "insert into Customer (Cname,Mob_no) values(?,?)"; 
		PreparedStatement ps = con.prepareStatement(Q);
		
		ps.setString(1, c.Cname);
		ps.setString(2, c.Mob);
		
		int a = ps.executeUpdate();
		con.close();
		
	}
	
	public static void display() throws Exception {
		Connection con = DbConnection.getConnection();
		Statement s = con.createStatement();
		String Q = "select * from Customer";
		ResultSet rs =s.executeQuery(Q);
		while(rs.next()) {
			System.out.print(rs.getInt(1)+ " ");
			System.out.print(rs.getString(2)+ " ");
			System.out.print(rs.getString(3));
			System.out.println();
		}
		
	}
	
	
}
