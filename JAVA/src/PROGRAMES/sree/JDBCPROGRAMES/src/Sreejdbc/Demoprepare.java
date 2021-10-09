package Sreejdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Demoprepare {
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());		
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SRIKANTH","shobha144144#");
		String insertsql="insert into  sinformation values(?,?,?,?)";
		Scanner sc = new Scanner (System.in);
		System.out.println(" how many records you want");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
		System.out.println("enter the name");
		String SNAME=sc.next(); 
		System.out.println("enter id");
		int ID=sc.nextInt(); 
		System.out.println("enter the phone number");
		int PHONE = sc.nextInt();
		System.out.println("enter the salary details");
		int SALARY = sc.nextInt();
		
		PreparedStatement pstmt= con.prepareStatement(insertsql);	
		pstmt.setString(1,SNAME);
		pstmt.setInt(2,ID );
		pstmt.setInt(3,PHONE );
		pstmt.setInt(4,SALARY );
		int rowCount= pstmt.executeUpdate();			 
		System.out.println("Rows updated : "+rowCount);	
		}
		con.close();
	}	
	}


