package Sreejdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Arraydata {
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());		
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SRIKANTH","shobha144144#");		
				Statement stmt= con.createStatement();
				ResultSet rs= stmt.executeQuery("select * from REGBATCH");
				while(rs.next()){
				
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					//System.out.println(rs.getInt(3));
					System.out.println(rs.getInt(4));
					System.out.println(rs.getString(5));
					System.out.println("=============================");
				}
				con.close();
	}
}
