package Sreejdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Demoinsertvaluesintable {
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());		
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SRIKANTH","shobha144144#");		
		Statement stmt= con.createStatement();
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the name");
		String SNAME=sc.nextLine(); 
		System.out.println("enter id");
		int ID=sc.nextInt(); 
		System.out.println("enter the phone number");
		int PHONE = sc.nextInt();
		System.out.println("enter the salary details");
		int SALARY = sc.nextInt();
			
		String insertsql="insert into sinformation  values("+"'"+SNAME+"',"+ID+","+PHONE+","+SALARY+")";
		System.out.println(insertsql);
		int rowCount= stmt.executeUpdate(insertsql);				 
		System.out.println("Rows updated : "+rowCount);		
		con.close();
	}
}
