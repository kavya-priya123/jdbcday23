package jdbcday23;
import java.sql.*;
public class TestConnection {

	public static void main(String[] args) throws SQLException{
		
		String url="jdbc:mysql://localhost:3306/world";
		String userName="root";
		String password="admin";
		
		Connection con=DriverManager.getConnection(url, userName, password);
		System.out.println(con);
	}

}
