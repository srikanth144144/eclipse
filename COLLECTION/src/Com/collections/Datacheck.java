package Com.collections;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Datacheck {
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());		
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SRIKANTH","shobha144144#");		
				Statement stmt= con.createStatement();				
				String sql ="select * from REGBATCH";
							
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the id");
				int a = sc.nextInt();
				ResultSet rs= stmt.executeQuery(sql);
				int n[]= new int[14];
				int count = 0;
				for(int i=0;i<14;i++) {
					rs.next();
				n[i]=rs.getInt(1);
                if(n[i]==a) {
           System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5));
             count++;
           }
          	   }
	      if(count==0) {
		  System.out.println("details not found");
		       }
		  con.close();
   }
}

