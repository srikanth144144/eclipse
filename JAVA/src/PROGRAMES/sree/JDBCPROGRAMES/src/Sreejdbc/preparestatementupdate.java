package Sreejdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class preparestatementupdate {
	public static void main(String[] args) throws SQLException {	
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());		
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SRIKANTH","shobha144144#");
	
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the name");
		String SNAME=sc.nextLine(); 
		System.out.println("enter id");
		int ID=sc.nextInt(); 
		
		String insertsql="update sinformation set sname='"+SNAME+"'where id="+ID;
			
		PreparedStatement pstmt= con.prepareStatement(insertsql);	
		int rowCount= pstmt.executeUpdate();			 
		System.out.println("Rows updated : "+rowCount);	
		con.close();

	}

}
