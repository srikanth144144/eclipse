package Sreejdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Resultset {
	public static void main(String[] args) throws SQLException {	
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());		
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SRIKANTH","shobha144144#");
	        
		//ResultSet.CONCUR_READ_ONLY
		//ResultSet.CONCUR_UPDATABLE
		//ResultSet.TYPE_SCROLL_INSENSITIVE
		//ResultSet.TYPE_SCROLL_SENSITIVE
		Statement stmt= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs= stmt.executeQuery("select * from sinformation");
		
		while(rs.next()){
		
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getInt(4));
			System.out.println("=============================");
		}
		con.close();
	}
}


